package day13;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;

import day8.Config;

public class ItemDBImpl implements ItemDB {

	private MongoCollection<Document> sequence = null;
	private MongoCollection<Document> items = null;

	public ItemDBImpl() {
		try {
			this.sequence = MongoClients.create(Config.URL).getDatabase(Config.DBNAME)
					.getCollection(Config.RESEQUNCECOL);
			this.items = MongoClients.create(Config.URL).getDatabase(Config.DBNAME).getCollection(Config.ITEMCOL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 전체 조회 (정렬기준 물품번호를 내림차순으로)
	@Override
	public List<Map<String, Object>> selectItemListMap(int n) {
		try {
			Bson sort = Filters.eq("_id", -1);

			FindIterable<Document> docs = this.items.find().sort(sort).limit(n);

			List<Map<String, Object>> list = new ArrayList<>();
			for (Document doc : docs) {
				Map<String, Object> map = new HashMap<>();
				// doc를 map으로 변환하기
				map.put("_id", doc.getLong("_id"));
				map.put("name", doc.getString("name"));
				map.put("content", doc.getString("content"));
				map.put("price", doc.getInteger("price"));
				map.put("quantity", doc.getInteger("quantity"));
				map.put("regdate", doc.getDate("regdate"));

				list.add(map);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	//
	@Override
	public int insertItemMap(Map<String, Object> map) {
		try {
			Bson filter = Filters.eq("_id", "SEQ_ITEM_CODE");
			Bson update = Updates.inc("idx", 1);
			Document doc = this.sequence.findOneAndUpdate(filter, update);
			long itemCode = doc.getLong("idx");

			Document saveDoc = new Document();
			saveDoc.append("_id", itemCode); // 시퀀스에서 꺼낸값
			// saveDoc.append("_id", map.get("_id"));
			saveDoc.append("name", map.get("name"));
			saveDoc.append("content", map.get("content"));
			saveDoc.append("price", map.get("price"));
			saveDoc.append("quantity", map.get("quantity"));
			saveDoc.append("regdate", new Date());

			InsertOneResult result = this.items.insertOne(saveDoc);
			if (result.getInsertedId().asInt64().getValue() == itemCode) {
				return 1;
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public int deleteItemOne(long no) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteItemMany(long[] no) {
		try {
			// 조건 1개에 n개를 지움
			// 조건 n개에 n개를 지움을 원함 우리는

			// long[] no = {1,2,5,6};
			for (int i = 0; i < no.length; i++) {
				Bson filter = Filters.eq("_id", no[i]);
				DeleteResult result = this.items.deleteOne(filter);
				int cnt = 0;
				cnt += result.getDeletedCount(); // cnt에 삭제시 1개씩 더하기
			}
			// 삭제한 개수 == 배열의 개수
			int cnt = 0;
			if (cnt == no.length){
			
				return 1;

			}
			return 0;

		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	@Override
	public List<Item> selectItemList(int n) {
		try {
		Bson sort = Filters.eq("_id", 1);
		
		// 원본 타입
		FindIterable<Document> docs = this.items.find().sort(sort);
		
		// 반환 타입
		List<Item> list = new ArrayList<>();
		
		// 원본 타입 반복
		for(Document doc : docs) {
			// 반환타입으로 복사
			Item item = new Item() ;
			
			item.setNo( doc.getLong("_id"));
			item.setName(doc.getString("name"));
			item.setContent(doc.getString("content"));
			item.setPrice(doc.getInteger("price")); // double => float
			item.setQuantity(doc.getInteger("quantity"));
			item.setRegdate(doc.getDate("regdate"));
			// 반환타입에 추가
			list.add(item);
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
	public int updateItemOne(Item item) {
		// TODO Auto-generated method stub
		return 0;
	}
}
