package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// ������û
@Getter
@Setter
@ToString
public class Register {
	
	private int code = 0;
	private Course course = null; //��û����
	private Student student = null; // �л�
	private Date date = new Date();
	
	//Main4���� ������û�ϱ�(2�� �����ϱ�)

}
