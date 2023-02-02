package day4;



import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Item {
	private long code = 0;
	private String name = null;
	private String content = null;
	private int price = 0;
	private int quantity = 0;
	private Date date = new Date();
	private Member memberid = null;

	public Item() {

	}
	
	public Item(long code, String name, String content, int price, int quantity, Member memberid) {
		super();
		this.code = code;
		this.name = name;
		this.content = content;
		this.price = price;
		this.quantity = quantity;
		this.memberid = memberid;
	}
	
	
	// ������ n�� �̸��̸� n���� �����ϴ� �޼ҵ�
	public int nQuantity(int i) {
		if(this.quantity < i) {
			this.quantity = i;
			
		}
		return this.quantity;
	}
	
	
	// ���ݿ� ������ ��ŭ ���� �����ϴ� �޼ҵ�
	public int discountprice(float per) {
		int result1 = (int)(this.price - (this.price*per));
		this.setPrice(result1);
		return result1;
	}
	
	// �� �Ǹűݾ��� �����ϴ� �޼ҵ� (����*����)
	public int totalPrice() {
		return (this.price * this.quantity);
	}
	
	// ��ǰ������ 20�� �̻��̸� ...���� ��ȯ�ϴ� �޼ҵ�
	public String over20() {
		if (this.content.length()>=20) {
			return (this.content.substring(0, 20)+ "...");
					
		}
		return this.content;
	}
	
	// �̸��� ����� ��ȯ�ϴ� �޼ҵ�
	// 123 => 321
	public String revName() {
		//������ => �� �� �� (0 1 2) 3 
		int i= 0;
		String ret = ""; //���ڸ� ������ ����
		for(i=this.name.length()-1; i>=0; i--) {
			char tmp = this.name.charAt(i);
			ret = ret + tmp;
		}
			return ret;
	}
	
	

}
