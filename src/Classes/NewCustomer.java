package Classes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.*;

public class NewCustomer extends JFrame implements ActionListener {

   JComboBox<String> comboBox;
   JTextField textFieldNumber, textFieldName, textFieldCountry, textFieldDeposite;
   JRadioButton r1, r2;
   Choice c1;
   JLabel date;
   JButton add, back;

   NewCustomer() {
      super("New Customer | Hotel Zero Star");
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

      JLabel labelId = new JLabel("ID:");
      labelId.setBounds(35, 76, 200, 14);
      labelId.setFont(new Font("Tahoma", Font.PLAIN, 14));
      labelId.setForeground(Color.WHITE);
      panel.add(labelId);

      // Combobox
      comboBox = new JComboBox<>(new String[] { "Passport", "National ID", "Driving License" });
      comboBox.setBounds(271, 73, 150, 20);
      comboBox.setBackground(new Color(3, 45, 48));
      comboBox.setForeground(Color.white);
      comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
      panel.add(comboBox);

      // Label for number
      JLabel labelNumber = new JLabel("Number:");
      labelNumber.setBounds(35, 111, 200, 14);
      labelNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
      labelNumber.setForeground(Color.WHITE);
      panel.add(labelNumber);

      // TExtfield for number
      textFieldNumber = new JTextField();
      textFieldNumber.setBounds(271, 111, 150, 20);
      panel.add(textFieldNumber);

      // Label for name
      JLabel labelname = new JLabel("Name:");
      labelname.setBounds(35, 151, 200, 15);
      labelname.setFont(new Font("Tahoma", Font.PLAIN, 14));
      labelname.setForeground(Color.WHITE);
      panel.add(labelname);

      // TExtfield for name
      textFieldName = new JTextField();
      textFieldName.setBounds(271, 151, 150, 20);
      panel.add(textFieldName);

      // Label for gender
      JLabel labelGender = new JLabel("Gender:");
      labelGender.setBounds(35, 191, 200, 15);
      labelGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
      labelGender.setForeground(Color.WHITE);
      panel.add(labelGender);

      // Button for male
      r1 = new JRadioButton("Male");
      r1.setFont(new Font("Tahoma", Font.BOLD, 14));
      r1.setForeground(Color.WHITE);
      r1.setBackground(new Color(3, 45, 48));
      r1.setBounds(271, 191, 80, 12);
      panel.add(r1);

      // Button for Female
      r2 = new JRadioButton("Female");
      r2.setFont(new Font("Tahoma", Font.BOLD, 14));
      r2.setForeground(Color.WHITE);
      r2.setBackground(new Color(3, 45, 48));
      r2.setBounds(350, 191, 80, 12);
      panel.add(r2);

      // Label for Country
      JLabel labelCountry = new JLabel("Country:");
      labelCountry.setBounds(35, 231, 200, 15);
      labelCountry.setFont(new Font("Tahoma", Font.PLAIN, 14));
      labelCountry.setForeground(Color.WHITE);
      panel.add(labelCountry);

      // Textfield for country
      textFieldCountry = new JTextField();
      textFieldCountry.setBounds(271, 231, 150, 20);
      panel.add(textFieldCountry);

      // Label for Alocated Room
      JLabel labelRoom = new JLabel("Allocated Room Number:");
      labelRoom.setBounds(35, 274, 200, 15);
      labelRoom.setFont(new Font("Tahoma", Font.PLAIN, 14));
      labelRoom.setForeground(Color.WHITE);
      panel.add(labelRoom);

      // Choices
      c1 = new Choice();

      try {
         DatabaseConnection c = new DatabaseConnection();
         ResultSet resultSet = c.statement.executeQuery("select * from room");
         while (resultSet.next()) {
            c1.add(resultSet.getString("roomnumber"));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      c1.setBounds(271, 274, 150, 20);
      c1.setFont(new Font("Tahoma", Font.BOLD, 14));
      c1.setForeground(Color.WHITE);
      c1.setBackground(new Color(3, 45, 48));
      panel.add(c1);

      // Label for Checkin status
      JLabel labelCheckInStatus = new JLabel("Checked-In:");
      labelCheckInStatus.setBounds(35, 316, 200, 15);
      labelCheckInStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
      labelCheckInStatus.setForeground(Color.WHITE);
      panel.add(labelCheckInStatus);

      // Date
      Date date1 = new Date();
      date = new JLabel("" + date1);
      date.setBounds(271, 316, 210, 15);
      date.setFont(new Font("Tahoma", Font.PLAIN, 14));
      date.setForeground(Color.WHITE);
      panel.add(date);

      // Label for deposite
      JLabel labelDeposite = new JLabel("Deposite:");
      labelDeposite.setBounds(35, 359, 200, 15);
      labelDeposite.setFont(new Font("Tahoma", Font.PLAIN, 14));
      labelDeposite.setForeground(Color.WHITE);
      panel.add(labelDeposite);

      // Textfield for deposite
      textFieldDeposite = new JTextField();
      textFieldDeposite.setBounds(271, 359, 150, 20);
      panel.add(textFieldDeposite);

      // Buttons
      add = new JButton("ADD");
      add.setBounds(100, 430, 120, 30);
      add.setForeground(Color.WHITE);
      add.setBackground(Color.BLACK);
      add.addActionListener(this);
      panel.add(add);

      back = new JButton("BACK");
      back.setBounds(260, 430, 120, 30);
      back.setForeground(Color.WHITE);
      back.setBackground(Color.BLACK);
      back.addActionListener(this);
      panel.add(back);

      // Frame
      setLayout(null);
      setLocation(500, 150);
      setSize(850, 550);
      setVisible(true);
   }

   public static void main(String[] args) {
      new NewCustomer();
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      
   }
}
