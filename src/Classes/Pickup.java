package Classes;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
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
      table.setBounds(10, 220, 800, 250);
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

      // Frame
      setLayout(null);
      setSize(800, 600);
      setLocation(500, 100);
      setVisible(true);
   }

   public static void main(String[] args) {
      new Pickup();
   }
}
