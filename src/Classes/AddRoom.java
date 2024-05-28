package Classes;

import javax.swing.*;
import java.awt.*;

public class AddRoom extends JFrame {
   JTextField t2, t4;

   AddRoom() {
      // Panel
      JPanel panel = new JPanel();
      panel.setBounds(5, 5, 875, 490);
      panel.setBackground(new Color(3, 45, 48));
      panel.setLayout(null);
      add(panel);

      // Labels
      JLabel l1 = new JLabel("Add room");
      l1.setBounds(194, 10, 160, 22);
      l1.setFont(new Font("Tahoma", Font.BOLD, 22));
      l1.setForeground(Color.WHITE);
      panel.add(l1);

      JLabel l2 = new JLabel("Room number");
      l2.setBounds(64, 70, 152, 22);
      l2.setFont(new Font("Tahoma", Font.BOLD, 14));
      l2.setForeground(Color.WHITE);
      panel.add(l2);

      // Textfields
      t2 = new JTextField();
      t2.setBounds(200, 70, 156, 20);
      t2.setFont(new Font("Tahoma", Font.PLAIN, 14));
      t2.setForeground(Color.WHITE);
      t2.setBackground(new Color(16, 108, 115));
      panel.add(t2);

      JLabel l3 = new JLabel("Availability");
      l3.setBounds(64, 110, 152, 22);
      l3.setFont(new Font("Tahoma", Font.BOLD, 14));
      l3.setForeground(Color.WHITE);
      panel.add(l3);

      // Combobox
      JComboBox<String> t3 = new JComboBox<>(new String[] { "Available", "Occupied" });
      t3.setBounds(200, 110, 156, 20);
      t3.setFont(new Font("Tahoma", Font.PLAIN, 14));
      t3.setForeground(Color.WHITE);
      t3.setBackground(new Color(16, 108, 115));
      panel.add(t3);

      JLabel l4 = new JLabel("Price");
      l4.setBounds(64, 150, 152, 22);
      l4.setFont(new Font("Tahoma", Font.BOLD, 14));
      l4.setForeground(Color.WHITE);
      panel.add(l4);

      t4 = new JTextField();
      t4.setBounds(200, 150, 156, 20);
      t4.setFont(new Font("Tahoma", Font.PLAIN, 14));
      t4.setForeground(Color.WHITE);
      t4.setBackground(new Color(16, 108, 115));
      panel.add(t4);

      JLabel l5 = new JLabel("Cleaning Status");
      l5.setBounds(64, 190, 156, 22);
      l5.setFont(new Font("Tahoma", Font.BOLD, 14));
      l5.setForeground(Color.WHITE);
      panel.add(l5);

      JComboBox<String> t5 = new JComboBox<>(new String[] {"Clean", "Dirty"});
      t5.setBounds(200, 190, 156, 20);
      t5.setFont(new Font("Tahoma", Font.PLAIN, 14));
      t5.setForeground(Color.WHITE);
      t5.setBackground(new Color(16, 108, 115));
      panel.add(t5);

      JLabel l6 = new JLabel("Bed Type");
      l6.setBounds(64, 230, 156, 22);
      l6.setFont(new Font("Tahoma", Font.BOLD, 14));
      l6.setForeground(Color.WHITE);
      panel.add(l6);

      JComboBox<String> t6 = new JComboBox<>(new String[] { "Single bed", "Double Bed" });
      t6.setBounds(200, 232, 156, 20);
      t6.setFont(new Font("Tahoma", Font.PLAIN, 14));
      t6.setForeground(Color.WHITE);
      t6.setBackground(new Color(16, 108, 115));
      panel.add(t6);

      // Frame
      setUndecorated(true);
      setLocation(20, 200);
      setLayout(null);
      setSize(885, 500);
      setVisible(true);
   }
   public static void main(String[] args) {
      new AddRoom();
   }
}
