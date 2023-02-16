package day14;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		// MongoClient db = MongoClients.create();
		//DBConn db = DBConn.getInstance();
		
		//아래설명 - DB객체 생성
		MemberDB mDB = new MemberDBImpl();
		
//		//회원가입할 임의의 데이터 생성
//		//아이디는 현재 DB에 없는 것만 가능
//		Member m = new Member();
//		m.setId("aaaa1123");
//		
//		int ret = mDB.memberJoin(m);
//		System.out.println(ret);
		
		Map<String, Object> map = new HashMap<>();
		map.put("_id", "a1");
		map.put("password", "a1");
		
		Member member = mDB.memberLogin(map);
		if(member == null) {
			System.out.println("아이디 또는 암호가 틀립니다.");
		}
		else {
			System.out.println(member.getName()+ "님 로그인 ");
		}
		
		
		
		
	}

}
