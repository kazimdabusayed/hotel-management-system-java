package Classes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class ManagerInfo extends JFrame{
   ManagerInfo() {
      // panel
      JPanel panel = new JPanel();
      panel.setBounds(5, 5, 990, 590);
      panel.setBackground(new Color(3, 45, 48));
      panel.setLayout(null);
      add(panel);

      JTable table = new JTable();
      table.setBounds(10, 34, 980, 450);
      table.setForeground(Color.WHITE);
      table.setBackground(new Color(3, 45, 48));
      panel.add(table);

      try {
         DatabaseConnection c = new DatabaseConnection();
         String q = "select * from Employee where job = 'Manager'";
         ResultSet resultSet = c.statement.executeQuery(q);
         table.setModel(DbUtils.resultSetToTableModel(resultSet));
      } catch (Exception e) {
         e.printStackTrace();
      }

      JButton back = new JButton("BACK");
      back.setBounds(350, 500, 120, 30);
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
      setLocation(300, 100);
      setSize(1000, 600);
      setVisible(true);
   }
   public static void main(String[] args) {
      new ManagerInfo();
   }
}
