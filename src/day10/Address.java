package day10;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {
	private long code = 0L;
	private String address = null;
	private String postcode = null;
	private Date regdate = new Date();
	private Member memberid = null;

	public Address() {
		super();
	}

	public Address(long code, String address, String postcode, Date regdate, Member memberid) {
		super();
		this.code = code;
		this.address = address;
		this.postcode = postcode;
		this.regdate = regdate;
		this.memberid = memberid;
	}

	// �ڵ�� 1000~9999 �������� Ȯ��
	public boolean code() {
		if (1000 <= this.code && this.code <= 9999) {
			return true;
		}
		return false;

	}

	// �ּҴ� 100�̸����� Ȯ��
	public boolean invalideAddress() {
		// String
		if (this.address.length() < 100) {
			return true;
		}
		return false;
	}

	// �����ȣ�� 5�ڸ����� Ȯ���ϴ� �޼ҵ�
	public boolean invalidPostcode() {
		if (this.postcode.length() == 5) {
			return true;
		}
		return false;
	}

	// ��¥���� �⸸ ��ȯ�ϱ�(���ڷ�)
	public String getYear() {
		SimpleDateFormat obj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = obj.format(this.regdate);

		// 2023-02-02 12:33:18
		System.out.println(str);
		return str.substring(0, 4); // 0123 => 2023
	}

	// ��¥���� ���� ��ȯ�ϱ�(���ڷ�)

	// ��¥���� �ϸ� ��ȯ�ϱ�(���ڷ�)

}
