package main1;

import cls.KorScore;

public class Main7 {
	public static void main(String[] args) {
		// 1. ����ڰ� �Է��� ��
		String[] s1 = {"������", "���ٶ�", "���ٻ�", "������", "Ÿ����"};
		int []   s2 = {20, 99, 70, 98, 100};
		
		//2. KorScoreŬ������ ����ؾ��ϴ� �����͸� ����(setter)
		KorScore obj = new KorScore();
		obj.setStudent(s1);
		obj.setScore(s2);
		
		// 3. ��ü �հ踦 ���ϱ�
		int sum = obj.sumScore();
		System.out.println("�������� =" + sum);
		
		// 4. ���
		
		// 5. �ִ�����
		
		// 6. �ּ�����
		
		// 7. 90�� �̻��� ����� �������
		
		
		// n. Ȯ��
		System.out.println( obj.toString() );
	}

}
