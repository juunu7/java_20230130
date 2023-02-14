package day12;

import java.util.List;

import day11.Titanic;

public class Main {

	public static void main(String[] args) {
		// 객체 생성
		TitanicDB tDB = new TitanicDBImpl();
		Print print = new Print();
//		print.printListAll( tDB.selectTitanicList());
		List<Titanic> list = tDB.selectTitanicList();
		
		
		print.printAgeSurvived(list);
		System.out.println("--------------");
		
		
	}
	

}
		
//		// 메소드 호출 및 결과 받기
//		List<Titanic> list = tDB.selectTitanicList();
//		for(Titanic t : list) {
//			System.out.println(t.getName());
//		}
//		
//		List<Map<String, Object>> list1 = tDB.selectTitanicListMap();
//		for( Map<String, Object> map : list1 ) {
//			System.out.println(map.get("name"));

