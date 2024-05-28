package Classes;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
      Label1.setBounds(250, 160, 500, 500);
      panel.add(Label1);

      ImageIcon imageIconb = new ImageIcon(ClassLoader.getSystemResource("Icons/Logo.gif"));
      Image i2 = imageIconb.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
      setLayout(null);
      ImageIcon imageIconi2 = new ImageIcon(i2);
      JLabel Label2 = new JLabel(imageIconi2);
      Label2.setBounds(-60, 350, 400, 500);
      Panel1.add(Label2);

      // Buttons
      JButton btnNCF = new JButton("New Customer form");
      btnNCF.setBounds(30, 30, 200, 30);
      btnNCF.setBackground(Color.BLACK);
      btnNCF.setForeground(Color.WHITE);
      Panel1.add(btnNCF);
      btnNCF.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               // new NewCustomer();
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      JButton btnRoom = new JButton("New room");
      btnRoom.setBounds(30, 70, 200, 30);
      btnRoom.setBackground(Color.BLACK);
      btnRoom.setForeground(Color.WHITE);
      Panel1.add(btnRoom);
      btnRoom.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               // new Room();
            } catch (Exception E) {
               E.printStackTrace();

            }
         }
      });

      JButton btnDepartment = new JButton("Departments");
      btnDepartment.setBounds(30, 110, 200, 30);
      btnDepartment.setBackground(Color.BLACK);
      btnDepartment.setForeground(Color.WHITE);
      Panel1.add(btnDepartment);

      btnDepartment.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               // new Department();
            } catch (Exception E) {
               E.printStackTrace();
            }
         }

      });
      JButton btnAEI = new JButton("All Employes Info");
      btnAEI.setBounds(30, 150, 200, 30);
      btnAEI.setBackground(Color.BLACK);
      btnAEI.setForeground(Color.WHITE);
      Panel1.add(btnAEI);

      btnAEI.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               // new AllEmployee();
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      JButton btnCI = new JButton("Customer Info");
      btnCI.setBounds(30, 190, 200, 30);
      btnCI.setBackground(Color.BLACK);
      btnCI.setForeground(Color.WHITE);
      Panel1.add(btnCI);

      btnCI.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               // new CustomerInfo();
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      JButton btnMI = new JButton("Manager info");
      btnMI.setBounds(30, 230, 200, 30);
      btnMI.setBackground(Color.BLACK);
      btnMI.setForeground(Color.WHITE);
      Panel1.add(btnMI);

      btnMI.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               // new ManagerInfo();
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

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
