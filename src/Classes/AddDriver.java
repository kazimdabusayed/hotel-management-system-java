package Classes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AddDriver extends JFrame implements ActionListener{
   JTextField nameText, ageText, carCText, carNText, locText;
   JComboBox<String> comboBox, comboBox1;
   JButton add, back;

   AddDriver() {
      // Panel
      JPanel panel = new JPanel();
      panel.setBounds(5, 5, 890, 490);
      panel.setBackground(new Color(3, 45, 48));
      panel.setLayout(null);
      add(panel);

      // Label
      JLabel label = new JLabel("ADD DRIVERS");
      label.setBounds(194, 10, 230, 22);
      label.setForeground(Color.WHITE);
      label.setFont(new Font("Tahoma", Font.BOLD, 22));
      panel.add(label);

      JLabel name = new JLabel("NAME:");
      name.setBounds(64, 70, 102, 23);
      name.setFont(new Font("Tahoma", Font.BOLD, 14));
      name.setForeground(Color.WHITE);
      panel.add(name);

      // TextField fpr name
      nameText = new JTextField();
      nameText.setBounds(195, 70, 156, 23);
      nameText.setForeground(Color.WHITE);
      nameText.setFont(new Font("Tahoma", Font.BOLD, 14));
      nameText.setBackground(new Color(16, 108, 115));
      panel.add(nameText);

      // AGE
      JLabel age = new JLabel("AGE:");
      age.setBounds(64, 110, 102, 23);
      age.setFont(new Font("Tahoma", Font.BOLD, 14));
      age.setForeground(Color.WHITE);
      panel.add(age);

      // TextField for Age
      ageText = new JTextField();
      ageText.setBounds(195, 110, 156, 23);
      ageText.setForeground(Color.WHITE);
      ageText.setFont(new Font("Tahoma", Font.BOLD, 14));
      ageText.setBackground(new Color(16, 108, 115));
      panel.add(ageText);

      // Gender
      JLabel gender = new JLabel("GENDER:");
      gender.setBounds(64, 150, 102, 23);
      gender.setFont(new Font("Tahoma", Font.BOLD, 14));
      gender.setForeground(Color.WHITE);
      panel.add(gender);

      // Combobox
      comboBox = new JComboBox<>(new String[] { "Male", "Female" });
      comboBox.setBounds(195, 150, 154, 23);
      comboBox.setForeground(Color.WHITE);
      comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
      comboBox.setBackground(new Color(16, 108, 115));
      panel.add(comboBox);

      // Company
      JLabel carC = new JLabel("CAR COMPANY:");
      carC.setBounds(64, 190, 130, 23);
      carC.setFont(new Font("Tahoma", Font.BOLD, 14));
      carC.setForeground(Color.WHITE);
      panel.add(carC);

      // TextField for Company
      carCText = new JTextField();
      carCText.setBounds(195, 190, 156, 23);
      carCText.setForeground(Color.WHITE);
      carCText.setFont(new Font("Tahoma", Font.BOLD, 14));
      carCText.setBackground(new Color(16, 108, 115));
      panel.add(carCText);

      // CarName
      JLabel carN = new JLabel("CAR NAME:");
      carN.setBounds(64, 230, 102, 23);
      carN.setFont(new Font("Tahoma", Font.BOLD, 14));
      carN.setForeground(Color.WHITE);
      panel.add(carN);

      // TextField for CarName
      carNText = new JTextField();
      carNText.setBounds(195, 230, 156, 23);
      carNText.setForeground(Color.WHITE);
      carNText.setFont(new Font("Tahoma", Font.BOLD, 14));
      carNText.setBackground(new Color(16, 108, 115));
      panel.add(carNText);

      // Available
      JLabel available = new JLabel("AVAILABLE:");
      available.setBounds(64, 270, 102, 23);
      available.setFont(new Font("Tahoma", Font.BOLD, 14));
      available.setForeground(Color.WHITE);
      panel.add(available);

      // Combobox for available
      comboBox1 = new JComboBox<>(new String[] { "YES", "NO" });
      comboBox1.setBounds(195, 270, 154, 23);
      comboBox1.setForeground(Color.WHITE);
      comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
      comboBox1.setBackground(new Color(16, 108, 115));
      panel.add(comboBox1);

      // Location
      JLabel location = new JLabel("LOCATION:");
      location.setBounds(64, 310, 102, 23);
      location.setFont(new Font("Tahoma", Font.BOLD, 14));
      location.setForeground(Color.WHITE);
      panel.add(location);

      // TextField for Location
      locText = new JTextField();
      locText.setBounds(195, 310, 156, 23);
      locText.setForeground(Color.WHITE);
      locText.setFont(new Font("Tahoma", Font.BOLD, 14));
      locText.setBackground(new Color(16, 108, 115));
      panel.add(locText);

      // Buttons
      add = new JButton("ADD");
      add.setBounds(64, 380, 111, 33);
      add.setBackground(Color.BLACK);
      add.setForeground(Color.WHITE);
      add.addActionListener(this);
      panel.add(add);

      back = new JButton("BACK");
      back.setBounds(198, 380, 111, 33);
      back.setBackground(Color.BLACK);
      back.setForeground(Color.WHITE);
      back.addActionListener(this);
      panel.add(back);

      // Images
      ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icons/license.png"));
      Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
      ImageIcon imageIcon1 = new ImageIcon(image);
      JLabel label1 = new JLabel(imageIcon1);
      label1.setBounds(500, 60, 300, 300);
      panel.add(label1);

      // Frame
      setUndecorated(true);
      setLayout(null);
      setSize(900, 500);
      setLocation(23, 230);
      setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == add) {
         String name = nameText.getText();
         String age = ageText.getText();
         String gender = (String) comboBox.getSelectedItem();
         String company = carCText.getText();
         String carname = carNText.getText();
         String available = (String) comboBox1.getSelectedItem();
         String location = locText.getText();

         try {
            DatabaseConnection c = new DatabaseConnection();
            String q = "insert into driver values('"+name+"', '"+age+"','"+gender+"', '"+company+"', '"+carname+"', '"+available+"', '"+location+"')";
            c.statement.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "Driver Added");
            setVisible(false);
         } catch (Exception E) {
            E.printStackTrace();
         }
      } else {
         setVisible(false);
      }
   }
   public static void main(String[] args) {
      new AddDriver();
   }
}