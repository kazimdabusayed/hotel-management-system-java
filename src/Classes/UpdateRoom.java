package Classes;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class UpdateRoom extends JFrame{
   UpdateRoom() {
      JPanel panel = new JPanel();
      panel.setBounds(5, 5, 940, 490);
      panel.setBackground(new Color(3, 45, 48));
      panel.setLayout(null);
      add(panel);

      ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("Icons/update.png"));
      Image image = icon.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
      ImageIcon icon1 = new ImageIcon(image);
      JLabel label = new JLabel(icon1);
      label.setBounds(600, 100, 250, 250);
      panel.add(label);

      JLabel label1 = new JLabel("Update Room Status");
      label1.setBounds(124, 15, 222, 25);
      label1.setFont(new Font("Tahoma", Font.BOLD, 20));
      label1.setForeground(Color.WHITE);
      panel.add(label1);

      JLabel label2 = new JLabel("ID :");
      label2.setBounds(25, 88, 46, 16);
      label2.setFont(new Font("Tahoma", Font.PLAIN, 14));
      label2.setForeground(Color.WHITE);
      panel.add(label2);

      Choice c = new Choice();
      c.setBounds(248, 88, 140, 20);
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

      JLabel label3 = new JLabel("Room Number :");
      label3.setBounds(25, 129, 107, 16);
      label3.setFont(new Font("Tahoma", Font.PLAIN, 14));
      label3.setForeground(Color.WHITE);
      panel.add(label3);

      JTextField textField3 = new JTextField();
      textField3.setBounds(248, 129, 140, 20);
      panel.add(textField3);

      JLabel label4 = new JLabel("Availability:");
      label4.setBounds(25, 174, 97, 16);
      label4.setFont(new Font("Tahoma", Font.PLAIN, 14));
      label4.setForeground(Color.WHITE);
      panel.add(label4);

      JTextField textField4 = new JTextField();
      textField4.setBounds(248, 174, 140, 20);
      panel.add(textField4);

      JLabel label5 = new JLabel("Clean status:");
      label5.setBounds(25, 216, 97, 16);
      label5.setFont(new Font("Tahoma", Font.PLAIN, 14));
      label5.setForeground(Color.WHITE);
      panel.add(label5);

      JTextField textField5 = new JTextField();
      textField5.setBounds(248, 216, 140, 20);
      panel.add(textField5);

      JButton update = new JButton("Update");
      update.setBounds(120, 315, 95, 30);
      update.setBackground(Color.BLACK);
      update.setForeground(Color.WHITE);
      panel.add(update);

      update.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               DatabaseConnection C = new DatabaseConnection();
               String status = textField5.getText();
               C.statement.executeUpdate("update room set cleaning_status = '"+status+"' where roomnumber = "+ textField3.getText());
               JOptionPane.showMessageDialog(null, "Updated Successfully");
               setVisible(false);
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      // back button
      JButton back = new JButton("Back");
      back.setBounds(180, 365, 95, 30);
      back.setBackground(Color.BLACK);
      back.setForeground(Color.WHITE);
      panel.add(back);
      back.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            setVisible(false);
         }
      });

      // check button
      JButton check = new JButton("Check");
      check.setBounds(60, 365, 95, 30);
      check.setBackground(Color.BLACK);
      check.setForeground(Color.WHITE);
      panel.add(check);

      check.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String id = c.getSelectedItem();
            String q = "select * from customer where number = '"+id+"'";
            try {
               DatabaseConnection c = new DatabaseConnection();
               ResultSet resultSet = c.statement.executeQuery(q);
               while (resultSet.next()) {
                  textField3.setText(resultSet.getString("room"));
               }

               ResultSet resultSet1 = c.statement.executeQuery("select * from room where roomnumber =  '"+textField3.getText()+"'");

               while (resultSet1.next()) {
                  textField4.setText(resultSet1.getString("availability"));
                  textField5.setText(resultSet1.getString("cleaning_status"));
               }
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      // Frame
      setUndecorated(true);
      setLayout(null);
      setSize(950, 500);
      setLocation(400, 150);
      setVisible(true);
   }
   public static void main(String[] args) {
      new UpdateRoom();
   }
}
