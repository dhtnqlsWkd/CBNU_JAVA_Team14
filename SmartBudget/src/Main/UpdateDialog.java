package Main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class UpdateDialog extends JDialog {

private final JPanel contentPanel = new JPanel();
   
   JTextField textField;

   JButton cancelButton;
   JButton okButton;
   
   JRadioButton[] outrdbtn = new JRadioButton[9];
   JRadioButton[] inrdbtn = new JRadioButton[5];
   
   ButtonGroup inout;
      JRadioButton rdbtnNewRadioButton;
      JRadioButton rdbtnNewRadioButton_1;
   
   ButtonGroup payment2;   //0~2
      
   ButtonGroup kind2;   //3~8
      
   ButtonGroup payment1;   //0~1
      
   ButtonGroup kind1;   //0~2
      
   
   public UpdateDialog() {
      setTitle("\uC218\uC815");
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
         outrdbtn[0] = new JRadioButton("\uD604\uAE08");
         outrdbtn[0].setBounds(205, 86, 57, 27);
         contentPanel.add(outrdbtn[0]);
         
         outrdbtn[1] = new JRadioButton("\uCCB4\uD06C\uCE74\uB4DC");
         outrdbtn[1].setBounds(303, 86, 90, 27);
         contentPanel.add(outrdbtn[1]);
         
         outrdbtn[2] = new JRadioButton("\uC2E0\uC6A9\uCE74\uB4DC");
         outrdbtn[2].setBounds(421, 86, 90, 27);
         contentPanel.add(outrdbtn[2]);
      
      kind2 = new ButtonGroup();
         outrdbtn[3] = new JRadioButton("\uC2DD\uBE44");
         outrdbtn[3].setBounds(62, 154, 90, 27);
         contentPanel.add(outrdbtn[3]);
         
         outrdbtn[4] = new JRadioButton("\uAD50\uD1B5\uBE44");
         outrdbtn[4].setBounds(158, 154, 77, 27);
         contentPanel.add(outrdbtn[4]);
         
         outrdbtn[5] = new JRadioButton("\uCE74\uD398");
         outrdbtn[5].setBounds(254, 154, 90, 27);
         contentPanel.add(outrdbtn[5]);
         
         outrdbtn[6] = new JRadioButton("\uC0DD\uD544\uD488");
         outrdbtn[6].setBounds(351, 154, 90, 27);
         contentPanel.add(outrdbtn[6]);
         
         outrdbtn[7] = new JRadioButton("\uBB38\uD654\uC0DD\uD65C");
         outrdbtn[7].setBounds(447, 154, 90, 27);
         contentPanel.add(outrdbtn[7]);
         
         outrdbtn[8] = new JRadioButton("\uACF5\uACFC\uAE08");
         outrdbtn[8].setBounds(543, 154, 90, 27);
         contentPanel.add(outrdbtn[8]);
      
      
      
      payment1 = new ButtonGroup();
         inrdbtn[0] = new JRadioButton("\uD604\uAE08");
         inrdbtn[0].setBounds(254, 86, 57, 27);
         contentPanel.add(inrdbtn[0]);
         
         inrdbtn[1] = new JRadioButton("\uACC4\uC88C");
         inrdbtn[1].setBounds(373, 86, 57, 27);
         contentPanel.add(inrdbtn[1]);
      
      kind1 = new ButtonGroup();
         JLabel label = new JLabel("\uAE08\uC561");
         label.setBounds(277, 225, 28, 18);
         contentPanel.add(label);
         
         inrdbtn[2] = new JRadioButton("\uC6D4\uAE09");
         inrdbtn[2].setBounds(228, 154, 57, 27);
         contentPanel.add(inrdbtn[2]);
         
         inrdbtn[3] = new JRadioButton("\uC6A9\uB3C8");
         inrdbtn[3].setBounds(314, 154, 57, 27);
         contentPanel.add(inrdbtn[3]);
         
         inrdbtn[4] = new JRadioButton("\uAE30\uD0C0");
         inrdbtn[4].setBounds(400, 154, 57, 27);
         contentPanel.add(inrdbtn[4]);
      
      inout.add(rdbtnNewRadioButton);
      inout.add(rdbtnNewRadioButton_1);
      
      payment2.add(outrdbtn[0]);
      payment2.add(outrdbtn[1]);
      payment2.add(outrdbtn[2]);
      outrdbtn[0].setVisible(false);
      outrdbtn[1].setVisible(false);
      outrdbtn[2].setVisible(false);
      
      kind2.add(outrdbtn[3]);
      kind2.add(outrdbtn[4]);
      kind2.add(outrdbtn[5]);
      kind2.add(outrdbtn[6]);
      kind2.add(outrdbtn[7]);
      kind2.add(outrdbtn[8]);
      outrdbtn[3].setVisible(false);
      outrdbtn[4].setVisible(false);
      outrdbtn[5].setVisible(false);
      outrdbtn[6].setVisible(false);
      outrdbtn[7].setVisible(false);
      outrdbtn[8].setVisible(false);
      
      payment1.add(inrdbtn[0]);
      payment1.add(inrdbtn[1]);
      inrdbtn[0].setVisible(false);
      inrdbtn[1].setVisible(false);
      
      kind1.add(inrdbtn[2]);
      kind1.add(inrdbtn[3]);
      kind1.add(inrdbtn[4]);
      inrdbtn[2].setVisible(false);
      inrdbtn[3].setVisible(false);
      inrdbtn[4].setVisible(false);
      
      
      
      textField = new JTextField();
      textField.setHorizontalAlignment(SwingConstants.RIGHT);
      textField.setBounds(314, 222, 108, 24);
      contentPanel.add(textField);
      textField.setColumns(10);
      
      cancelButton = new JButton("\uCDE8\uC18C");
      cancelButton.setBounds(364, 285, 77, 27);
      contentPanel.add(cancelButton);
      cancelButton.setActionCommand("Cancel");
   
      okButton = new JButton("\uC218\uC815");
      okButton.setBounds(254, 285, 77, 27);
      contentPanel.add(okButton);
      okButton.setActionCommand("OK");
      getRootPane().setDefaultButton(okButton);
   }

}	