package day5;

import cls.Book;

public class Main5 {

	public static void main(String[] args) {
		// Input Ŭ������ static inputBooData()�� ȣ���ؼ� Ű����� �Է¹��� �� BookŸ������ �ޱ�
		Book book = Input.inputBookData();
		
		// ������ ���� BookŸ���� Output Ŭ������ PrintBook() �޼ҵ�� �����Ͽ� ���
		Output.printBook(book);
		
	}

}
