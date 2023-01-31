package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Item {
	
	private long no = 0L; //��ǰ��ȣ
	private String name = null; //��ǰ��
	private String content = null; //��ǰ����
	private int price = 0; // ����
	private long quantity = 0L; // ����
	private Date date = null;
	
	
	// getter / setter / toString()
	
	// �޼ҵ� == �Լ� ( Ư���� ��� ���� )
	public void disountPrice( float per ) {
		//���簡�ݿ��� per��ŭ ���� ��.
		// ����, ���ǹ�, �ݺ���, �迭...
		this.price = (int) (this.price - ( this.price * per ));
	}
	
	public void checkQuantity(int num) {
		if( this.quantity < num   ) {
			this.quantity = this.quantity + num;	
		}
	}
	
}
