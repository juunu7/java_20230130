package day4;

import java.util.Date;

import day10.Address;
import day10.Member;

public class AddressMain {

	public static void main(String[] args) {
		
		Member member = new Member ("id", "pw", "가나더", "010-0000-0001", "C", new Date() );
		
		Address address = new Address(1000, "부산", "12345", new Date(), member );
		
		System.out.println(address.toString());
		address.getYear();
		
		
		

	}

}
