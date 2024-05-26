package Classes;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {
   JTextField textfield1;
   JPasswordField passwordfield1;

   LoginPage() {
      // Username
      JLabel label1 = new JLabel("Username:");
      label1.setBounds(40, 40, 100, 30);
      label1.setFont(new Font("Tahoma", Font.BOLD, 16));
      label1.setForeground(Color.WHITE);
      add(label1);

      // Password
      JLabel label2 = new JLabel("Password:");
      label2.setBounds(40, 120, 100, 30);
      label2.setFont(new Font("Tahoma", Font.BOLD, 16));
      label2.setForeground(Color.WHITE);
      add(label2);

      // Text Field
      textfield1 = new JTextField();
      textfield1.setBounds(150, 40, 150, 30);
      textfield1.setForeground(Color.WHITE);
      setFont(new Font("Tahoma", Font.PLAIN, 15));
      textfield1.setBackground(new Color(26, 140, 110));
      add(textfield1);

      // Password Field
      passwordfield1 = new JPasswordField();
      passwordfield1.setBounds(150, 120, 150, 30);
      setForeground(Color.WHITE);
      passwordfield1.setBackground(new Color(26, 140, 110));
      add(passwordfield1);

      // Frame
      setUndecorated(true);
      getContentPane().setBackground(new Color(3, 45, 48));
      setLayout(null);
      setLocation(600, 270);
      setSize(600, 300);
      setVisible(true);
   }

   public static void main(String[] args) {
      new LoginPage();
   }
}
