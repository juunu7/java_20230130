package main2;

import java.util.Date;

import cls.Book;
import cls.BookStore;

public class Main2 {

	public static void main(String[] args) {
		//������ ������. å�� 100�� ������ �� �ִ� �迭����
		BookStore bookStore = new BookStore();
		bookStore.setPhone("051-707-7070");
		bookStore.setAddress("�λ� ����");
		
		// �߰��ϰ��� �ϴ� å�� ����
		Book book = new Book(100, "java", "����", 1230, 'B', new Date() );
		
		// ������ 1���� å ���
		bookStore.insertBook(book);
		bookStore.insertBook(book);
		bookStore.insertBook(book);
		
		bookStore.deleteBook();
		
		// ����1) ������ å�� 2�� �������� ������ ����ϱ�
		
		
		// ������� ��ϵ� å ��ȸ
		bookStore.selectBook();
	}

}
