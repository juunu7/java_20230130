package day5;

public class Calc {

	// ����X

	// getter, setter, toString
	// �����ڸ� ������ ������ public Calc() { }
	
	// static ����
	public static int sumMul( int n, int m ) {
		int tmp = n * m;
		return tmp;
	}
	
	
	public int sumMinus( int n, int m ) throws Exception{
		int tmp = n - m;
		return tmp;
	}

	// 2���� ������ ���޵Ǹ� ���ϱ⸦ �ؼ� ��ȯ �޼ҵ�
	public int sumPlus(int n, int m) {
		int sum = n + m;
		return sum;

	}

	public float sumDiv(int n, int m) {
		try {
			float div = (float) n / (float) m; // ����/���� => ����
			return div;
		} 
		catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace(); //������ �߰��� �� �ְ� ���� ����� ��. �����ڸ� ���ؼ�
			return 0.0f;

		}
	}

}
