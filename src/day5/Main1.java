package day5;

public class Main1 {

	

	public static void main(String[] args) {
		//프로그램이 실행될때 static메소드가 있는 클래스는 자동적으로 1개의 객체를 생성.

		int ret = Calc.sumMul(3, 4);
		System.out.println(ret);
		

		
		// 객체 생성(생성자가 호출됨)
		// Calc calc = new Calc (); // 메모리, 자원 사용
		
		
		
		// int ret = calc.sumMul(3, 4);
		// System.out.println(ret);

		// int ret = calc.sumPlus(1,2);

		// int ret;
		// try {
		// ret = calc.sumMinus(10, 5);
		// System.out.println(ret);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }

		// float ret = calc.sumDiv(10, 0);
		// System.out.println(ret);

		// 필요한 메소드(기능) 호출
		// int ret = calc.sumPlus(3, 4);
		// System.out.println(ret);
	}

}
