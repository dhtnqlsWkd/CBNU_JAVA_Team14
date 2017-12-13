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

public class OptionPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public OptionPanel() {
		
		JButton btnNewButton_1 = new JButton("\uB3D9\uAE30\uD654");
		btnNewButton_1.setBounds(0, 1, 75, 34);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		setLayout(null);
		add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		label.setBounds(183, 1, 183, 34);
		add(label);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(366, 1, 183, 34);
		add(label_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 35, 183, 34);
		add(lblNewLabel);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(183, 35, 183, 34);
		add(label_5);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(366, 35, 183, 34);
		add(label_4);
		
		JButton btnNewButton = new JButton("\uCE74\uB4DC \uC815\uBCF4");
		btnNewButton.setBounds(269, 69, 152, 68);
		add(btnNewButton);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(183, 69, 183, 34);
		add(label_1);
		
		JButton btnNewButton_2 = new JButton("\uD1B5\uACC4");
		btnNewButton_2.setBounds(0, 69, 152, 68);
		add(btnNewButton_2);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(0, 103, 183, 34);
		add(label_2);

	}

}
