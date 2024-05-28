package Classes;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;

public class Reception extends JFrame{
   Reception() {

      // Panels
      JPanel panel = new JPanel();
      panel.setLayout(null);
      panel.setBounds(300, 5, 1600, 1090);
      panel.setBackground(new Color(3, 45, 48));
      add(panel);

      JPanel Panel1 = new JPanel();
      Panel1.setLayout(null);
      Panel1.setBounds(5, 5, 280, 1000);
      Panel1.setBackground(new Color(3, 45, 48));
      add(Panel1);

      // Image
      ImageIcon imageIconc = new ImageIcon(ClassLoader.getSystemResource("Icons/new_logo_reception.gif"));
      Image i1 = imageIconc.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
      setLayout(null);
      ImageIcon imageIconi1 = new ImageIcon(i1);
      JLabel Label1 = new JLabel(imageIconi1);
      Label1.setBounds(600, 300, 500, 500);
      panel.add(Label1);

      ImageIcon imageIconb = new ImageIcon(ClassLoader.getSystemResource("Icons/Logo.gif"));
      Image i2 = imageIconb.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
      setLayout(null);
      ImageIcon imageIconi2 = new ImageIcon(i2);
      JLabel Label2 = new JLabel(imageIconi2);
      Label2.setBounds(-50, 500, 400, 500);
      Panel1.add(Label2);

      // Frame
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);
      setSize(1950, 1090);
      setVisible(true);
   }
   public static void main(String[] args) {
      new Reception();
   }
}
