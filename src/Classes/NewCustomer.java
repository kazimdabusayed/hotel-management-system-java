package Classes;

import java.awt.*;
import javax.swing.*;

public class NewCustomer extends JFrame{
   NewCustomer() {

      // Panel
      JPanel panel = new JPanel();
      panel.setBounds(5, 5, 840, 540);
      panel.setLayout(null);
      panel.setBackground(new Color(3, 45, 48));
      add(panel);

      // Image
      ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icons/new_account.png"));
      Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
      ImageIcon imageIcon1 = new ImageIcon(image);
      JLabel imgJLabel = new JLabel(imageIcon1);
      imgJLabel.setBounds(550, 150, 200, 200);
      panel.add(imgJLabel);

      JLabel labelName = new JLabel("NEW CUSTOMER FORM");
      labelName.setBounds(118, 11, 260, 53);
      labelName.setFont(new Font("Tahoma", Font.BOLD, 20));
      labelName.setForeground(Color.WHITE);
      panel.add(labelName);

      // Frame
      setLayout(null);
      setLocation(500, 150);
      setSize(850, 550);
      setVisible(true);
   }

   public static void main(String[] args) {
      new NewCustomer();
   }
}
