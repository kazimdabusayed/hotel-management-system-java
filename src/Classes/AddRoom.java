package Classes;

import javax.swing.*;
import java.awt.*;

public class AddRoom extends JFrame {
   JTextField t2;

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
