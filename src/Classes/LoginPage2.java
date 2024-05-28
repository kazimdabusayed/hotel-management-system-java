package Classes;

import javax.swing.*;
import java.awt.*;

public class LoginPage2 extends JFrame {

   JTextField textField1;
   JPasswordField passwordField1;

   LoginPage2() {
      // JLabel label1
      JLabel label1 = new JLabel("Username:");
      label1.setBounds(40, 20, 100, 30);
      label1.setFont(new Font("Tahoma", Font.BOLD, 16));
      label1.setForeground(Color.WHITE);
      add(label1);

      // JLabel label2
      JLabel label2 = new JLabel("Password:");
      label2.setBounds(40, 90, 100, 30);
      label2.setFont(new Font("Tahoma", Font.BOLD, 16));
      label2.setForeground(Color.WHITE);
      add(label2);

      // testField1
      textField1 = new JTextField();
      textField1.setBounds(150, 20, 150, 30);
      textField1.setForeground(Color.WHITE);
      textField1.setFont(new Font("Tahoma", Font.PLAIN, 15));
      textField1.setBackground(new Color(26, 104, 110));
      add(textField1);

      // passwordField1
      passwordField1 = new JPasswordField();
      passwordField1.setBounds(150, 90, 150, 30);
      passwordField1.setForeground(Color.WHITE);
      passwordField1.setBackground(new Color(26, 104, 110));
      textField1.setFont(new Font("Tahoma", Font.PLAIN, 15));
      add(passwordField1);

      // Frame
      getContentPane().setBackground(new Color(3, 45, 48));
      setLayout(null);
      setLocation(400, 270);
      setSize(600, 300);
      setVisible(true);
   }
   public static void main(String[] args) {
      new LoginPage2();
   }
}
