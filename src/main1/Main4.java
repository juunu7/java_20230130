package main1;

import java.util.Date;

import cls.Member;

public class Main4 {

	public static void main(String[] args) {
		// 클래스명 객체명 = new 클래스명();
		Member member = new Member();
		member.setUserId("aaa");
		member.setUseAge(13);
		member.setUserEmail("a@a.com");
		member.setUserPw("bbb");
		member.setUserPhone("010-0000-0001");
		// 클래스명 date = new 클래스명 ();
		Date date = new Date();
		member.setUseDate(date);
		
		
		
		
		System.out.println( member.toString() );
		
	}

}
