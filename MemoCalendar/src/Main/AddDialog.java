package Main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;
import javax.swing.JRadioButton;
import javax.swing.*;

public class AddDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	JTextField textField;

	JButton cancelButton;
	JButton okButton;
	
	JRadioButton[] rdbtn1 = new JRadioButton[9];
	JRadioButton[] rdbtn2 = new JRadioButton[5];
	
	ButtonGroup inout;
		JRadioButton rdbtnNewRadioButton;
		JRadioButton rdbtnNewRadioButton_1;
	
	ButtonGroup payment2;	//0~2
		
	ButtonGroup kind2;	//3~8
		
	ButtonGroup payment1;	//0~1
		
	ButtonGroup kind1;	//0~2
		
	
	public AddDialog() {
		setTitle("\uCD94\uAC00");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModal(true);
		setBounds(100, 100, 738, 379);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		inout = new ButtonGroup();
			rdbtnNewRadioButton = new JRadioButton("\uC218\uC785");
			rdbtnNewRadioButton.setBounds(254, 25, 68, 27);
			contentPanel.add(rdbtnNewRadioButton);
		
			rdbtnNewRadioButton_1 = new JRadioButton("\uC9C0\uCD9C");
			rdbtnNewRadioButton_1.setBounds(373, 25, 68, 27);
			contentPanel.add(rdbtnNewRadioButton_1);
			
			
		
		payment2 = new ButtonGroup();
			rdbtn1[0] = new JRadioButton("\uD604\uAE08");
			rdbtn1[0].setBounds(205, 86, 57, 27);
			contentPanel.add(rdbtn1[0]);
			
			rdbtn1[1] = new JRadioButton("\uCCB4\uD06C\uCE74\uB4DC");
			rdbtn1[1].setBounds(303, 86, 90, 27);
			contentPanel.add(rdbtn1[1]);
			
			rdbtn1[2] = new JRadioButton("\uC2E0\uC6A9\uCE74\uB4DC");
			rdbtn1[2].setBounds(421, 86, 90, 27);
			contentPanel.add(rdbtn1[2]);
		
		kind2 = new ButtonGroup();
			rdbtn1[3] = new JRadioButton("\uC2DD\uBE44");
			rdbtn1[3].setBounds(62, 154, 90, 27);
			contentPanel.add(rdbtn1[3]);
			
			rdbtn1[4] = new JRadioButton("\uAD50\uD1B5\uBE44");
			rdbtn1[4].setBounds(158, 154, 77, 27);
			contentPanel.add(rdbtn1[4]);
			
			rdbtn1[5] = new JRadioButton("\uCE74\uD398");
			rdbtn1[5].setBounds(254, 154, 90, 27);
			contentPanel.add(rdbtn1[5]);
			
			rdbtn1[6] = new JRadioButton("\uC0DD\uD544\uD488");
			rdbtn1[6].setBounds(351, 154, 90, 27);
			contentPanel.add(rdbtn1[6]);
			
			rdbtn1[7] = new JRadioButton("\uBB38\uD654\uC0DD\uD65C");
			rdbtn1[7].setBounds(447, 154, 90, 27);
			contentPanel.add(rdbtn1[7]);
			
			rdbtn1[8] = new JRadioButton("\uACF5\uACFC\uAE08");
			rdbtn1[8].setBounds(543, 154, 90, 27);
			contentPanel.add(rdbtn1[8]);
		
		
		
		payment1 = new ButtonGroup();
			rdbtn2[0] = new JRadioButton("\uD604\uAE08");
			rdbtn2[0].setBounds(254, 86, 57, 27);
			contentPanel.add(rdbtn2[0]);
			
			rdbtn2[1] = new JRadioButton("\uACC4\uC88C");
			rdbtn2[1].setBounds(373, 86, 57, 27);
			contentPanel.add(rdbtn2[1]);
		
		kind1 = new ButtonGroup();
			JLabel label = new JLabel("\uAE08\uC561");
			label.setBounds(277, 225, 28, 18);
			contentPanel.add(label);
			
			rdbtn2[2] = new JRadioButton("\uC6D4\uAE09");
			rdbtn2[2].setBounds(228, 154, 57, 27);
			contentPanel.add(rdbtn2[2]);
			
			rdbtn2[3] = new JRadioButton("\uC6A9\uB3C8");
			rdbtn2[3].setBounds(314, 154, 57, 27);
			contentPanel.add(rdbtn2[3]);
			
			rdbtn2[4] = new JRadioButton("\uAE30\uD0C0");
			rdbtn2[4].setBounds(400, 154, 57, 27);
			contentPanel.add(rdbtn2[4]);
		
		inout.add(rdbtnNewRadioButton);
		inout.add(rdbtnNewRadioButton_1);
		
		payment2.add(rdbtn1[0]);
		payment2.add(rdbtn1[1]);
		payment2.add(rdbtn1[2]);
		rdbtn1[0].setVisible(false);
		rdbtn1[1].setVisible(false);
		rdbtn1[2].setVisible(false);
		
		kind2.add(rdbtn1[3]);
		kind2.add(rdbtn1[4]);
		kind2.add(rdbtn1[5]);
		kind2.add(rdbtn1[6]);
		kind2.add(rdbtn1[7]);
		kind2.add(rdbtn1[8]);
		rdbtn1[3].setVisible(false);
		rdbtn1[4].setVisible(false);
		rdbtn1[5].setVisible(false);
		rdbtn1[6].setVisible(false);
		rdbtn1[7].setVisible(false);
		rdbtn1[8].setVisible(false);
		
		payment1.add(rdbtn2[0]);
		payment1.add(rdbtn2[1]);
		rdbtn2[0].setVisible(false);
		rdbtn2[1].setVisible(false);
		
		kind1.add(rdbtn2[2]);
		kind1.add(rdbtn2[3]);
		kind1.add(rdbtn2[4]);
		rdbtn2[2].setVisible(false);
		rdbtn2[3].setVisible(false);
		rdbtn2[4].setVisible(false);
		
		
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("\uC6D0");
		textField.setBounds(314, 222, 108, 24);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		cancelButton = new JButton("\uCDE8\uC18C");
		cancelButton.setBounds(364, 285, 77, 27);
		contentPanel.add(cancelButton);
		cancelButton.setActionCommand("Cancel");
	
		okButton = new JButton("\uCD94\uAC00");
		okButton.setBounds(254, 285, 77, 27);
		contentPanel.add(okButton);
		okButton.setActionCommand("OK");
		getRootPane().setDefaultButton(okButton);
	}
}
