package cls;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


// ���� Ÿ�� ������, �Ǽ���, ����, ���� .. ���������ϰ��� �ϴ� Ŭ����
// ���ǹ� ��ü �����Ϳ��� ���� �ʿ��� ������ ���� (����)
// �ݺ��� ��ɾ ������ ����. �迭�� �����͸� Ž���ϱ� ���� �뵵.
// �迭�� ������ ������ �ϰ������� ����. (�ݺ���)
// private Book[] books = new Book[5]; //å

// Ŭ����, ���, ����Ŭ����... ���ʸ�Ŭ����...
// �÷��� �����迭 ������ �ڵ������� �ٲ�

@Getter
@Setter
@ToString
// ��ȭ��ȣ, ��ġ, ����å(100)
public class BookStore {
	
	private String phone = ""; //��������ó
	private String address = ""; //������ġ
	private Book[] books = null; //å
	
	private int idx = 0; //���� �迭�� �߰��Ǿ� �ִ� å�� ��ġ
	
	// ������ 1���� ��밡����. ��ȯ������, Ŭ������� ��Ȯ�ϰ� ��ġ
	// �غ��� ���� �� ������
	public BookStore() {
		books = new Book[100]; //0 ~ 99������
	}
	
	// å����ϴ� �޼ҵ�(�Լ�) �ʿ�
	public void insertBook( Book book ) {
		if(idx >= 100) {
			System.out.println("å �߰� �Ұ�");
		}
		else {
			books[idx] = book;
			idx++;
		}
	}

	// ������� ��ϵ� å ��� ���
	public void selectBook ( ) {
		int i = 0;
		for(i=0;i< idx ; i++) {
			System.out.println( books[i].toString()  );
		}
	}
	
	// ������ ����� å�� �����ϴ� �޼ҵ�
	public void deleteBook() {
		if(idx > 0) {
			idx--;
		}	
	}
	
	// ����) ����� å�� ������ ���޹��� ������ ���� �޼ҵ�
	public int discountPrice( float per ) {
		// ��ü �����ϰ� �ִ� å
		for(int i=0; i< idx ; i++) {
			// ���� ����
			long price = books[i].getPrice();
			// �Ǽ��� => ���� => ��� ���� �ս��� �Ͼ.
			// long => int
			// int => long
			long result = ( long )(price - (price*per));
			this.books[i].setPrice( result);
			
		}
		return 1;
	}
	
	// ����) ������ n 1000�� �̻��� å ������ ��ȯ�ϴ� �޼ҵ�
	public int priceQuery( int pr ) {
		int cnt = 0;
		for(int i=0; i< idx ; i++) {
			if(this.books[i].getPrice() >= pr ) {
				cnt++;
			}
		}
		return cnt;
		
		
					
	}
	
	// ����) �з� �ڵ尡 ���޹��� ���� �׸� ����ϴ� �޼ҵ�
	// �з� �ڵ庰 ��ȸ ����
	public void printCate(char cate) {
		for(int i=0; i< idx ; i++) {
			if(this.books[i].getCate() == cate) {
				System.out.println(this.books[i].toString());
			}
		}
		
	}
	
	
}
