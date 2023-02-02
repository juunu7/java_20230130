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
	
	
	// 수량이 n개 미만이면 n개로 변경하는 메소드
	public int nQuantity(int i) {
		if(this.quantity < i) {
			this.quantity = i;
			
		}
		return this.quantity;
	}
	
	
	// 가격에 할인율 만큼 빼서 리턴하는 메소드
	public int discountprice(float per) {
		int result1 = (int)(this.price - (this.price*per));
		this.setPrice(result1);
		return result1;
	}
	
	// 총 판매금액을 리턴하는 메소드 (가격*수량)
	public int totalPrice() {
		return (this.price * this.quantity);
	}
	
	// 물품설명이 20자 이상이면 ...으로 변환하는 메소드
	public String over20() {
		if (this.content.length()>=20) {
			return (this.content.substring(0, 20)+ "...");
					
		}
		return this.content;
	}
	
	// 이름을 뒤집어서 반환하는 메소드
	// 123 => 321
	public String revName() {
		//가나다 => 다 나 가 (0 1 2) 3 
		int i= 0;
		String ret = ""; //문자를 누적할 변수
		for(i=this.name.length()-1; i>=0; i--) {
			char tmp = this.name.charAt(i);
			ret = ret + tmp;
		}
			return ret;
	}
	
	

}
