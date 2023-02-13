package day11;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestTitanic {

	private final String URL = "https://raw.githubusercontent.com/AISPUBLISHING/dsfs-python/master/titanic.json";
	private String data = null;
	
	public RestTitanic() {
		try {
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder().url(URL).get().build();
			Response response = client.newCall(request).execute();
						
			if(response.isSuccessful() == true) {
				this.data = response.body().string().toString();
				// System.out.println("확인용 = > " + this.data);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Titanic> parseData() {
		List<Titanic> list = new ArrayList<>();
		// [ {0},{},{},{}....{n} ]
		JSONArray jary = new JSONArray(this.data);
		for(int i=0; i<jary.length(); i++) {
			Titanic titanic = new Titanic();
			JSONObject jobj = jary.getJSONObject(i).getJSONObject("fields");
			
			titanic.setFare(jobj.getFloat("fare"));
			titanic.setName(jobj.getString("name"));

			// 데이터가 없을 경우 초기값 세팅
			titanic.setAge(0.0f);
			titanic.setCabin("_");
			titanic.setParch(0);
			titanic.setPclass(0);
			titanic.setSex("_");
			titanic.setSurvived("_");
			titanic.setEmbarked("_");
			titanic.setTicket("_");			
			titanic.setPassengerId(0);				
			titanic.setSibsp(0);
			
			// 데이터가 있으면 데이터 변경
			if (!jobj.isNull("age")) {
				titanic.setAge(jobj.getFloat("age"));
			}
			
			if (!jobj.isNull("cabin")) {
				titanic.setCabin(jobj.getString("cabin"));
			}
			
			if (!jobj.isNull("parch")) {
				titanic.setParch(jobj.getInt("parch"));
			}
			
			if (!jobj.isNull("pclass")) {
				titanic.setPclass(jobj.getInt("pclass"));
			}
			
			if (!jobj.isNull("sex")) {
				titanic.setSex(jobj.getString("sex"));
			}

			if (!jobj.isNull("survived")) {
				titanic.setSurvived(jobj.getString("survived"));
			}
			
			if (!jobj.isNull("embarked")) {
				titanic.setEmbarked(jobj.getString("embarked"));
			}
			
			if (!jobj.isNull("ticket")) {
				titanic.setTicket(jobj.getString("ticket"));
			}
			
			if (!jobj.isNull("passengerId")) {
				titanic.setPassengerId(jobj.getInt("passengerId"));
			}
			
			if (!jobj.isNull("sibsp")) {
				titanic.setSibsp(jobj.getInt("sibsp"));
			}
	
			list.add(titanic);
		}
		return list; 
	}
	
	public void saveMongodDB() {
		
	}
}




