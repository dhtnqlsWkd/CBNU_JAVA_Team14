package Main;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class ListPanel extends JPanel {

   JList list;
   JLabel lblNewLabel;
   JButton btnNewButton;
   JButton btnNewButton_1;
   JButton btnNewButton_2;
   
   public ListPanel() {
      setLayout(null);
      
      list = new JList();
      list.setFont(new Font("±¼¸²", Font.PLAIN, 24));
      list.setBorder(new LineBorder(new Color(0, 0, 0)));
      list.setBounds(0, 14, 572, 517);
      add(list);
      
      lblNewLabel = new JLabel("");
      lblNewLabel.setBounds(14, 0, 105, 12);
      add(lblNewLabel);
      
      btnNewButton = new JButton("\uCD94\uAC00");
      btnNewButton.setFont(new Font("±¼¸²", Font.PLAIN, 20));
      btnNewButton.setBounds(67, 543, 105, 39);
      add(btnNewButton);
      
      btnNewButton_1 = new JButton("\uC0AD\uC81C");
      btnNewButton_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
      btnNewButton_1.setBounds(232, 543, 105, 39);
      add(btnNewButton_1);
      
      btnNewButton_2 = new JButton("\uC218\uC815");
      btnNewButton_2.setFont(new Font("±¼¸²", Font.PLAIN, 20));
      btnNewButton_2.setBounds(397, 543, 105, 39);
      add(btnNewButton_2);

   }
}