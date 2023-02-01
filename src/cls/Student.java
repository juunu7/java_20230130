package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
	
	private int no = 0; //�й�
	private String name = null; //�̸�
	private int grade = 1; //�г�
	private Date date = null; //�������
	
	//������
	public Student() {
		super();
	}
	
	
    //������
	public Student(int no, String name, int grade, Date date) {
		super();
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.date = date;
	}
	
	// �г��� 1�� ������Ű�� (4�г� ������)
	public void plusGrade() {
		this.grade++; // 1 ������Ű��
		if(this.grade > 4) { //4���� ũ��
			this.grade = 4; //4�� �����
		}
	}
}
