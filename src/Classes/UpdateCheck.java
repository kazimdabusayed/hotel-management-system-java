package Classes;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.ResultSet;

import javax.swing.*;

public class UpdateCheck extends JFrame{
   UpdateCheck() {
      JPanel panel = new JPanel();
      panel.setBounds(5, 5, 940, 490);
      panel.setBackground(new Color(3, 45, 48));
      panel.setLayout(null);
      add(panel);

      ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("Icons/updated.png"));
      Image image = icon.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
      ImageIcon icon1 = new ImageIcon(image);
      JLabel label = new JLabel(icon1);
      label.setBounds(520, 90, 250, 250);
      panel.add(label);

      JLabel label1 = new JLabel("Check-in Details");
      label1.setBounds(124, 11, 222, 25);
      label1.setFont(new Font("Tahoma", Font.BOLD, 20));
      label1.setForeground(Color.WHITE);
      panel.add(label1);

      // Label for ID
      JLabel label2 = new JLabel("ID :");
      label2.setBounds(25, 88, 46, 14);
      label2.setFont(new Font("Tahoma", Font.PLAIN, 14));
      label2.setForeground(Color.WHITE);
      panel.add(label2);

      Choice c = new Choice();
      c.setBounds(248, 85, 140, 20);
      panel.add(c);
      try {
         DatabaseConnection C = new DatabaseConnection();
         ResultSet resultSet = C.statement.executeQuery("select * from customer");
         while (resultSet.next()) {
            c.add(resultSet.getString("number"));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      // Label for room number
      JLabel label3 = new JLabel("Room Number :");
      label3.setBounds(25, 129, 107, 16);
      label3.setFont(new Font("Tahoma", Font.PLAIN, 14));
      label3.setForeground(Color.WHITE);
      panel.add(label3);

      JTextField textField3 = new JTextField();
      textField3.setBounds(248, 129, 140, 20);
      panel.add(textField3);

      // Label for name
      JLabel label4 = new JLabel("Name :");
      label4.setBounds(25, 174, 97, 16);
      label4.setFont(new Font("Tahoma", Font.PLAIN, 14));
      label4.setForeground(Color.WHITE);
      panel.add(label4);

      JTextField textField4 = new JTextField();
      textField4.setBounds(248, 174, 140, 20);
      panel.add(textField4);

      // Label for Checked-in
      JLabel label5 = new JLabel("Checked-in :");
      label5.setBounds(25, 216, 97, 16);
      label5.setFont(new Font("Tahoma", Font.PLAIN, 14));
      label5.setForeground(Color.WHITE);
      panel.add(label5);

      JTextField textField5 = new JTextField();
      textField5.setBounds(248, 216, 140, 20);
      panel.add(textField5);

      // Label for Amount Paid
      JLabel label6 = new JLabel("Amount Paid (Tk) :");
      label6.setBounds(25, 261, 150, 16);
      label6.setFont(new Font("Tahoma", Font.PLAIN, 14));
      label6.setForeground(Color.WHITE);
      panel.add(label6);

      JTextField textField6 = new JTextField();
      textField6.setBounds(248, 261, 140, 20);
      panel.add(textField6);

      // Label for Pending ammount
      JLabel label7 = new JLabel("Pending Amount (Tk) :");
      label7.setBounds(25, 302, 150, 16);
      label7.setFont(new Font("Tahoma", Font.PLAIN, 14));
      label7.setForeground(Color.WHITE);
      panel.add(label7);

      JTextField textField7 = new JTextField();
      textField7.setBounds(248, 302, 140, 20);
      panel.add(textField7);

      // Frame
      setUndecorated(true);
      setLayout(null);
      setSize(950, 500);
      setLocation(380, 120);
      setVisible(true);
   }
   public static void main(String[] args) {
      new UpdateCheck();
   }
}
