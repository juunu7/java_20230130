package day14;

import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

import day8.Config;

public class MemberDBImpl implements MemberDB {

	MongoCollection<Document> members = null;

	public MemberDBImpl() {
		members = DBConn.getInstance().getCollection(Config.MEMBERCOL);

	}

	@Override
	public int memberJoin(Member member) {
		try {
			Document doc = new Document();
			doc.append("_id", member.getId());
			doc.append("password", member.getPassword());
			doc.append("name", member.getName());
			doc.append("phone", member.getPhone());
			doc.append("role", member.getRole());
			doc.append("age", member.getAge());
			doc.append("regdate", member.getRegdate());

			InsertOneResult result = this.collection.insertOne(doc);
			System.out.println(result.toString());
			return 1;

			return 0;

		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	// 1. 아이디를 이용해서 정보를 가져옴. 아이디와 암호가 일치하는 확인후에 반환
	// 2. 아이디, 암호를 and 필터를 이용해서 조회
	@Override
	public Member memberLogin(Map<String, Object> map) {
		try {
			String id = (String) map.get("_id");
			String pw = (String) map.get("password");

			Bson filter = Filters.eq("_id", id);
			Document doc = this.members.find(filter).first();

			if (doc.getString("_id").equals(id) && doc.getString("password").equals(pw)) {

			}
			return null;

		} catch (Exception e) {
			return null;
		}
	}

//Document to Member 타입으로 변환하는 메소드
	private Member documentToMember(Document doc) {
		Member member = new Member();
		Member.setId(doc.getString("_id"));
		Member.setPassword(doc.getString("password"));
		Member.setName(doc.getString("name"));
		Member.setPhone(doc.getString("phone"));
		Member.setRole(doc.getString("role"));
		Member.setAge(doc.getInteger("age"));
		Member.setRegdate(doc.getDate("date"));
		return member;

	@Override
	public Member memberSelectOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int memberUpdateOne(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberUpdatePwOne(Map<String, Object> map) {
	try {
		String id = (String)map.get("_id"); //현재 아이디
		//String pw = (String)map.get("password"); //현재 아이디
		String pw1 = (String)map.get("password1"); //현재 아이디
		
		// Filters.and()
		Member member = this.memberLogin(map);
		if(member != null) {
			//비밀번호변경
			Bson filter = Filters.eq("-id", id);
			Bson update = Updates.set("password", pw1);
			UpdateResult ret = this.members.updateOne(filter, update);
			
			if(ret.getModifiedCount() == 1L) {
			return 1;
		}
		}
		return 0;
		
	}catch (Exception e) {
		e.printStackTrace();
		return -1;
	}
		return 0;
	}

	@Override
	public int memberDeleteOne(String id) {
		try {
			Bson filter = Filters.eq("_id", id);
			DeleteResult result = this.collection.deleteOne(filter);
			System.out.println(result.toString());
			if (result.getDeletedCount() == 1L) {
				return 1; // 일치하는게 있어서 1개를 지움
			}
			return 0; // 일치하는게 없어서 못지움

		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		return 0;
	}

}
