package Classes;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Reception extends JFrame{
   Reception() {
      super("Reception | Hotel Zero Star");

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
      Label2.setBounds(-60, 370, 400, 500);
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
               new NewCustomer();
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
               new Room();
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
               new Department();
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      JButton btnAEI = new JButton("All Employees Info");
      btnAEI.setBounds(30, 150, 200, 30);
      btnAEI.setBackground(Color.BLACK);
      btnAEI.setForeground(Color.WHITE);
      Panel1.add(btnAEI);
      btnAEI.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               new Employees();
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
               new CustomerInfo();
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
               new ManagerInfo();
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      JButton btnCO = new JButton("CheckOut");
      btnCO.setBounds(30, 270, 200, 30);
      btnCO.setBackground(Color.BLACK);
      btnCO.setForeground(Color.WHITE);
      Panel1.add(btnCO);
      btnCO.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               new CheckOut();
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      JButton btnUC = new JButton("Update check in details");
      btnUC.setBounds(30, 310, 200, 30);
      btnUC.setBackground(Color.BLACK);
      btnUC.setForeground(Color.WHITE);
      Panel1.add(btnUC);
      btnUC.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               new UpdateCheck();
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      JButton btnURS = new JButton("Update room status");
      btnURS.setBounds(30, 350, 200, 30);
      btnURS.setBackground(Color.BLACK);
      btnURS.setForeground(Color.WHITE);
      Panel1.add(btnURS);
      btnURS.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               new UpdateRoom();
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      JButton btnPS = new JButton("Pickup service");
      btnPS.setBounds(30, 390, 200, 30);
      btnPS.setBackground(Color.BLACK);
      btnPS.setForeground(Color.WHITE);
      Panel1.add(btnPS);
      btnPS.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               new Pickup();
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      JButton btnSR = new JButton("Search room");
      btnSR.setBounds(30, 430, 200, 30);
      btnSR.setBackground(Color.BLACK);
      btnSR.setForeground(Color.WHITE);
      Panel1.add(btnSR);
      btnSR.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               // new SearchRoom();
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      JButton logout = new JButton("Logout");
      logout.setBounds(30, 470, 95, 30);
      logout.setBackground(Color.BLACK);
      logout.setForeground(Color.WHITE);
      Panel1.add(logout);
      logout.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               System.exit(500);
            } catch (Exception E) {
               E.printStackTrace();
            }
         }
      });

      JButton back = new JButton("back");
      back.setBounds(140, 470, 95, 30);
      back.setBackground(Color.BLACK);
      back.setForeground(Color.WHITE);
      Panel1.add(back);
      back.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            try {
               setVisible(false);
               new DashBoard();
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
