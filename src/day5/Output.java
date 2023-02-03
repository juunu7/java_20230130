package day5;

import java.util.ArrayList;

import cls.Book;
import day4.Member;

// ����� ����ϴ� Ŭ����
public class Output {

	// ���� X
	// 0 1 2
	public static void printBookList ( ArrayList<Book> list) {
		for(int i=0;i<list.size(); i++) {
			Book oneBook = list.get(i);
			printBook(oneBook);
		}
		
	}
	
	public static void printBook( Book book) {
		System.out.println("========å����=============");
		System.out.println( "å��ȣ�� " + book.getNo() );
		System.out.println( "������ " + book.getTitle() );
		System.out.println( "������ " + book.getPrice() );
		System.out.println( "���ڴ� " + book.getAuthor() );
		System.out.println( "�з��� " + book.getCate() );
		System.out.println( "�������ڴ� " + book.getDate() );
		System.out.println("==========================");
	}
	
	public static void printMember( Member member) {
		System.out.println("========��������=============");
		System.out.println( "���̵�� " + member.getId() );
		System.out.println( "��ȣ�� " + member.getPassword() );
		System.out.println( "�̸��� " + member.getName() );
		System.out.println( "����ó�� " + member.getPhone() );
		System.out.println( "������ " + member.getRole() );
		System.out.println( "�������ڴ� " + member.getRegdate() );
		System.out.println("==========================");
	}
	
}


