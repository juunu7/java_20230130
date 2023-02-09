package day9;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;

import day8.Config;

public class BoardDAOImpl implements BoardDAO {

	// 아이디:암호@서버주소:포트번호/DB명
	final String URL = "mongodb://id221:pw221@1.234.5.158:37017/db221";

	private MongoCollection<Document> boardColl = null; // boards
	private MongoCollection<Document> seqColl = null; // sequence
	private MongoCollection<Document> replies = null; // sequence

	public BoardDAOImpl() {
		try {
			// 설계도면 객체 = 클래스명.정적메소드()
			// 정적메소드는 객체가 1개만 생성되기 때문에 리소스 낭비가 없음.
			MongoClient client = MongoClients.create(URL);
			if (client != null) {
				this.boardColl = client.getDatabase(Config.DBNAME).getCollection("boards");
				this.seqColl = client.getDatabase(Config.DBNAME).getCollection("sequence");
				this.replies = client.getDatabase(Config.DBNAME).getCollection(Config.REPLYCOL);

				System.out.println("DB접속 성공시점");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("DB접속 실패했음");

		}

	}

	// 글제목, 내용, 작성자 정보만 전달
	// 글번호(시퀀스), 조회수 1, 날짜 현재시간
	@Override
	public int insertBoard(Board board) {
		try {
			// 시퀀스를 이용한 idx값을 받고 idx값을 1증가 시키기
			Bson filter = Filters.eq("_id", "SEQ_BOARD_NO");
			Bson update = Updates.inc("idx", 1);

			// 1을 가져오고 2로바꿔줌
			Document doc = this.seqColl.findOneAndUpdate(filter, update);

			// 받은 idx값으로 글번호를 설정하기
			board.setBrdNo(doc.getLong("idx"));
			board.setBrdHit(100L);
			board.setBrdDate(new Date());

			// Board 타입의 값들을 Document로 복사 하세요.
			Document doc1 = new Document();
			doc1.append("_id", board.getBrdNo());
			doc1.append("title", board.getBrdTitle());
			doc1.append("content", board.getBrdContent());
			doc1.append("writer", board.getBrdWriter());
			doc1.append("hit", board.getBrdHit());
			doc1.append("date", board.getBrdDate());

			InsertOneResult result = this.boardColl.insertOne(doc1);
			System.out.println(result);

			// AcknowledgedInsertOneResult{insertedId=BsonInt64{value=4}}
			if (result.getInsertedId().asInt64().getValue() == board.getBrdNo()) {

			}
			return 0; // 실행은 되었으나 추가하지 못한 경우에 0을 반환
		} catch (Exception e) {
			e.printStackTrace();
			return -1; // 실행되지 못할경우 -1, 치명적 오류, 시스템 오류 등...
		}
	}

	@Override
	public Board selectBoardOne(long no) {
		try {
			Bson filter = Filters.eq("_id", no);
			Document doc = this.boardColl.find(filter).first();
			System.out.println(doc.toString());

			Board board = new Board();
			board.setBrdNo(doc.getLong("_id"));
			board.setBrdTitle(doc.getString("title"));
			board.setBrdContent(doc.getString("content"));
			board.setBrdWriter(doc.getString("writer"));
			board.setBrdHit(doc.getLong("hit"));
			board.setBrdDate(doc.getDate("date"));

			return board;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Board> selectBoardList() {
		// Board타입을 n개 보관할 수 있는 동적배열
		List<Board> list = new ArrayList<Board>();
		try {
			// 글번호를 기준으로 내림차순(-1), 오름차순(1)
			Bson sort = Filters.eq("_id", -1);

			MongoCursor<Document> docs = this.boardColl.find().sort(sort).cursor();
			// 전체 게시글 만큼
			while (docs.hasNext()) { // docs에 꺼낼 요소가 존재하나요?
				Document doc = docs.next(); // 1개 꺼내기(전체 개수 1감소했음)
				Board board = new Board();
				board.setBrdNo(doc.getLong("_id"));
				board.setBrdTitle(doc.getString("title"));
				board.setBrdContent(doc.getString("content"));
				board.setBrdWriter(doc.getString("writer"));
				board.setBrdHit(doc.getLong("hit"));
				board.setBrdDate(doc.getDate("date"));


				
				Bson filter = Filters.eq("board", doc.getLong("_id"));
				//-------------------------------------------- 여기서 글번호를 이용하여 답글개수를 구해서-----------------------------------------------------
				long replyCount = this.replies.countDocuments(Filters.eq("board", doc.getLong("_id")));
				board.setReplyCount(replyCount);

				//게시글을 이용하여 해당 답글의 목록을 받아옴.
				FindIterable<Document> replyDocs = this.replies.find(filter);
				List<Long> replyList = new ArrayList<>();
				for( Document tmp : replyDocs ) { //답글 개수만큼 반복됨.
					replyList.add( tmp.getLong("_id") );
				}
				board.setReplyNoList(replyList);
				
						// Document => Board 복사
				list.add(board);
			}
		} catch (Exception e) {
			// 오류발생처리
			e.printStackTrace();
			list = null;
		} finally {
			// 정상이든 오류든 모두 실행
		}
		return list;
	}

	// 조회수가 hit보다 이하인 것만 조회해서 메인에서 출력하기.
	@Override
	public List<Board> selectBoardHitList(long hit) {

		List<Board> list = new ArrayList<>();

		try {
			Bson filter = Filters.lte("hit", hit);
			MongoCursor<Document> docs = this.boardColl.find(filter).iterator();

			// System.out.println(doc.toString());
			while (docs.hasNext()) {
				Document doc = docs.next(); // 다음 리스트를 넣습니다.

				Board board = new Board();
				board.setBrdNo(doc.getLong("_id"));
				board.setBrdTitle(doc.getString("title"));
				board.setBrdContent(doc.getString("content"));
				board.setBrdWriter(doc.getString("writer"));
				board.setBrdHit(doc.getLong("hit"));
				board.setBrdDate(doc.getDate("date"));
				

				list.add(board);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return list = null;
		}
	}

	// 글번호가 전달되면 1개 삭제하기
	@Override
	public int deleteBoard(long no) {
		try {
			Bson filter = Filters.eq("_id", no);
			DeleteResult result = this.boardColl.deleteOne(filter);
			System.out.println(result.toString());
			if (result.getDeletedCount() == 1L) {
				return 1; // 일치하는 데이터가 있어서 1개를 지움
			}
			return 0; // 일치하는 데이터가 없어서 못 지움
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	// 댓글 수가 n개 이상인 것만 조회
	@Override
	public List<Board> selectBoardReplyCount(int n) {
		try {
			//1. 전체 게시글을 가져옴.
			FindIterable<Document> list = this.boardColl.find();
			
			//2. 반복한다.
			List<Board> retList = new ArrayList<Board>();
					for (Document doc : list) {
				//3. 게시글 번호를 이용해서 답글의 개수를 구한다.
				Bson filter = Filters.eq("board", doc.getLong("_id"));
				
				long replyCount = this.replies.countDocuments(filter);
				if(replyCount >= n) { // 답글의 개수가 전달받은 n보다 크다면
					Board board = new Board(); // board 객체를 만든다.
					board.setBrdNo(doc.getLong("_id"));
					board.setBrdTitle(doc.getString("title"));
					board.setBrdContent(doc.getString("content"));
					board.setBrdWriter(doc.getString("writer"));
					board.setBrdHit(doc.getLong("hit"));
					board.setBrdDate(doc.getDate("date"));
					board.setReplyCount(replyCount);
					retList.add(board); // 리스트에 추가한다.
				}
				
			}
			return retList; //if에 필터된 항목으로 구성된 retList를 반환한다.
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	
	}
	
	
	
	
	

	@Override
	public int updateBoard(Board board) {
		// TODO Auto-generated method stub
		return 0;
	}


}