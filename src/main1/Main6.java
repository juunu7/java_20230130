package main1;

import java.util.Date;

import cls.Item;

public class Main6 {

	public static void main(String[] args) {
		// 1. ��ǰ��� 
		Item obj = new Item();
		obj.setNo(100L);
		obj.setName("���");
		obj.setContent("��ŭ��");
		obj.setPrice(10000);
		obj.setQuantity(56);
		obj.setDate( new Date() ); //ctrl +shift + o
		
		// 2. 20% ������ �ݾ����� �ڵ���� �� �� �ִ� ���
		obj.disountPrice(0.2f);
		
		// 3. �������� 100�� �̸��̸� 1000���� �����Ű�� ���
		obj.checkQuantity(100);
		
		
				
		// 4. ��ǰ������ Ȯ��		
		System.out.println( obj.toString() ); // ���� ����� ����Ȯ��
	}

}
