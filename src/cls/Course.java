package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Course {
	
	private long code = 100000L; // �����ڵ�
	private String name = null;  // �����
	private int credit = 0;      // ����
	private Date date = null;    // �����ͺ��̽��� �ڷᰡ ����Ǵ� ���� ���
	private Professor professor = null; // ����
	
	

}
