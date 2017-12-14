package Main;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;

public class OptionPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public OptionPanel() {
		
		setLayout(null);
		
		JButton btnNewButton_2 = new JButton("\uD1B5\uACC4");
		btnNewButton_2.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btnNewButton_2.setBounds(0, 105, 73, 34);
		add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("mart");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 65));
		lblNewLabel.setBounds(168, 12, 147, 127);
		lblNewLabel.setOpaque(true);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("S");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 65));
		lblNewLabel_1.setBounds(123, 12, 45, 127);
		lblNewLabel_1.setOpaque(true);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("B");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 65));
		lblNewLabel_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2.setBounds(314, 12, 45, 127);
		lblNewLabel_2.setOpaque(true);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("udget");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 65));
		lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3.setBounds(359, 12, 177, 127);
		lblNewLabel_3.setOpaque(true);
		add(lblNewLabel_3);

	}

}
