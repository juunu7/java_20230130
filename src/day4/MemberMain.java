package day4;

import java.util.Date;

import day10.Member;

public class MemberMain {
	public static void main(String[] args) {
		// 1. 객체 생성 (값 세팅)
		// 클래스명 소문자클래명 = new 생성자명();
		Member member = new Member("id", "pw", "가나더", "010-0000-0001", "C", new Date());
		
		System.out.println( member.toString()  );
		
		// boolean result = member.invalidName();
		// System.out.println(result);
		
		// int result1 = member.invalidPhone();
		// System.out.println(result1);
		
		String ret = member.changePhone();
		System.out.println(ret);
	}
}


		
		// 현재 클래스 가지고 있는 값을 확인
		System.out.println( member.toString() );
		
		// 2. 세팅된 이름값이 유효한지 확인하기
		boolean result = member .invalidName();
		System.out.println(result);
		
		boolean result1 = member.invalidPhone();
		System.out.println(result1);
		
		
		// 3. 
		Member member = new Member();
		member.setName("홍길동"); //name
		member.setPhone("010-1234-5678"); //phone
		member.setRole("c");//role
		member.setId("Jpark");//id
		
		//member객체에서 나온 결과값 받아서 넣는 변수
		boolean nameRet = member.invalidName();//이름 길이 유효성 체크
		boolean phoneRet = member.invalidPhone ();//번호, 길이
		boolean roleRet = member.invalidrole ();//고객, 판매자
		
		
		
		//member객체 결과값을 받은 변수 출력
		System.out.println("nameret", "nameret");
	
		
	}

}
