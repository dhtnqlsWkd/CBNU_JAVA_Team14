package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SubFrame extends JDialog {
	JPanel addPanel = new JPanel();
	JLabel listTitle = new JLabel("수입 지출 목록");
	JLabel list = new JLabel("식비 10000원 지출");
	JButton b = new JButton("추가");
	
	JPanel addPanel2 = new JPanel();
	JTextField t = new JTextField(15);
	JLabel won = new JLabel("원");
	JButton b1 = new JButton("입금");
	JButton b2 = new JButton("지출");
	
	MyActionListener2 al2 = new MyActionListener2();
	
	SubFrame() {	//월 추가하기
		addPanel.add(listTitle);
		addPanel.add(list);
		b.addActionListener(al2);
		addPanel.add(b);
		setContentPane(addPanel);
		
		addPanel2.add(t);
		addPanel2.add(won);
		b1.addActionListener(al2);
		b2.addActionListener(al2);
		addPanel2.add(b1);
		addPanel2.add(b2);
		
		setSize(700, 700);
		setVisible(false);
	}
	
	class MyActionListener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton bt = (JButton)e.getSource();
			
			if (bt.equals(b)) {
				addPanel.setVisible(false);
				setContentPane(addPanel2);
			}
			else if (bt.equals(b1) || bt.equals(b2)) {
				setVisible(false);
				t.setText(null);
				addPanel.setVisible(true);
				setContentPane(addPanel);
			}
		}
	}
}
