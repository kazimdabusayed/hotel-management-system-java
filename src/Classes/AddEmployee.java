package Classes;

import javax.swing.*;
import java.awt.*;

public class AddEmployee extends JFrame {
   JTextField nameText, ageText, SalaryText, PhoneText, NationalIDNum, EmailText;

   AddEmployee() {
      // Jpanel
      JPanel panel = new JPanel();
      panel.setBounds(5, 5, 890, 490);
      panel.setLayout(null);
      panel.setBackground(new Color(3, 45, 48));
      add(panel);

      // Texts
      JLabel name = new JLabel("NAME:");
      name.setBounds(60, 30, 150, 27);
      name.setFont(new Font("serif", Font.BOLD, 17));
      name.setForeground(Color.WHITE);
      panel.add(name);

      // Textfields
      nameText = new JTextField();
      nameText.setBounds(200, 30, 150, 27);
      nameText.setBackground(new Color(16, 108, 115));
      nameText.setFont(new Font("Tahoma", Font.BOLD, 14));
      nameText.setForeground(Color.WHITE);
      panel.add(nameText);

      // Textfields
      nameText = new JTextField();
      nameText.setBounds(200, 30, 150, 27);
      nameText.setBackground(new Color(16, 108, 115));
      nameText.setFont(new Font("Tahoma", Font.BOLD, 14));
      nameText.setForeground(Color.WHITE);
      panel.add(nameText);

      // Texts for age
      JLabel Age = new JLabel("AGE:");
      Age.setBounds(60, 80, 150, 27);
      Age.setFont(new Font("serif", Font.BOLD, 17));
      Age.setForeground(Color.WHITE);
      panel.add(Age);

      // Textfields
      ageText = new JTextField();
      ageText.setBounds(200, 80, 150, 27);
      ageText.setBackground(new Color(16, 108, 115));
      ageText.setFont(new Font("Tahoma", Font.BOLD, 14));
      ageText.setForeground(Color.WHITE);
      panel.add(ageText);

      // Frame
      setUndecorated(true);
      setLocation(60, 160);
      setSize(900, 500);
      setLayout(null);
      setVisible(true);
   }
   public static void main(String[] args) {
      new AddEmployee();
   }
}
