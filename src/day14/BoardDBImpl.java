package day14;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

public class BoardDBImpl implements BoardDB {
	
	MongoCollection<Document> boards = null;

	@Override
	public int insertBoardOne(Board board) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private Board documentToBoard(Document doc) {
		Board board = new Board();
		board.setNo( doc.getLong("_id") );
		board.setTitle( doc.getString("title") );
		board.setContent( doc.getString("content") );
		board.setWriter( doc.getString("writer") );
		board.setHit( doc.getLong("hit") );
		board.setDate( doc.getDate("date") );
		return board;
		
	}
	
	
	
	
	@Override
	public List<Board> selectBoardList(int page)  {
		try {
			//page 1 => 0
			//page 2 => 10
			//page 3 => 20
			
			Bson sort = Filters.eq("_id", -1);
			boards.find().sort(sort).skip((page-1)*10).limit(10);
			List<Board> list = new ArrayList<>();
			for(Document doc : docs) {
				list.add( documentToBoard(doc) );
			}
			
			return list;
		
		
		}catch (Exception e) {
		e.printStackTrace();
		
		
		
		}
		return null;
	}

	@Override
	public int updateBoardOne(Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Board selectBoardOne(long no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteBoardOne(long no) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
