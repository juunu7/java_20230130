package day5;

import java.util.ArrayList;

import cls.Book;

public class Main6 {

	public static void main(String[] args) {
		
		// å�� ������ ���� ���� ���� �迭
		ArrayList<Book> list = new ArrayList<Book>();
		for(int i=0;i<3;i++) {
			Book book = Input.inputBookData();
			list.add(book);
			
		}
		// System.out.println(list.toString());
		Output. printBookList( list );
		
		//
	}

}
