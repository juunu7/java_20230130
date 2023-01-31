package cls;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 5���� �л��� ���� ������ �����ϰ� ó���� Ŭ����
@Setter
@Getter
@ToString
public class KorScore {

	private String[] student = new String[10];
	private int[] score = new int[5];	
	// getter, setter, toString �޼ҵ尡 ������.
	
	// �л����� ���� �հ踦 �����ִ� �޼ҵ�
	public int sumScore(  ) {
		int sum = 0;
		int i; //�ݺ��� �ӽú���
		for(i=0;i<score.length;i++) { // 0 1 2 3 4 (X 5)
			sum = sum + this.score[i];
		}
		return sum;
	}
	
	// �л����� ������ ��� ���ϱ�
	public float avgScore() {
		float avg = 0.0f;
		int sum = this./sumScore();
		
		avg = (float)sum / this.score.length; // �Ǽ� 1�� �̻� �ʿ�
		return avg;
	}
	
	// 90�� �̻��� ����� �ο���
	public int score90() {
		int cnt = 0;
		int i;
		for(i=0;i<this.score.length; i++){
			if(this.score[i] >=90 ) {
				cnt = cnt + 1;	
			}
		}
		return cnt;	
	}
	
	public int scoreMax() {
		int i;
		// 20, 99, 70, 98, 100
		int max = this.score[0]; //20
		for(i=1;i<this.score.length;i++) {
			if(max < this.score[i] {
				max = this.score[i]
			}
		}
		return max;
	}
	
	
	public int scoreMin() {
		int i;
		int min = this.score[0];
		
		return min;
	}
}
