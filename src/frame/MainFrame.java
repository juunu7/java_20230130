package frame;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

// extends 부모클래스
public class MainFrame extends JFrame {
	public MainFrame() {
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\uD559\uC0DD\uC6A9");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\uD559\uC0DD\uB4F1\uB85D");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\uD559\uC0DD\uC815\uBCF4\uC218\uC815");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_2 = new JMenu("New menu item");
		mnNewMenu.add(mnNewMenu_2);
		
		JMenu mnNewMenu_1 = new JMenu("\uAD50\uC218\uC6A9");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_3 = new JMenu("\uAD50\uC218\uB4F1\uB85D");
		mnNewMenu_1.add(mnNewMenu_3);
		
		this.setSize(500, 600);
	      this.setVisible(true);
	}

}