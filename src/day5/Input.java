package day5;

import java.util.Date;
import java.util.Scanner;

import cls.Book;
import day10.Member;

//입력을 담당하는 클래스
public class Input {

	// 변수X
	
	private int no = 0;
	private String title = ""; // null, ""
	private String author = "";
	private long price = 0;
	private char cate = 'A';
	
	public static Book inputBookData() {
		// 키보드로 입력받기
		Scanner in = new Scanner(System.in);
		System.out.println("가입정보입력 => 번호,제목,저자,가격,분류");
		String str = in.nextLine(); // 1,3
		// in.close();
		
		String[] data = str.split(",");
		Book book = null;
		if(data.length == 5) {
			// 형변환은 static메소드
			int no = Integer.parseInt( data[0] ); // 형변환
			String title = data[1];
			String author = data[2];
			long price = Long.parseLong(data[3]); // 형변환
			char cate  = data[4].charAt(0); // 형변환
			book = new Book( no, title, author, price, cate, new Date() );
		}
		return book;
	}
	
	
	
	public static Member inputData() {
		Scanner in = new Scanner(System.in);
		System.out.println("가입정보입력 => 아이디, 암호, 이름, 연락처, 권한");
		// String data = new String("입력한값");
		// String의 메소드 중에서 split(), trim()을 이용함.
		String data = in.nextLine();
		in.close();

		String[] str = data.split(",");
		Member member = null; //아직 객체가 안만들어 졌음
		if(str.length == 5) { //입력한 항목이 정확한지 개수로 확인함.
			member = new Member( str[0].trim(), 
						str[1].trim(), str[2].trim(),
						str[3].trim(), str[4].trim(), 
						new Date() );
		}
		return member;
	}
	
}

