package main2;

import java.util.Date;

import cls.Item;

public class Main1 {

	public static void main(String[] args) {
		// �迭 ��ġ��ȣ 0 ���� 4 ����..
		int[] a = new int[5]; // �迭�� 5�� ������. �ʱ�ȭ 0����
		int[] b = { 1,4,5,2,7 }; // �迭�� 5�� ������. 1,4,5,2,7�� ���� ���� �ʱ�ȭ
		
		String str[] = new String[5]; // ���ڿ� �迭 5�� ������. �ʱⰪ null�� ������.
		int i = 0; // �ݺ��� �ӽ� ����
		for(i=0;i<b.length;i++ ) { // 0 1 2 3 4 (5X)
			System.out.print(b[i] + ",");
		}
		
		Item[] items = new Item[5]; // Item �迭�� 5�� ����, �ʱⰪ null�� ��.
		for(i=0; i<items.length; i++) {
			//Ŭ������ ��ü�� = new �����ڸ�Ŭ������();
			Item obj = new Item();
			obj.setNo( i );
			obj.setName( "��ǰ��" + i );
			obj.setContent("��ǰ����" + i);
			obj.setPrice( 1000 + i);
			obj.setQuantity( 100+ i );
			obj.setDate( new Date() ); // ctrl + shift + o
			
			items[i] = obj;
			
		}
		
		for(i=0;i<items.length;i++) {
			System.out.println( items[0].toString() );
		}

	}

}
