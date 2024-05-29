package Classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class UpdateRoom extends JFrame{
   UpdateRoom() {
      JPanel panel = new JPanel();
      panel.setBounds(5, 5, 940, 490);
      panel.setBackground(new Color(3, 45, 48));
      panel.setLayout(null);
      add(panel);

      ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("Icons/update.png"));
      Image image = icon.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
      ImageIcon icon1 = new ImageIcon(image);
      JLabel label = new JLabel(icon1);
      label.setBounds(600, 100, 250, 250);
      panel.add(label);

      JLabel label1 = new JLabel("Update Room Status");
      label1.setBounds(124, 11, 222, 25);
      label1.setFont(new Font("Tahoma", Font.BOLD, 20));
      label1.setForeground(Color.WHITE);
      panel.add(label1);

      // Frame
      setUndecorated(true);
      setLayout(null);
      setSize(950, 500);
      setLocation(400, 150);
      setVisible(true);
   }
   public static void main(String[] args) {
      new UpdateRoom();
   }
}
