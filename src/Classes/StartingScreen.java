package Classes;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StartingScreen extends JFrame {

   StartingScreen() {
      super("Hotel Zero Star");

      ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icons/StartingScreen.gif"));
      JLabel label = new JLabel(imageIcon);
      label.setBounds(0, 0, 1500, 1000);
      add(label);

      setLayout(null);
      setLocation(300, 50);
      setSize(1500, 1200);
      setVisible(true);

      try {
         Thread.sleep(5000);
         new LoginPage();
         setVisible(false);

      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   public static void main(String[] args) {
      new StartingScreen();
   }
}

