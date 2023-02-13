package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestClient10 {

	private final String URL = "http://1.234.5.158:23000/json/exam10.json";
	private String data = null;

	public RestClient10() {
		try {
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder().url(URL).get().build();
			Response response = client.newCall(request).execute();

			if (response.isSuccessful() == true) {
				this.data = response.body().string().toString();
				System.out.println(this.data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void parseData() {
		JSONObject jobj = new JSONObject (this.data);
		String ret = jobj.getString("ret");
		
		//[{0}, {1}, {2}, {3}, {4}]
		JSONArray jary = jobj.getJSONArray("data");
		for(int i=0; i<jary.length(); i++) {
			// {"id": "id1", "name", 
			JSONObject jobj1 = jary.getJSONObject(i); //1개 꺼내기
			String id = jobj1.getString("id");
			String name = jobj1.getString("name");
			int age = jobj1.getInt("age");

			JSONObject score = jobj1.getJSONObject("score");
			int math = score.getInt("math");
			int eng = score.getInt("eng");
			int kor = score.getInt("kor");
			
			System.out.println(id + "," + name + "," + age + "," + math + "," + eng + "," + kor);
			
			
		
		}

	}

	public List<Score1> parseData1() {
		// 반환 객체 만들기
		List<Score1> list = new ArrayList<Score1>();
		
		JSONObject jobj = new JSONObject(this.data);
		String ret =  jobj.getString("ret");  //y
		JSONArray jary = jobj.getJSONArray("data");
		
		// 실제 저장된 객체에서 Score1객체로 1개씩 복사
		for(int i=0; i<jary.length() ;i++ ) {
			JSONObject jobj1 = jary.getJSONObject(i); //1개꺼내기
			Score1 s1 = new Score1();
			s1.setId(  jobj1.getString("id")  );
			s1.setName( jobj1.getString("name") );
			s1.setAge( jobj1.getInt("age")  );
			
			JSONObject score = jobj1.getJSONObject("score");
			s1.setMath( score.getInt("math")  );
			s1.setEng( score.getInt("eng") );
			s1.setKor(  score.getInt("kor") );
			
			// 반환할 객체에 Score1객체 추가
			list.add(s1);
		}
		
		// 반환하기
		return list;
	}
	
	// 국어점수 합계 구하기
	public int sumKor() {
		int sum = 0; // 합계 구할 변수
		List<Score1> list = this.parseData1();
		System.out.println(list.toString());
		
		for(Score1 s1 : list) {
			System.out.println(s1.toString());
			int n = s1.getKor();
			sum += n;
		}
		
		return sum;
	}
	
	
	
	// 영어 점수 최대값 구하기
	public int maxEng() {
		int max = 0; //초기값을 범위 값보다 작은 것으로	 (0~100)
		int min = 101; //초기값으로 범위 값보다 큰것으로. (0~100)

		List<Score1> list = this.parseData1();

		for(Score1 s1 : list) {
			System.out.println(s1.toString());
			int n = s1.getEng();
			if(max < n) {
				max = n;
			}
			
			if(min > n) {
				min = n;	
			}
		}
		
		return max;
	}	
	
	// 국어, 영어, 수학 합계 구하기
	public int[] sumKorMathEng() {
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		//ret[0], ret[1], ret[2]
		int[] ret = new int [3]; //0국어, 1수학, 2영어
		
		// int[] ret1 = {0, 0, 0};
		
		List<Score1> list = this.parseData1();
		for(Score1 s1 : list) {
			int k = s1.getKor();
			int e = s1.getEng();
			int m = s1.getMath();
			
			ret[0] += k;
			ret[1] += e;
			ret[2] += m;
			
		}
		return ret ;
		//return sum1,sum2,sum3; 불가능
	}
	
	//학생별 총점 구하기. map에는 학생아이디, 총점정보 포함하기
	public List<Map<String, Object>> sumStudent(){
		//점수를 가지고 있음 5개
		List<Score1> list = this.parseData1(); //점수를 가지고 있음 5개
		
		// 1. 반환타입 만들기 (Map은 클래스와 같음.)
		List< Map<String, Object> > retList = new ArrayList<>();
		for(Score1 s1 : list) {
			//2. 반환타입에 포함하는 Map만들기
			Map<String, Object> map = new HashMap<>();
			map.put("id", s1.getId());
			map.put("name", s1.getName());
			map.put("total", s1.getKor() + s1.getEng() + s1.getMath() );
			map.put("avg", (s1.getKor() + s1.getEng() + s1.getMath())/3.0f );
			
			//3. list에 추가하기
			retList.add(map);
			
		}
		//4. 반환한다
		return retList;
		
	}
}
