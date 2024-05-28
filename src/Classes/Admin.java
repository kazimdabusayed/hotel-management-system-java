package Classes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Admin extends JFrame implements ActionListener{
   JButton add_Emplyee, add_Room, add_Drivers, logout, back;

   Admin() {
      // Buttons
      add_Emplyee = new JButton("ADD EMPLOYEE");
      add_Emplyee.setBounds(250, 230, 200, 30);
      add_Emplyee.setBackground(Color.WHITE);
      add_Emplyee.setForeground(Color.BLACK);
      add_Emplyee.setFont(new Font("Tahoma", Font.BOLD, 15));
      add_Emplyee.addActionListener(this);
      add(add_Emplyee);

      add_Room = new JButton("ADD ROOM");
      add_Room.setBounds(250, 350, 200, 30);
      add_Room.setBackground(Color.WHITE);
      add_Room.setForeground(Color.BLACK);
      add_Room.setFont(new Font("Tahoma", Font.BOLD, 15));
      add_Room.addActionListener(this);
      add(add_Room);

      add_Drivers = new JButton("ADD Driver");
      add_Drivers.setBounds(250, 480, 200, 30);
      add_Drivers.setBackground(Color.WHITE);
      add_Drivers.setForeground(Color.BLACK);
      add_Drivers.setFont(new Font("Tahoma", Font.BOLD, 15));
      add_Drivers.addActionListener(this);
      add(add_Drivers);

      logout = new JButton("Logout");
      logout.setBounds(40, 670, 95, 30);
      logout.setBackground(Color.BLACK);
      logout.setForeground(Color.WHITE);
      logout.setFont(new Font("Tahoma", Font.BOLD, 15));
      logout.addActionListener(this);
      add(logout);

      back = new JButton("Back");
      back.setBounds(170, 670, 95, 30);
      back.setBackground(Color.BLACK);
      back.setForeground(Color.WHITE);
      back.setFont(new Font("Tahoma", Font.BOLD, 15));
      back.addActionListener(this);
      add(back);

      //Image
      ImageIcon L1 = new ImageIcon(ClassLoader.getSystemResource("Icons/new_employee.png"));
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

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == add_Emplyee) {
         // new AddEmployee();
      } else if (e.getSource() == add_Room) {
         new AddRoom();
      } else if (e.getSource() == add_Drivers) {
         // new AddDriver();
      } else if (e.getSource() == logout) {
         System.exit(102);
      } else if (e.getSource() == back) {
         new DashBoard();
         setVisible(false);
      }
   }
   public static void main(String[] args) {
      new Admin();
   }
}
