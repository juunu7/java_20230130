package day15;

import cls.BookStore;

public class Main {
	
	public static void main(String[] args) {
		
		BookStore bookStore = new BookStore() ;
		
		Book book = new Book();
		book.setCode(1);
		bookStore.addBook(book);
		
		
//		Print print = new Print();
//		
//		List<Book> list = new ArrayList<>();
//		for (int i=0; i<3; i++) {
//			Book book = new Book();
//			book.setCode(i+1);
//			book.setTitle("aaa");
//			book.setPrice(1200);
//			book.setAuthor("저자");
//			list.add(book);
//		}
//		print.printBook(list);
		
//		//문제1)
//		print.gugudan(3);
//		
//		//문제2)
//		List<Long> list = new ArrayList<>();
//		list.add(1L);
//		list.add(2L);
//		list.add(3L);
//		long t = print.sum(list);
//		System.out.println(t);
//		
//		//문제3)
//		List<Double> list1 = new ArrayList<>();
//		list1.add(1.2d);
//		list1.add(2.2d);
//		Map<String, Object>
//		map = print.sumAvg(list1);
//		
//		System.out.println(map.get("sum111"));
//		System.out.println(map.get("avg222"));
		
		
	}

}
