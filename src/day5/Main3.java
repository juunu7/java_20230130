package day5;

import java.util.ArrayList;

public class Main3 {

	public static void main(String[] args) {

		// �迭�� ����Ÿ��, ObjectŸ�� �� ������..
		// Object Ÿ�� �ʱⰪ�� null��
		int[] a     = new int[5]; // 5���������, �ʱⰪ 0
		int[] b     = {1,2,3,4,5}; // 5���������, �ʱⰪ {} ����
		String c[]  = new String[5]; // 5���������, �ʱⰪ null
		Integer d[] = new Integer[5]; // 5�� �������, �ʱⰪ null
		
		// �÷��� �迭�� ������ ��, ���� �迭...
		ArrayList<Integer> e = new ArrayList<Integer>();
		e.add(100);
		e.add(200);
		e.add(300);
		e.add(400);
		
		System.out.println( e.size() );
		e.remove(2);
		System.out.println( e.size() );
		for(int i = 0; i<e.size(); i++) { // 0 1 2
			System.out.println( e.get(i) );
		}
		// ������
		for(int i =e.size()-1; i>=0; i--) {
			System.out.println( e.get(i) );
			
		}
		
	}

}
