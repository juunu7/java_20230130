package cls;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 5명의 학생의 국어점수를 보관하고 처리할 클래스
@Setter
@Getter
@ToString
public class KorScore {

   private String[] student = new String[5];
   private int[] score = new int[5];
   
   // getter setter toString 메소드 생성

   // 3. 전체 합계를 구하기
   public int sumScore(){
      int sum = 0;
      
      for(int i=0; i<this.score.length; i++) {
         sum = sum + this.score[i];
      }
      return sum;
   }

   // 4. 평균
   public float avgScore() {
      //int sum = 0;
      float avg = 0.0f;
      
      /*for(int i=0; i<this.score.length; i++) {
         sum = sum + this.score[i];
      }*/
      
      int sum = this.sumScore();
      return avg=sum/(float)this.score.length; // 실수 1개 이상 필요
   }

   // 5. 최대점수
   public int maxScore() {
      int temp = 0;
      temp = this.score[0];
      for(int i=0; i<this.score.length; i++) {
         if(temp < this.score[i]) {
            temp = this.score[i];
         }
      }
      return temp;
   }

   // 6. 최소점수
   public int minScore() {
      int temp = 0;
      temp = this.score[0];
      
      for(int i=0; i<this.score.length; i++) {
         if(temp > this.score[i]) {
            temp = this.score[i];
         }
      }
      return temp;
   }

   // 7. 90점 이상 몇명?
   public int count90() {
      int count = 0;
      for(int i=0; i<this.score.length; i++) {
         if(this.score[i]>=90) {
            count++;
         }
      }
      return count;
   }
   

}