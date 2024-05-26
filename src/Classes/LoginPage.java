package Classes;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener {
   JTextField textfield1;
   JPasswordField passwordfield1;
   JButton b1, b2;

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

      // Image
      ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icons/Logo.gif"));
      imageIcon.getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT);
      JLabel label = new JLabel(imageIcon);
      label.setBounds(318, -40, 255, 300);
      add(label);

      // Button
      b1 = new JButton("Login");
      b1.setBounds(40, 180, 120, 30);
      b1.setFont(new Font("serif", Font.BOLD, 15));
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.addActionListener(this);
      add(b1);

      b2 = new JButton("Cancel");
      b2.setBounds(180, 180, 120, 30);
      b2.setFont(new Font("serif", Font.BOLD, 15));
      b2.setBackground(Color.BLACK);
      b2.setForeground(Color.WHITE);
      b2.addActionListener(this);
      add(b2);

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
