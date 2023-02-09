package day9;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		try {
			BoardDAO boardDAO = new BoardDAOImpl ();
			List<Board> list = boardDAO.selectBoardReplyCount(3);
			for(Board board : list) {
				System.out.println("게시글번호 => " + board.getBrdNo() );
				System.out.println("게시글제목 => " + board.getBrdTitle() );
				System.out.println("게시글작성자 => " + board.getBrdContent() );
				System.out.println("게시글조회수 => " + board.getBrdHit() );
				System.out.println("게시글날짜	 => " + board.getBrdDate() );
				System.out.println("답글 개수 => " + board.getReplyCount());
				//System.out.println("답글번호는 => " + board.getReplyNoList().toString());
//				for( Long tmp : board.getReplyNoList() ){
//				System.out.println( tmp );
//			}
			System.out.println("-------------------------");
			}
			
		

//			// 1. 접속, 컬렉션2개 객체 변수보관
//			ReplyDB replyDB = new ReplyDBImpl();
//			Reply reply = new Reply ();
//			reply.setNo(211);
//			reply.setContent("변경내용");
//			reply.setWriter("변경작성자");
//		
//			short ret = replyDB.deleteReply(215);
//			System.out.println(ret);

			
			
			//내부적으로 vector, arraylist 알 필요 없음.
//			ReplyDB replyDB = new ReplyDBImpl();			
//			List<Reply> list = replyDB.selectReplyList( 4 );
//			if(list != null) {
//				for( Reply reply : list ) {
//					if(reply != null) {
//						System.out.println("답글번호 => " + reply.getNo());
//						System.out.println("답글내용 => " + reply.getContent());
//						System.out.println("답글작성자 => " + reply.getWriter());
//						System.out.println("답글일자 => " + reply.getRegdate());
//						System.out.println("---------------------------------");
//					}
//				}
//			}
			
			

			// 답글 1개 가져오기
//			ReplyDB replyDB = new ReplyDBImpl();			
//			Reply reply = replyDB.selectReplyOne(211);
//
//			if (reply != null)
//				System.out.println("답글번호 => " + reply.getNo());
//			System.out.println("답글내용 => " + reply.getContent());
//			System.out.println("답글작성자 => " + reply.getWriter());
//			System.out.println("답글일자 => " + reply.getRegdate());
//			System.out.println("원본게시글정보 => " + reply.getBoard().toString());


			
			
//			// 게시글 추가하기 10개
//			BoardDAO boardDAO = new BoardDAOImpl ();
//			
//			Board board = new Board();
//			for(int i=0;i<10;i++) {
//				board.setBrdTitle("A");
//				board.setBrdContent("B");
//				board.setBrdWriter("c");
//				
//				boardDAO.insertBoard(board);
//			}
			
			
			
			
// 답글작성 시작-----------------------------------------			
//			ReplyDB replyDB = new ReplyDBImpl();
//			Reply reply = new Reply();
//			reply.setContent("sodftf");
//			reply.setWriter("작성자임"); 
//			reply.setRegdate(new Date());
//			
//		 	Board board = new Board (); 
//		 	board.setBrdNo( 10L ); 
//		 	reply.setBoard( board );
//		
//		 	short ret = replyDB.insertReply(reply); 
//		 	System.out.println(ret);
// 답글작성 끝-----------------------------------------			
		 	
		
			} catch (Exception e) {
			e.printStackTrace();
			}
		
	}		
}
