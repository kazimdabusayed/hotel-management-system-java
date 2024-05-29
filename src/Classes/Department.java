package Classes;

import javax.swing.*;
import java.awt.*;

public class Department extends JFrame{
   Department() {
      JPanel panel = new JPanel();
      panel.setBackground(new Color(3, 45, 48));
      panel.setBounds(5, 5, 690, 490);
      panel.setLayout(null);
      add(panel);

      // Frame
      setUndecorated(true);
      setLayout(null);
      setLocation(500, 130);
      setSize(700, 500);
      setVisible(true);
   }
   public static void main(String[] args) {
      new Department();
   }
}
