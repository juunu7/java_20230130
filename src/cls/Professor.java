package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Professor {
	private int code = 0; //�����ڵ�
	private String name = null; // ������
	private String room = null; // ������(303ȣ)
	private Date date = null; // �������
	
	public Professor() {
		super();
	}

	public Professor(int code, String name, String room, Date date) {
		super();
		this.code = code;
		this.name = name;
		this.room = room;
		this.date = date;
	}
	
}
