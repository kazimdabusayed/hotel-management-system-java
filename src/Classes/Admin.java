package Classes;

import java.awt.*;
import javax.swing.*;

public class Admin extends JFrame{
   Admin() {
      //Image
      ImageIcon L1 = new ImageIcon(ClassLoader.getSystemResource("Icons/new-employee.png"));
      Image L11 = L1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
      ImageIcon imageIcon1 = new ImageIcon(L11);
      JLabel label = new JLabel(imageIcon1);
      label.setBounds(70, 180, 120, 120);
      add(label);

      ImageIcon L2 = new ImageIcon(ClassLoader.getSystemResource("Icons/room.png"));
      Image L22 = L2.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
      ImageIcon imageIcon2 = new ImageIcon(L22);
      JLabel label2 = new JLabel(imageIcon2);
      label2.setBounds(70, 290, 120, 120);
      add(label2);

      ImageIcon L3 = new ImageIcon(ClassLoader.getSystemResource("Icons/driver.png"));
      Image L33 = L3.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
      ImageIcon imageIcon3 = new ImageIcon(L33);
      JLabel label3 = new JLabel(imageIcon3);
      label3.setBounds(70, 420, 120, 120);
      add(label3);

      ImageIcon HotelLogo = new ImageIcon(ClassLoader.getSystemResource("Icons/new_logo.gif"));
      Image HotelLogo1 = HotelLogo.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
      ImageIcon imageIcon4 = new ImageIcon(HotelLogo1);
      JLabel label4 = new JLabel(imageIcon4);
      label4.setBounds(800, 150, 500, 500);
      add(label4);

      getContentPane().setBackground(new Color(3, 45, 48));
      setLayout(null);
      setSize(1950, 1090);
      setVisible(true);
   }
   public static void main(String[] args) {
      new Admin();
   }
}
