package Classes;

import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame{
   Department() {
      // panel
      JPanel panel = new JPanel();
      panel.setBackground(new Color(3, 45, 48));
      panel.setBounds(5, 5, 690, 490);
      panel.setLayout(null);
      add(panel);

      // table
      JTable table = new JTable();
      table.setBounds(50, 40, 600, 350);
      table.setBackground(new Color(4, 45, 48));
      table.setForeground(Color.WHITE);
      panel.add(table);

      try {
         DatabaseConnection c = new DatabaseConnection();
         String departmentInfo = "select * from department";
         ResultSet resultSet = c.statement.executeQuery(departmentInfo);
         table.setModel(DbUtils.resultSetToTableModel(resultSet));
      } catch (Exception e) {
         e.printStackTrace();
      }

      // button
      JButton back = new JButton("BACK");
      back.setBounds(290, 410, 120, 30);
      back.setBackground(Color.BLACK);
      back.setForeground(Color.WHITE);
      panel.add(back);
      back.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            setVisible(false);
         }
      });

      // label
      JLabel label1 = new JLabel("Department");
      label1.setBounds(145, 11, 105, 20);
      label1.setForeground(Color.WHITE);
      label1.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(label1);

      JLabel label2 = new JLabel("Budget");
      label2.setBounds(431, 11, 105, 20);
      label2.setForeground(Color.WHITE);
      label2.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(label2);

      // Frame
      setUndecorated(true);
      setLayout(null);
      setLocation(500, 130);
      setSize(700, 500);
      setVisible(true);
   }
   public static void main(String[] args) {
      new Department();
   }
}
