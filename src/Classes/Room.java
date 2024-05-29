package Classes;

import java.awt.*;
import javax.swing.*;

public class Room extends JFrame {
   JTable table;

   Room() {
      // panel
      JPanel panel = new JPanel();
      panel.setBounds(5, 5, 890, 590);
      panel.setBackground(new Color(3, 45, 48));
      panel.setLayout(null);
      add(panel);

      ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icons/room-service.png"));
      Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
      ImageIcon imageIcon1 = new ImageIcon(image);
      JLabel label = new JLabel(imageIcon1);
      label.setBounds(600, 200, 200, 200);
      panel.add(label);

      // Table
      table = new JTable();
      table.setBounds(10, 40, 500, 400);
      table.setBackground(new Color(3, 45, 48));
      table.setForeground(Color.WHITE);
      panel.add(table);

      // Frame
      setUndecorated(true);
      setLayout(null);
      setLocation(300, 100);
      setSize(900, 600);
      setVisible(true);
   }

   public static void main(String[] args) {
      new Room();
   }
}
