package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


// �۹�ȣ(long) brdNo,
// ������(String)brdTitle, 
// �۳���(String) brdContent, 
// �ۼ���(String) brdWriter, 
// ��ȸ��(long) brdHit, 
// �������(Date) brdDate

@Getter
@Setter
@ToString
public class Board {
	
	private long brdNo=0; //�۹�ȣ
	private String brdTitle=""; // ������
	private String brdContent=""; // �۳���
	private String brdWriter=""; //�ۼ���
	private long brdHit=0L; // ��ȸ��
	private Date brdDate=null; // �������
	
	
	
	
	
	
}
