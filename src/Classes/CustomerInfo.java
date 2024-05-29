package Classes;

import java.awt.Color;
import java.awt.Frame;
import java.sql.ResultSet;

import javax.swing.JPanel;
import javax.swing.JTable;

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

      // Frame
      setUndecorated(true);
      setLayout(null);
      setSize(900, 600);
      setLocation(500, 100);
      setVisible(true);
   }

   public static void main(String[] args) {
      new CustomerInfo();
   }
}
