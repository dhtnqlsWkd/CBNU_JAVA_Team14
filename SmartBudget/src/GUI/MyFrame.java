package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame{
	MyCalender cal;
	Month m;
	Menu menu;
	
	MyFrame() {
		setTitle("SmartBudget");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cal = new MyCalender();
		add(cal, BorderLayout.CENTER);
		
		m = new Month();
		add(m, BorderLayout.NORTH);
		
		menu = new Menu();
		add(menu, BorderLayout.SOUTH);
		
		setSize(1000, 1000);
		setVisible(true);
	}
}

class MyCalender extends JPanel {
	Container c;
	JButton[] days = new JButton[30];
	MyActionListener al = new MyActionListener();
	JLabel[] blank = new JLabel[3];
	JLabel[] week = new JLabel[7];
	String[] weeks = {"일", "월", "화", "수", "목", "금", "토"};
	
	SubFrame sf;
	
	MyCalender() {
		setLayout(new GridLayout(6, 7));
		
		for (int i = 0; i < 7; i++) {
			week[i] = new JLabel(weeks[i]);
			week[i].setHorizontalAlignment(SwingConstants.CENTER);
			add(week[i]);
		}
		
		for (int i = 0; i < 3; i++) {
			blank[i] = new JLabel();
			add(blank[i]);
		}
		
		
		for (int i = 0; i < 30; i++) {
			days[i] = new JButton(Integer.toString(i + 1));
			days[i].addActionListener(al);
			add(days[i]);
		}
		
		sf = new SubFrame();
	}
	
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			
			sf.setVisible(true);
			sf.setTitle(b.getText() + "일");
		}
	}
}

class Month extends JPanel {
	String[] m = new String[12];
	Month() {
		for (int i = 0; i < 12; i++) {
			m[i] = Integer.toString(i + 1) + "월";
		}
		
		JComboBox cb = new JComboBox(m);
		add(cb);
	}
}

class Menu extends JPanel {
	JButton b1 = new JButton("메뉴1");
	JButton b2 = new JButton("메뉴2");
	JButton b3 = new JButton("메뉴3");
	Menu() {
		add(b1);
		add(b2);
		add(b3);
	}
}