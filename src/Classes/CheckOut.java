package Classes;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.*;

public class CheckOut extends JFrame{
   CheckOut() {
      // panel
      JPanel panel = new JPanel();
      panel.setBounds(5, 5, 790, 390);
      panel.setBackground(new Color(3, 45, 48));
      panel.setLayout(null);
      add(panel);

      JLabel label = new JLabel("Check-Out");
      label.setBounds(100, 20, 100, 30);
      label.setFont(new Font("Tahoma", Font.PLAIN, 20));
      label.setForeground(Color.WHITE);
      panel.add(label);

      JLabel userId = new JLabel("Customer ID");
      userId.setBounds(30, 80, 100, 30);
      userId.setFont(new Font("Tahoma", Font.BOLD, 14));
      userId.setForeground(Color.WHITE);
      panel.add(userId);

      Choice Customer = new Choice();
      Customer.setBounds(200, 80, 150, 25);
      panel.add(Customer);

      JLabel roomNum = new JLabel("Room Number");
      roomNum.setBounds(30, 130, 150, 30);
      roomNum.setFont(new Font("Tahoma", Font.BOLD, 14));
      roomNum.setForeground(Color.WHITE);
      panel.add(roomNum);

      JLabel labelRoomNum = new JLabel();
      labelRoomNum.setBounds(200, 130, 150, 30);
      labelRoomNum.setFont(new Font("Tahoma", Font.BOLD, 14));
      labelRoomNum.setForeground(Color.WHITE);
      panel.add(labelRoomNum);

      JLabel checkinTime = new JLabel("Check-In Time");
      checkinTime.setBounds(30, 180, 150, 30);
      checkinTime.setFont(new Font("Tahoma", Font.BOLD, 14));
      checkinTime.setForeground(Color.WHITE);
      panel.add(checkinTime);

      JLabel labelCheckinTime = new JLabel();
      labelCheckinTime.setBounds(200, 180, 200, 30);
      labelCheckinTime.setFont(new Font("Tahoma", Font.BOLD, 14));
      labelCheckinTime.setForeground(Color.WHITE);
      panel.add(labelCheckinTime);

      JLabel checkoutTime = new JLabel("Check-Out Time");
      checkoutTime.setBounds(30, 230, 150, 30);
      checkoutTime.setFont(new Font("Tahoma", Font.BOLD, 14));
      checkoutTime.setForeground(Color.WHITE);
      panel.add(checkoutTime);

      Date date = new Date();

      JLabel labelCheckoutTime = new JLabel("" + date);
      labelCheckoutTime.setBounds(200, 230, 200, 30);
      labelCheckoutTime.setFont(new Font("Tahoma", Font.BOLD, 14));
      labelCheckoutTime.setForeground(Color.WHITE);
      panel.add(labelCheckoutTime);

      try {
         DatabaseConnection c = new DatabaseConnection();
         ResultSet resultSet = c.statement.executeQuery("SELECT * FROM customer");
         while (resultSet.next()) {
            Customer.add(resultSet.getString("number"));
         }
      } catch (Exception E) {
         E.printStackTrace();
      }

      JButton checkOut = new JButton("Check-Out");
      checkOut.setBounds(30, 300, 120, 30);
      checkOut.setForeground(Color.WHITE);
      checkOut.setBackground(Color.BLACK);
      panel.add(checkOut);
      checkOut.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               DatabaseConnection cv = new DatabaseConnection();
               cv.statement.executeUpdate("delete from customer where number = '" + Customer.getSelectedItem() + "'");
               cv.statement.executeUpdate("update room set availability = 'Available' where roomnumber = '" + labelRoomNum.getText() + "'");
               JOptionPane.showMessageDialog(null, "CheckOut Done");
               setVisible(false);
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      JButton check = new JButton("Check");
      check.setBounds(300, 300, 120, 30);
      check.setForeground(Color.WHITE);
      check.setBackground(Color.BLACK);
      panel.add(check);
      check.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            DatabaseConnection c = new DatabaseConnection();
            try {
               ResultSet resultSet = c.statement.executeQuery("select * from customer where number = '" + Customer.getSelectedItem() + "'");
               while (resultSet.next()) {
                  labelRoomNum.setText(resultSet.getString("room"));
                  labelCheckinTime.setText(resultSet.getString("checkintime"));
               }
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      JButton back = new JButton("Back");
      back.setBounds(170, 300, 120, 30);
      back.setForeground(Color.WHITE);
      back.setBackground(Color.BLACK);
      panel.add(back);
      back.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            setVisible(false);
         }
      });

      setUndecorated(true);
      setLayout(null);
      setSize(800, 400);
      setLocation(400, 210);
      setVisible(true);
   }
   public static void main(String[] args) {
      new CheckOut();
   }
}
