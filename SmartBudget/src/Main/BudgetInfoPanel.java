package Main;

import javax.swing.JPanel;

import Database.*;

import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;

public class BudgetInfoPanel extends JPanel {

	JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_3;
	JLabel lblNewLabel_2;
	
	
	public BudgetInfoPanel(int year,int month) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 393, 393, 0 };
		gridBagLayout.rowHeights = new int[] { 52, 52, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JDBCExam a1 = new JDBCExam();
		
		lblNewLabel = new JLabel("¼öÀÔ : " + a1.productSum_month(year, month, 0));// ¼öÀÔ
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);

		lblNewLabel_1 = new JLabel("ÁöÃâ : " + a1.productSum_month(year, month, 1));// ÁöÃâ
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

		int sum = 0;
		sum = a1.productSum_month_card(year, month, 0, 0) - a1.productSum_month_card(year, month, 1, 0);
		lblNewLabel_3 = new JLabel("Çö±Ý ÀÜ¾× : " + sum);// Çö±Ý ÀÜ¾×
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 1;
		add(lblNewLabel_3, gbc_lblNewLabel_3);

		int sum2 = 0;
		sum2 = sum2 + a1.productSum_month_card(year, month, 0, 1) - a1.productSum_month_card(year, month, 1, 1);
		lblNewLabel_2 = new JLabel("Ä«µå ÀÜ¾× : " + sum2);// Ä«µå ÀÜ¾×
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		add(lblNewLabel_2, gbc_lblNewLabel_2);

	}

}