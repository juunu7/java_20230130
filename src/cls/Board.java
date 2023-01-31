package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


// 글번호(long) brdNo,
// 글제목(String)brdTitle, 
// 글내용(String) brdContent, 
// 작성자(String) brdWriter, 
// 조회수(long) brdHit, 
// 등록일자(Date) brdDate

@Getter
@Setter
@ToString
public class Board {
	
	private long brdNo=0; //글번호
	private String brdTitle=""; // 글제목
	private String brdContent=""; // 글내용
	private String brdWriter=""; //작성자
	private long brdHit=0L; // 조회수
	private Date brdDate=null; // 등록일자
	
	
	
	
	
	
}
