package cls;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

// å��ȣ no, å���� title, ���� author, ���� price 12000, �з� cate 'A', 'B', 'C', ������� date
public class Book {
	
	private int no = 0;
	private String title = ""; // null, ""
	private String author = "";
	private long price = 0;
	private char cate = 'A';
	private Date date = null;

}
