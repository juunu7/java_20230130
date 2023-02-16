package day14;

import java.util.Date;

import lombok.Data;

@Data
public class Board {

	private long no=0L; 		//글번호 
	private String title="";	//글제목
	private String content="";	//글내용
	private String writer=""; 	//작성자
	private long hit=0L; 		//조회수
	private Date date=null; 	//등록일자
	
}
