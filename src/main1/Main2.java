package main1;

// 정답없음. 해결하면 정답, 짧아야 됨, 수정을 작게 ... 게을러야 됨.
public class Main2 {
	public static void main(String[] args) {
		
		// 배열의 인덱스 0부터...
		// 배열의 위치 0부터 시작해서 4(전체개수의-1)까지
		int i; //반복문 임시변수
		int[] age = {1,2,4,5,12}; //나이 변수가 5개 생성
		//age.length ==> 5가 됨.
		
		for(i=0;i<age.length;i++) {
			System.out.print( age[i]+ " ");
		}
		System.out.println();
		
		// 문제1) age의 값들을 반대로 출력하세요. 12 5 4 2 1
		for(i=age.length-1; i>=0; i--) { //4 3 2 1 0
			System.out.println( age[i]);
		}
		System.out.println();
		
		// 문제2) age의 값들의 합과 평균 구하시오.
		int sum = 0;
		for (i=0;i<age.length; i++ ) {
			sum = sum + age[i];
			}
		System.out.println("합은=" + sum);
		float ave = (float)sum / (float)age.length; //  실수 / 실수
		System.err.println("평균은=" + ave);
		
		// 문제3) age 5개중에서 짝수만 출력하세요.
		for( i=0; i<age.length;i++) {
			if(age[i] % 2 == 0) {
				System.out.println( age[i] + " ");
				
			}
		}
	}
}
