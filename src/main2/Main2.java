package main2;

import java.util.Date;

import cls.Book;
import cls.BookStore;

public class Main2 {

	public static void main(String[] args) {
		//서점이 생성됨. 책을 100권 보관할 수 있는 배열생성
		BookStore bookStore = new BookStore();
		bookStore.setPhone("051-707-7070");
		bookStore.setAddress("부산 남구");
		
		// 추가하고자 하는 책을 생성
		Book book = new Book(100, "java", "저자", 1230, 'B', new Date() );
		
		// 서점에 1권의 책 등록
		bookStore.insertBook(book);
		bookStore.insertBook(book);
		bookStore.insertBook(book);
		
		bookStore.deleteBook();
		
		// 문제1) 임의의 책을 2권 생성한후 서점에 등록하기
		
		
		// 현재까지 등록된 책 조회
		bookStore.selectBook();
	}

}
