package day11;

import lombok.Data;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Data

public class Titanic {
	private String survived = "_"; // 생존여부 0 = No, 1 = Yes
	private int pclass = 0; // 티켓 등급 1 = 1st, 2 = 2nd, 3 = 3rd
	private String sex = "_"; // 성별
	private float Age = 0.0F; // 나이
	private int sibsp = 0; // 타이타닉에 탑승한 형제/자매 수
	private int parch = 0; // 타이타닉에 탑승한 부모/자녀 수
	private String ticket = "_"; // 티켓번호
	private float fare = 0.0F; // 운임(티켓요금)
	private String cabin = "_"; // 객실 번호
	private String embarked = "_"; // 탑승한 곳(항구) C = Cherbourg, Q = Queenstown, S = Southampton
	private String name = "_";
	private int passengerId = 0;
}
