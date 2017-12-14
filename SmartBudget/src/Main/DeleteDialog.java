package Main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class DeleteDialog extends JDialog {

   private final JPanel contentPanel = new JPanel();

   JButton okbtn;
   JButton cancelbtn;
   
   public DeleteDialog() {
      setTitle("\uC0AD\uC81C");
      setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
      setModal(true);
      setBounds(100, 100, 325, 167);
      getContentPane().setLayout(new BorderLayout());
      contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
      getContentPane().add(contentPanel, BorderLayout.CENTER);
      contentPanel.setLayout(null);
      
      JLabel label = new JLabel("\uC0AD\uC81C\uD558\uC2DC\uACA0\uC2B5\uB2C8\uAE4C?");
      label.setFont(new Font("±¼¸²", Font.PLAIN, 20));
      label.setBounds(65, 12, 180, 53);
      contentPanel.add(label);
      
      okbtn = new JButton("\uD655\uC778");
      okbtn.setBounds(75, 77, 70, 27);
      contentPanel.add(okbtn);
      
      cancelbtn = new JButton("\uCDE8\uC18C");
      cancelbtn.setBounds(159, 77, 70, 27);
      contentPanel.add(cancelbtn);
   }

}