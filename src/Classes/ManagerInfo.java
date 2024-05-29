package Classes;

import java.awt.Color;
import java.awt.Font;
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

      // table
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
      back.setBounds(400, 500, 120, 30);
      back.setBackground(Color.BLACK);
      back.setForeground(Color.WHITE);
      panel.add(back);
      back.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            setVisible(false);
         }
      });

      // Label
      JLabel name = new JLabel("Name");
      name.setBounds(41, 11, 70, 19);
      name.setForeground(Color.WHITE);
      name.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(name);

      JLabel Age = new JLabel("Age");
      Age.setBounds(159, 11, 70, 19);
      Age.setForeground(Color.WHITE);
      Age.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(Age);

      JLabel gender = new JLabel("Gender");
      gender.setBounds(273, 11, 70, 19);
      gender.setForeground(Color.WHITE);
      gender.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(gender);

      JLabel job = new JLabel("Job");
      job.setBounds(416, 11, 70, 19);
      job.setForeground(Color.WHITE);
      job.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(job);

      JLabel salary = new JLabel("Salary");
      salary.setBounds(536, 11, 70, 19);
      salary.setForeground(Color.WHITE);
      salary.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(salary);

      JLabel phone = new JLabel("Phone");
      phone.setBounds(656, 11, 70, 19);
      phone.setForeground(Color.WHITE);
      phone.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(phone);

      JLabel gmail = new JLabel("Gmail");
      gmail.setBounds(786, 11, 70, 19);
      gmail.setForeground(Color.WHITE);
      gmail.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(gmail);

      JLabel nid = new JLabel("NID");
      nid.setBounds(896, 11, 70, 19);
      nid.setForeground(Color.WHITE);
      nid.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(nid);

      // Frame
      setUndecorated(true);
      setLayout(null);
      setLocation(340, 100);
      setSize(1000, 600);
      setVisible(true);
   }
   public static void main(String[] args) {
      new ManagerInfo();
   }
}
