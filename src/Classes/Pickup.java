package Classes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Pickup extends JFrame{
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
