package frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

public class StudentFrame extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public StudentFrame() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD559\uBC88");
		lblNewLabel.setBounds(41, 50, 57, 15);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(116, 47, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 78, 116, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(116, 109, 116, 21);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setBounds(41, 81, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uD559\uB144");
		lblNewLabel_2.setBounds(41, 112, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("등록하기");
		btnNewButton.setBounds(92, 173, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소하기");
		btnNewButton_1.setBounds(227, 173, 97, 23);
		getContentPane().add(btnNewButton_1);
		//2줄 추가하기
		this.setSize(500, 400);
		this.setVisible(true);
		
		
	}
}
