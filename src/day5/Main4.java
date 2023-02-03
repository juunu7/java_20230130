package day5;

import day4.Member;

// 메인은 테스트용, 입력(X) 출력(X), 특정클래스
public class Main4 {
	public static void main(String[] args) {
		// 콘솔에서 입력한 항목을 기반으로 Member 타입으로 반환해 주세요.

		// Member member = Input.inputData();
		// DB에서 조회하기
		// Output.printMember(member);
		
		Output.printMember( Input.inputData() );
		// System.out.println(member.toString());
	}
}
