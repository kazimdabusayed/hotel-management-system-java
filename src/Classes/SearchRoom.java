package Classes;

import java.awt.*;
import java.sql.ResultSet;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class SearchRoom extends JFrame {
   JCheckBox checkBox;
   Choice choice;
   JTable table;
   JButton add, back;

   SearchRoom() {
      JPanel panel = new JPanel();
      panel.setBackground(new Color(3, 45, 48));
      panel.setBounds(5, 5, 690, 490);
      panel.setLayout(null);
      add(panel);

      JLabel searchForRoom = new JLabel("Search For Room");
      searchForRoom.setBounds(250, 15, 186, 31);
      searchForRoom.setForeground(Color.WHITE);
      searchForRoom.setFont(new Font("Tahoma", Font.BOLD, 20));
      panel.add(searchForRoom);

      JLabel rbt = new JLabel("Room Bed Type:");
      rbt.setBounds(50, 73, 120, 20);
      rbt.setForeground(Color.WHITE);
      rbt.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(rbt);

      JLabel rn = new JLabel("Room Number");
      rn.setBounds(23, 162, 150, 20);
      rn.setForeground(Color.WHITE);
      rn.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(rn);

      JLabel available = new JLabel("Availability");
      available.setBounds(175, 162, 150, 20);
      available.setForeground(Color.WHITE);
      available.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(available);

      JLabel price = new JLabel("Price");
      price.setBounds(458, 162, 150, 20);
      price.setForeground(Color.WHITE);
      price.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(price);

      JLabel BT = new JLabel("Bed Type");
      BT.setBounds(580, 162, 150, 20);
      BT.setForeground(Color.WHITE);
      BT.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(BT);

      JLabel SS = new JLabel("Clean Status");
      SS.setBounds(306, 162, 150, 20);
      SS.setForeground(Color.WHITE);
      SS.setFont(new Font("Tahoma", Font.BOLD, 14));
      panel.add(SS);

      checkBox = new JCheckBox("Only Display Available");
      checkBox.setBounds(400, 69, 205, 23);
      checkBox.setForeground(Color.WHITE);
      checkBox.setBackground(new Color(3, 45, 48));
      panel.add(checkBox);

      choice = new Choice();
      choice.add("Single Bed");
      choice.add("Double Bed");
      choice.setBounds(170, 70, 120, 20);
      panel.add(choice);

      table = new JTable();
      table.setBounds(0, 187, 700, 150);
      table.setBackground(new Color(3, 45, 48));
      table.setForeground(Color.WHITE);
      panel.add(table);

      try {
         DatabaseConnection c = new DatabaseConnection();
         String q = "select * from room";
         ResultSet resultSet = c.statement.executeQuery(q);
         table.setModel(DbUtils.resultSetToTableModel(resultSet));
      } catch (Exception e) {
         e.printStackTrace();
      }

      setUndecorated(true);
      setLayout(null);
      setLocation(400, 150);
      setSize(700, 500);
      setVisible(true);
   }
   public static void main(String[] args) {
      new SearchRoom();
   }
}