package day5;

public class Main2 {

	public static void main(String[] args) {
		// Ŭ������ ��ü�� = new �����ڸ�();
		// ���ʸ� Ŭ������ Ÿ���� ����Ÿ���� �Ұ���!!
		Exam<Integer> obj1 = new Exam<Integer>();
		obj1.setElement(13); //13�� �߰���
		int ret = obj1.getElement(); //13 ��������
		System.out.println(ret);
		
		
		
		Exam<String> obj = new Exam<String>();
		obj.setElement("aaa");
		String str = obj.getElement();
		System.out.println(str);
	}

}
