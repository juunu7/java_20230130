package cls;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// ��ϵ� ������ ����� �����ϴ� Ŭ����

@Getter
@Setter
@ToString
public class CourseList {
	
	// 10���� ������ �� �ִ� �迭
	// ������ �ݵ�� ������ �ʿ���.
	private Course[] courseArray = new Course[10];
	private int idx = 0; // �迭 ������ ������ �����ϴ� ����	
	
	//��ϵ� �������� ���������߿��� ������� �������� ����ϴ� �޼ҵ�
	public void printProfessorNameAndRoom() {
		for(int i=0; i<idx; i++) {
			Professor professor = this.courseArray[i].getProfessor();
			System.out.println("������:" + professor.getName()+ "������:" + professor.getRoom());
		}
	}
	
	//��ϵ� �������� ���������� ���
	public void printProfessor() {
		for(int i=0; i<idx; i++) {
			Professor professor = this.courseArray[i].getProfessor();
			System.out.println( professor.toString() );
		}
	}
	
	// ������ 1���� ����� �� �ִ� �޼ҵ�
	public void insertCourse( Course course ) {
		// idx�� ���� �߰��� ���� < �迭�� ��ü ����
		if(this.idx < this.courseArray.length) {
			this.courseArray[idx] = course;
			this.idx++;
		}
		else {
			System.out.println("��� �Ұ�");
			
		}
		
	}
	
	public void printCourse() {
		for(int i=0; i<idx; i++) {
			System.out.println( this.courseArray[i].toString() );
		}
	}
	
	// �������� �߰��� ���� �����ϴ� �޼ҵ�
	
	// �����߿��� ���޹޴� ������ �ش��ϴ� ���� ��ȸ 
	// ex) 3�� �����ϸ� 3������ �ش��ϴ� ����
	

}
