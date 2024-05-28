package Classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DashBoard extends JFrame implements ActionListener{

   JButton add, rec;

   DashBoard() {
      super("Hotel Zero Star");
      // Reception Button
      rec = new JButton("Reception");
      rec.setBounds(425, 510, 140, 30);
      rec.setFont(new Font("Tahoma", Font.BOLD, 15));
      rec.setBackground(new Color(255, 98, 0));
      rec.setForeground(Color.white);
      rec.addActionListener(this);
      add(rec);

      // Admin button
      add = new JButton("Admin");
      add.setBounds(1200, 510, 140, 30);
      add.setFont(new Font("Tahoma", Font.BOLD, 15));
      add.setBackground(new Color(255, 98, 0));
      add.setForeground(Color.white);
      add.addActionListener(this);
      add(add);

      // Image
      ImageIcon imageIconc = new ImageIcon(ClassLoader.getSystemResource("Icons/reception.png"));
      Image i3 = imageIconc.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
      setLayout(null);
      ImageIcon imageIcon22 = new ImageIcon(i3);
      JLabel label3 = new JLabel(imageIcon22);
      label3.setBounds(280, 150, 450, 512);
      add(label3);

      ImageIcon imageIconb = new ImageIcon(ClassLoader.getSystemResource("Icons/boss.png"));
      Image i2 = imageIconb.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
      setLayout(null);
      ImageIcon imageIcon11 = new ImageIcon(i2);
      JLabel label1 = new JLabel(imageIcon11);
      label1.setBounds(1050, 150, 450, 512);
      add(label1);

      ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icons/Dashboard.gif"));
      Image i1 = imageIcon.getImage().getScaledInstance(1950, 1090, Image.SCALE_DEFAULT);
      setLayout(null);
      ImageIcon imageIcon1 = new ImageIcon(i1);
      JLabel label = new JLabel(imageIcon1);
      label.setBounds(0, 0, 1950, 1090);
      add(label);

      // Frame
      setLayout(null);
      setSize(1950, 1090);
      setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == rec) {
         new Reception();
      } else {
         new LoginPage2();
         setVisible(false);
      }
      // throw new UnsupportedOperationException("Unimplemented method
      // 'actionPerformed'");
   }
   public static void main(String[] args) {
      new DashBoard();
   }
}
