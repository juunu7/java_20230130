package day10;

public class Main {

	public static void main(String[] args) {

		AddressDB aDB = new AddressDBImpl();

		Address address = aDB.selectAddressOne(10004);
		System.out.println(address.toString());

//		Address address = new Address();
//		address.setAddress("부산");
//		address.setPostcode("00000");
//		address.setRegdate( new Date() );
//		
//		Member member = new Member ();
//		member.setId("ccc1");
//		address.setMemberid(member);
//		
//		int ret = aDB.insertAddress(address);
//		System.out.println(ret);

//		// DB연결과 컬렉션 선택된 상황

//		MemberDB mDB = new MemberDBImpl();
//
//		List<Map<String, Object>> list = mDB.selectMemberMapList();
//		for (Map<String, Object> map : list) {
//			System.out.println("아이디 => " + map.get("_id"));
//			System.out.println("암호 => " + map.get("password"));
//			System.out.println("이름 => " + map.get("name"));
//			System.out.println("연락처 => " + map.get("phone"));
//			System.out.println("권한 => " + map.get("_id"));
//			System.out.println("등록일 => " + map.get("regdate"));
//			System.out.println("나이 => " + map.get("age"));
//																			

//		//빈 map 객체를 생성
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("_id", "ccc1");
//		map.put("password", "ccc1");
//		map.put("name", "이름1");
//		map.put("phone", "010");
//		map.put("role", "C");
//		map.put("regdate", new Date());
//		map.put("age", 13);
//		
//		int ret = mDB.insertMemberMap(map);
//		System.out.println(ret);

		// 맵실습이었음 ----------------------------------------------------------
//		// 배열과 다른점 : 순차적으로 데이터가 추가 되지 않음. 
//		// 키를 통해서 데이터 꺼냄
//		// 키는 고유해야 함. 같은 것은 존재할 수 없음.
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("id", "abc");
//		map.put("name", "가나다");
//		map.put("age", 21);
//		map.put("name", "나다라");
//		
//		//------------------------------------------------------
//		String id = (String) map.get("id"); //꺼낸 value가 object이기 때문에 형변환
//		String name = (String) map.get("name");
//		int age = (int) map.get("age");
//		
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(age);
		// 맵실습 ---------------------------------------------------------------------

	}
}
