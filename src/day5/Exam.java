package day5;

// Student, Book

// ���ʸ� Ŭ���� 
// Ÿ���� ������ ������ Ŭ������ ����ϰڴ�.
// T�� ������ ���� ���� => T�� ���� ���ϳ�?? Main2.java���� ���� ����
public class Exam<T> {
	
	

	// ���� 1��
	private int a=14;
	private int b=14;
	
	private T element;
	
	// public ��ȯŸ��
	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
	
	
	
}
