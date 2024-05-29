package Classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class CustomerInfo extends Frame {
   CustomerInfo() {

      // Panel
      JPanel panel = new JPanel();
      panel.setBounds(5, 5, 890, 590);
      panel.setBackground(new Color(3, 45, 48));
      panel.setLayout(null);
      add(panel);

      // Table
      JTable table = new JTable();
      table.setBounds(10, 40, 900, 450);
      table.setBackground(new Color(3, 45, 48));
      table.setForeground(Color.WHITE);
      panel.add(table);

      try {
         DatabaseConnection c = new DatabaseConnection();
         String q = "select * from  Customer";
         ResultSet resultSet = c.statement.executeQuery(q);
         table.setModel(DbUtils.resultSetToTableModel(resultSet));
      } catch (Exception e) {
         e.printStackTrace();
      }

      // Label for id
      JLabel id = new JLabel("ID");
      id.setBounds(31, 11, 100, 14);
      id.setForeground(Color.WHITE);
      id.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(id);

      // Label for number
      JLabel Number = new JLabel("Number");
      Number.setBounds(150, 11, 100, 14);
      Number.setForeground(Color.WHITE);
      Number.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(Number);

      // Label for name
      JLabel Name = new JLabel("Name");
      Name.setBounds(270, 11, 100, 14);
      Name.setForeground(Color.WHITE);
      Name.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(Name);

      // Label for gender
      JLabel gender = new JLabel("Gender");
      gender.setBounds(360, 11, 100, 14);
      gender.setForeground(Color.WHITE);
      gender.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(gender);

      // Label for country
      JLabel country = new JLabel("Country");
      country.setBounds(480, 11, 100, 14);
      country.setForeground(Color.WHITE);
      country.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(country);

      // Label for room
      JLabel room = new JLabel("Room");
      room.setBounds(600, 11, 100, 14);
      room.setForeground(Color.WHITE);
      room.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(room);

      // Label for Time
      JLabel CheckinTime = new JLabel("Check-in Time");
      CheckinTime.setBounds(680, 11, 100, 14);
      CheckinTime.setForeground(Color.WHITE);
      CheckinTime.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(CheckinTime);

      // Label for Deposite
      JLabel deposite = new JLabel("Deposite");
      deposite.setBounds(800, 11, 100, 14);
      deposite.setForeground(Color.WHITE);
      deposite.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(deposite);

      // buttons
      JButton back = new JButton("Back");
      back.setBounds(400, 510, 120, 30);
      back.setBackground(Color.BLACK);
      back.setForeground(Color.WHITE);
      panel.add(back);
      back.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            setVisible(false);
         }
      });

      // Frame
      setUndecorated(true);
      setLayout(null);
      setSize(900, 600);
      setLocation(400, 100);
      setVisible(true);
   }

   public static void main(String[] args) {
      new CustomerInfo();
   }
}
