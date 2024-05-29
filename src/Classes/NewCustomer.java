package Classes;

import java.awt.*;
import javax.swing.*;

public class NewCustomer extends JFrame {
   JComboBox<String> comboBox;
   JTextField textFieldNumber, textFieldName, textFieldCountry, textFieldDeposite;
   JRadioButton r1, r2;

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

      // Frame
      setLayout(null);
      setLocation(500, 150);
      setSize(850, 550);
      setVisible(true);
   }

   public static void main(String[] args) {
      new NewCustomer();
   }
}
