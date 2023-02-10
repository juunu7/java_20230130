package day5;

import java.util.Date;
import java.util.Scanner;

import cls.Book;
import day10.Member;

//�Է��� ����ϴ� Ŭ����
public class Input {

	// ����X
	
	private int no = 0;
	private String title = ""; // null, ""
	private String author = "";
	private long price = 0;
	private char cate = 'A';
	
	public static Book inputBookData() {
		// Ű����� �Է¹ޱ�
		Scanner in = new Scanner(System.in);
		System.out.println("���������Է� => ��ȣ,����,����,����,�з�");
		String str = in.nextLine(); // 1,3
		// in.close();
		
		String[] data = str.split(",");
		Book book = null;
		if(data.length == 5) {
			// ����ȯ�� static�޼ҵ�
			int no = Integer.parseInt( data[0] ); // ����ȯ
			String title = data[1];
			String author = data[2];
			long price = Long.parseLong(data[3]); // ����ȯ
			char cate  = data[4].charAt(0); // ����ȯ
			book = new Book( no, title, author, price, cate, new Date() );
		}
		return book;
	}
	
	
	
	public static Member inputData() {
		Scanner in = new Scanner(System.in);
		System.out.println("���������Է� => ���̵�, ��ȣ, �̸�, ����ó, ����");
		// String data = new String("�Է��Ѱ�");
		// String�� �޼ҵ� �߿��� split(), trim()�� �̿���.
		String data = in.nextLine();
		in.close();

		String[] str = data.split(",");
		Member member = null; //���� ��ü�� �ȸ���� ����
		if(str.length == 5) { //�Է��� �׸��� ��Ȯ���� ������ Ȯ����.
			member = new Member( str[0].trim(), 
						str[1].trim(), str[2].trim(),
						str[3].trim(), str[4].trim(), 
						new Date() );
		}
		return member;
	}
	
}

