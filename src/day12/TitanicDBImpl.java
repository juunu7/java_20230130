package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import day11.Titanic;
import day8.Config;

public class TitanicDBImpl implements TitanicDB {
	
	private MongoCollection<Document> titanic = null;

	public TitanicDBImpl() {
		try{
			this.titanic = MongoClients.create( Config.URL )
				.getDatabase( Config.DBNAME )
				.getCollection( Config.TITANICCOL );
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Titanic> selectTitanicList() {
		try {
			Bson sort = Filters.eq("fare", 1);
			
			// 원본 타입
			FindIterable<Document> docs = this.titanic.find().sort(sort);
			
			// 반환 타입
			List<Titanic> list = new ArrayList<>();
			
			// 원본 타입 반복
			for(Document doc : docs) {
				// 반환타입으로 복사
				Titanic titanic = new Titanic();
				
				titanic.setName(doc.getString("name"));
				titanic.setSurvived(doc.getString("survived"));
				titanic.setSex(doc.getString("sex"));
				titanic.setAge(doc.getDouble("age").floatValue()); // double => float
				titanic.setPassengerId(doc.getInteger("passengerid"));
				titanic.setTicket(doc.getString("ticket"));
				titanic.setPclass(doc.getInteger("pclass"));
				titanic.setFare(Float.parseFloat(doc.getDouble("fare").toString())); // double => float
				titanic.setCabin(doc.getString("cabin"));
				titanic.setEmbarked(doc.getString("embarked"));
				titanic.setParch(doc.getInteger("parch"));
				titanic.setSibsp(doc.getInteger("sibsp"));
				// titanic.setRegdate(doc.getDate("regdate"));
				
				// 반환타입에 추가
				list.add(titanic);
			}
			
			// 반환하기
			return list;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Map<String, Object>> selectTitanicListMap() {
		try{
		// Map<String, Object) == Titanic 타입과 같은 기능	
		FindIterable<Document> docs = this.titanic.find().sort(Filters.eq("fare", 1));
		List< Map<String, Object > > list = new ArrayList<>();
		
		
		for(Document doc : docs) {
			//반환타입으로 복사
			Map<String, Object> map = new HashMap<>();
			//map.put(key, value) // key가 변수명 value 값
			map.put("name", doc.getString("name"));
					
					list.add(map);
		}
			return list;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	
	
	
	
	
	@Override
	public List<Titanic> selectTitanicAge(int n) {
		// 891를 가져와서 881개를 버림.
		Bson sort = Filters.eq("age", -1);
		
		// 원본 타입 10개만 가져옴.
		FindIterable<Document> docs 
			= this.titanic.find().sort(sort).limit(n);
		
		// 반환 타입
		List<Titanic> list = new ArrayList<>();
		
		// 원본 타입 반복
		for(Document doc : docs) {
			// 반환타입으로 복사
			Titanic titanic = new Titanic();
			
			titanic.setName(doc.getString("name"));
			titanic.setSurvived(doc.getString("survived"));
			titanic.setSex(doc.getString("sex"));
			titanic.setAge(doc.getDouble("age").floatValue()); // double => float
			titanic.setPassengerId(doc.getInteger("passengerid"));
			titanic.setTicket(doc.getString("ticket"));
			titanic.setPclass(doc.getInteger("pclass"));
			titanic.setFare(Float.parseFloat(doc.getDouble("fare").toString())); // double => float
			titanic.setCabin(doc.getString("cabin"));
			titanic.setEmbarked(doc.getString("embarked"));
			titanic.setParch(doc.getInteger("parch"));
			titanic.setSibsp(doc.getInteger("sibsp"));
			// titanic.setRegdate(doc.getDate("regdate"));
			
			// 반환타입에 추가
			list.add(titanic);
		}
		
		// 반환하기
		return list;

	
	}

}
