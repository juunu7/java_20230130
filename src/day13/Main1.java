package day13;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		ItemDB iDB = new ItemDBImpl();

//		long no[] = { 1024, 1019 };
//		int ret = iDB.deleteItemMany(no);
//		System.out.println(ret);

		List<Item> list = iDB.selectItemList(100);

		// 문제) 가격대별 수량 구하기
		// 1 ~ 999 => 1개
		// 1000 ~ 9999 => 1개
		// 10000 ~ 99999 => 1개
		// 100000원 이상 => 1개

//		int[] cnt = new int[4];
//
//		for (Item item : list) {
//			if (item.getPrice() >= 1 && item.getPrice() <= 999) {
//				cnt[0]++;
//			} else if (item.getPrice() >= 1000 && item.getPrice() <= 9999) {
//				cnt[1]++;
//			} else if (item.getPrice() >= 10000 && item.getPrice() <= 99999) {
//				cnt[2]++;
//			} else
//				cnt[3]++;
//		}

//		for(int i = 0; i<cnt.length; i++) {
//			//System.out.println("1~" + );
//			System.out.println(cnt[i]);

//		for (Item item : list)
//		System.out.println(item.getNo);
//		System.out.println(item.getName());
//		System.out.println("--------------------------");	

		// 문제2) 시간대별 재고수량 합계 (Date to String 으로 변환)
		// 0시 => 1개
		// 1시 => 2개
		// 2시 => 1개
		// ~~~
		// 23시 => 1개
		// int n = new Date().getHours();

//		Calendar c = Calendar.getInstance();
//		c.setTime(new Date());
//		int n = c.get(Calendar.HOUR);
//		System.out.println(n);

		// 문제3 재고수량이 1000이상인 것만 가져와서 3자리마다 콤마를 넣어서 출력
		// ex) 물품번호, 이름, 가격, 재고수량
		// 1001, 가나다, 300, 12, 343, 343

//		int a = 12345678; // 숫자
		
		int i = 0;


		while (i < list.size()) {
			Item item = list.get(i);
			DecimalFormat df = new DecimalFormat("###,###"); // 문자변경전 포멧
			String s = df.format(item.getQuantity()); // 숫자 -> 문자로 변경 포멧
			
			if (item.getQuantity() >= 1000) {
				System.out.println("물펌번호 => " + item.getNo());
				System.out.println("이름 => " + item.getName());
				System.out.println("가격 => " + item.getPrice());
				System.out.println("재고수량 => " + s);

			}
			i++;
		}

	}

}
