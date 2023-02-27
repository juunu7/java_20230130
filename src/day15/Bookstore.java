package day15;

import java.util.ArrayList;
import java.util.List;

import day8.Book;
import lombok.Data;

//타입
@Data
public class Bookstore {
	private String phone;
	private String address;
	private List<Book> list = new ArrayList<>();
	
	// 책 추가
	public int addBook( Book book ) {
		try {
		list.add(book);
		return 1;
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		
		
	}
	
	// 책 삭제
	public int removeBook( Book book ) {
		try {
			list.remove(book);
			return 1;
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		
	}
	// 책제목이 포함된 것 검색
	public List<Book> searchBook(String title){
		for() {
			if() { //전체 데이터에서 필요한 필터
				// 필요한 것만 출력, 반환해야 될 수도 있음.
				
			}
		}
		return ??; // 반환
			
		}
		
		
	// 가격보다 큰 것만 검색
	public List<Book> searchBokkPrice (long price){
		for() {
			if() {
		}
		
	}
		return ??;
	}
	
}

