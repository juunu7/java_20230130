package day12;

import java.util.Iterator;
import java.util.List;

import day11.Titanic;

// 출력하는 곳
public class Print {

	// Q. 전체 목록을 받아서 생존자의 인원수를 구하시오. (for문 사용)
	public void printSurvived(List<Titanic> list) {
		int cnt = 0;
		for (Titanic t : list) {
			if (t.getSurvived().equalsIgnoreCase("yes")) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	// Q. 전체 목록을 받아서 연령대별 인원수를 구하시오. (단 0은 제외, while문 사용)
	// 0.01 ~ 9 어린이
	// 10 ~ 19 10대 => X명
	// 20 ~ 29 20대
	// 30 ~ 39 30대

	public void printAge(List<Titanic> list) {
		int[] cnt = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int i = 0;
		while (i < list.size()) {
			Titanic t = list.get(i);

			if (t.getAge() > 0) {
				int n = (int) t.getAge() / 10; // 0.01~9 => 0, 10~19 => 1, 20~29 => 2
				cnt[n]++;
			}
			i++;
		}
		for (i = 0; i < cnt.length; i++) {
			System.out.println(i + "대 => " + cnt[i]);
		}

	}

	// Q. 전체 목록에서 티켓등급(pclass) 값의 종류별 개수를 구하시오.(종류는 1,2,3)
	public int[] printPClass(List<Titanic> list) {
		int[] cnt = { 0, 0, 0, 0 };
		for (Titanic t : list) {
			int n = t.getPclass();
			cnt[n]++;

		}
		// cnt[0]은 사용안함. cnt[1]에는 1의 개수, cnt[2]에는 2의 개수, cnt[3]에는 3의 개수
		return cnt;

	}

	// Q. 전체 목록에서 운임요금(fare) 30보다 큰 것만 fare와 name으로 출력. (단, 소수점을 올림하여 정수로 표시)
	public void printFare(List<Titanic> list) {
		for (Titanic t : list) {
			// 올림하기 Math.ceil(1.1232)
			if (t.getFare() > 30) {
				System.out.println(Math.ceil(t.getFare()));
				System.out.println(t.getName());
			}
		}

	}

	// Q. 전체 목록에서 이름(name)의 Mr. Miss. Mrs. 를 각각 포함하는 인원수를 구하시오.
	public void printName(List<Titanic> list) {
		int cnt[] = new int[3];
		for (Titanic t : list) {
			if (t.getName().contains("Mr.")) {
				cnt[0]++;
			} else if (t.getName().contains("Miss.")) {
				cnt[1]++;
			} else if (t.getName().contains("Mrs.")) {
				cnt[2]++;
			}
		}

	}

	// 연령대별 생존자수 구하기 (전체인원 891명, 비율은 소수점으로 표시)
	public void printAgeSurvived(List<Titanic> list) {
		// 1. 남여 인원수 구하기
		// 2. 남여 생존자수 구하기
		// 0.01 ~ 9까지, 연령대별 인원수를 구하고
		// 생존자수 / 전체인원 * 100
		int cnt1[] = { 0, 0 }; // 인원수 보관 cnt1[0] 남자수, cnt1[1] 여자수
		int cnt2[] = { 0, 0 }; // 생존자수 보관 cnt2[0] 남자의 생존자 수, cnt2[1] 여자의 생존자 수

		for (Titanic t : list) {
			if (t.getSex().equals("male")) {
				cnt1[0]++;
				if (t.getSurvived().equalsIgnoreCase("yes")) {
					cnt2[0]++;
				}
			} else if (t.getSex().equals("female")) {
				cnt1[1]++;
				if (t.getSurvived().equalsIgnoreCase("yes")) {
					cnt2[1]++;
				}
			}
		}
		System.out.println((float) cnt2[0] / (float) cnt1[0] * 100);
		System.out.println((float) cnt2[1] / (float) cnt1[1] * 100);
	}


	// 성별 생존자수 구하기 (전체인원 891명, 비율은 소수점으로 표시)
	public void printSexSurvived(List<Titanic> list) {

	}

	// 티켓 등급별 생존자수 구하기 (전체인원 891명, 비율은 소수점으로 표시)
	public void printPClassSurvived(List<Titanic> list) {

	}

	// ------------------for 문 사용
	public void printListAll(List<Titanic> list) {
		for (Titanic t : list) {
			System.out.println(t.getName());

		}

		// 위치를 알 수 있음.
		for (int i = 0; i < list.size(); i++) {
			Titanic t = list.get(i);
			System.out.println(t.getName());
		}
	}

	// ------------------while 문을 이용해서 출력
	public void printListAll1(List<Titanic> list) {
		// List 타입을 반복자(Iterator)로 변환하기
		Iterator<Titanic> cursor = list.iterator();
		while (cursor.hasNext()) {
			Titanic c = cursor.next();

		}

		int i = 0; // 초기값
		while (i < list.size()) { // 조건
			Titanic c = list.get(i);
			System.out.println(c.getName());
			i++; // 증가값
		}

	}

	// --------------------do-while문 이용해서 출력
	public void printListAll2(List<Titanic> list) {
		int i = 0; // 초기값
		do {
			Titanic c = list.get(i);
			System.out.println(c.getName());
			i++; // 증가값

		} while (i < list.size()); // 조건

	}

}
