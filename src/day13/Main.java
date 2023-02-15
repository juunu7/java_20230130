package day13;

import java.util.Scanner;

import org.json.JSONObject;

public class Main {
   public static void main(String[] args) {
      try{ 
         ChatClient chat = new ChatClient();// 서버접속
         chat.setSubscribe(); // 구독설정

         Scanner scanner = new Scanner(System.in);
         while(true) { //무한 반복
            System.out.print("보낼 메시지 입력 =>");
            String msg = scanner.nextLine();
            if(msg.equals("exit")) {
               break; //반복문 탈출
            }
            
            // ex)가나다
            JSONObject jobj = new JSONObject();
            jobj.put("name", msg);
            jobj.put("content", "물품 등록");
            jobj.put("price", 1004);
            jobj.put("quantity", 1004);
            // 출력값 : {"name":"입력내용", "type":1}
            
            // JSONObject => String => byte[] ~~~ byte[] => String =>
            chat.sendMessage("/pknu/class303/id221", jobj.toString());
            Thread.sleep(200); // 0.2초 기다림
         }
         System.exit(0);
         scanner.close();
         
      }
      catch(Exception e) {
         e.printStackTrace();
      }
   }
}