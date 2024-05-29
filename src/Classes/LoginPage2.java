package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;

public class LoginPage2 extends JFrame implements ActionListener{

   JTextField textField1;
   JPasswordField passwordField1;
   JButton b1, b2;

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

      // ImageIcon
      ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icons/new_logo_admin.png"));
      Image i1 = imageIcon.getImage().getScaledInstance(255, 300, Image.SCALE_DEFAULT);
      JLabel label = new JLabel(imageIcon);
      label.setBounds(325, -32, 255, 300);
      add(label);

      ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("Icons/loginback.png"));
      Image i22 = i2.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
      ImageIcon i23 = new ImageIcon(i22);
      JLabel image = new JLabel(i23);
      image.setBounds(0, 0, 600, 300);
      add(image);

      // Login button
      b1 = new JButton("Login");
      b1.setBounds(40, 160, 120, 30);
      b1.setFont(new Font("serif", Font.BOLD, 15));
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.addActionListener(this);
      add(b1);

      // Cancel button
      b2 = new JButton("Cancel");
      b2.setBounds(188, 160, 120, 30);
      b2.setFont(new Font("serif", Font.BOLD, 15));
      b2.setBackground(Color.BLACK);
      b2.setForeground(Color.WHITE);
      b2.addActionListener(this);
      add(b2);

      // Frame
      getContentPane().setBackground(new Color(3, 45, 48));
      setLayout(null);
      setLocation(400, 270);
      setSize(600, 300);
      setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == b1) {
         try {
            DatabaseConnection c = new DatabaseConnection();
            String user = textField1.getText();
            @SuppressWarnings("deprecation")
            String pass = passwordField1.getText();

            String q = "select * from login2 where user_name='" + user + "'and password='" + pass + "'";
            ResultSet resultSet = c.statement.executeQuery(q);

            if (resultSet.next()) {
               new Admin();
               setVisible(false);
            }
            else {
               JOptionPane.showMessageDialog(null, "Invalid password or username");
            }
         } catch (Exception E) {
            E.printStackTrace();
         }
      } else {
         new DashBoard();
         setVisible(false);
      }
   }
   public static void main(String[] args) {
      new LoginPage2();
   }
}
