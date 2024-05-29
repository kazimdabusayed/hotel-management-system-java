package Classes;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

import net.proteanit.sql.DbUtils;

public class Pickup extends JFrame {
   Pickup() {
      // Panel
      JPanel panel = new JPanel();
      panel.setBackground(new Color(3, 45, 48));
      panel.setBounds(5, 5, 790, 590);
      panel.setLayout(null);
      add(panel);

      // Label for pickup service
      JLabel PUS = new JLabel("Pick Up Service");
      PUS.setBounds(90, 11, 160, 25);
      PUS.setForeground(Color.WHITE);
      PUS.setFont(new Font("Tahoma", Font.BOLD, 20));
      panel.add(PUS);

      // Label for type of cars
      JLabel TOC = new JLabel("Type of Car:");
      TOC.setBounds(32, 97, 89, 14);
      TOC.setForeground(Color.WHITE);
      TOC.setFont(new Font("Tahoma", Font.PLAIN, 14));
      panel.add(TOC);

      // Choices
      Choice c = new Choice();
      c.setBounds(123, 94, 150, 25);
      panel.add(c);

      try {
         DatabaseConnection C = new DatabaseConnection();
         ResultSet resultSet = C.statement.executeQuery("select * from driver");
         while (resultSet.next()) {
            c.add(resultSet.getString("carname"));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      // Table
      JTable table = new JTable();
      table.setBounds(10, 225, 800, 250);
      table.setBackground(new Color(3, 45, 48));
      table.setForeground(Color.WHITE);
      panel.add(table);

      try {
         DatabaseConnection Cn = new DatabaseConnection();
         String q = "select * from driver";
         ResultSet resultSet = Cn.statement.executeQuery(q);
         table.setModel(DbUtils.resultSetToTableModel(resultSet));
      } catch (Exception E) {
         E.printStackTrace();
      }

      // label for name
      JLabel name = new JLabel("Name");
      name.setBounds(24, 200, 46, 14);
      name.setForeground(Color.WHITE);
      panel.add(name);

      // label for age
      JLabel age = new JLabel("Age");
      age.setBounds(165, 200, 46, 14);
      age.setForeground(Color.WHITE);
      panel.add(age);

      // label for car gender
      JLabel gender = new JLabel("Gender");
      gender.setBounds(264, 200, 46, 14);
      gender.setForeground(Color.WHITE);
      panel.add(gender);

      // label for car company
      JLabel company = new JLabel("Company");
      company.setBounds(366, 200, 100, 14);
      company.setForeground(Color.WHITE);
      panel.add(company);

      // label for car name
      JLabel carname = new JLabel("Car Name");
      carname.setBounds(486, 200, 100, 14);
      carname.setForeground(Color.WHITE);
      panel.add(carname);

      // label for available
      JLabel available = new JLabel("Available");
      available.setBounds(600, 200, 100, 14);
      available.setForeground(Color.WHITE);
      panel.add(available);

      // label for location
      JLabel location = new JLabel("Location");
      location.setBounds(700, 200, 100, 14);
      location.setForeground(Color.WHITE);
      panel.add(location);

      // Display Button
      JButton display = new JButton("Display");
      display.setBounds(200, 500, 150, 30);
      display.setBackground(Color.BLACK);
      display.setForeground(Color.WHITE);
      panel.add(display);
      display.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String q = "select * from driver where carname= '" + c.getSelectedItem() + "'";
            try {
               DatabaseConnection c = new DatabaseConnection();
               ResultSet resultSet = c.statement.executeQuery(q);
               table.setModel(DbUtils.resultSetToTableModel(resultSet));
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      // back button
      JButton back = new JButton("Back");
      back.setBounds(420, 500, 150, 30);
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
      setSize(800, 600);
      setLocation(400, 100);
      setVisible(true);
   }

   public static void main(String[] args) {
      new Pickup();
   }
}
