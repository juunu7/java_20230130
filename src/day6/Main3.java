package day6;

import java.util.Date;

public class Main3 {

	public static void main(String[] args) {

		Date date = new Date();
		// Item item = new Item(3, "주누팍", "축구공", 20000, 10, date);

		Item item = new Item();
		item.setCode(1);
		item.setName("제이팍");
		item.setContent("농구공");
		item.setPrice(30000);
		item.setQuantity(15);

		ItemDB itemdb = new ItemDB();

		// 등록
		// itemdb.insertItem(item);

		// 조회
		// itemdb.printItems();

		// 수정
		// itemdb.updateItem(item);

		// 삭제
		// itemdb.deleteItem(3);

	}

}
