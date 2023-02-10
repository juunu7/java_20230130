package day10;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Member {
	private String id = null;
	private String password = null;
	private String name = null;
	private String phone = null;
	private String role = null;  // 이것은 권한 고객 c 또는 판매자 s
	private int age = 0;
	private Date regdate = null;

	
	public Member() {
		super();
	}
	public Member(String id, String password, String name, String phone, String role, Date regdate) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.role = role;
		this.regdate = regdate;
	}
	
	// getter, setter, toString �����ϱ� lombok ����ϱ�

	// �̸��� ���̰� ��ȿ���� Ȯ���ϴ� �޼ҵ� �����(2~4�ڸ� ����)
	public boolean invalidName() {
		if( this.name.length() >= 2 
				&& this.name.length() <=4 ) {
			return true; //�޼ҵ��� ���ᰡ ��. 
		}
		return false;
	}

	
	// �޴��� ��ȣ ���̰� ��Ȯ���� Ȯ���ϴ� �޼ҵ� �����
	public int invalidPhone() {
		if(this.phone.length() == 13) {
			return 1;
		}
		return 0;
	}
	
	
		// ���� ������ C�� S�θ� �Ǿ� �ִ��� Ȯ���ϴ� �޼ҵ�
		public int invalidRole() {
			// ���� Ÿ�� int long
			// Long String ...
			if( this.role.equals("C") 
					|| this.role.equals("S")) {
				return 1;
			}
			return 0; 
		}
		
	//id�� ���̰� 30�� ���� �������� Ȯ���ϴ� �޼ҵ�
	public boolean invalidId() {
		if( this.id.length() <= 30 ) {
			return true;
		}
		return false;
	}

	// ����ó ������ 000-0000-0000�ε� 00000000000���� ��ȯ �ϴ� �޼ҵ�
	public String changePhone() {
		// 000-0000-0000 =>
		// ret[0] => 000
		// ret[1] => 0000
		// ret[2] => 0000
		// ret.length => 3
		String[] ret = this.phone.split("-");
		System.out.println(ret.length);
		System.out.println(ret[0]);
		System.out.println(ret[1]);
		System.out.println(ret[2]);
		
		return ( ret[0]+ret[1]+ret[2] ) ;

	}
}
