package Classes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AddEmployee extends JFrame implements ActionListener{
   JButton add, back;
   JComboBox<String> comboBox;
   JTextField nameText, ageText, salaryText, phoneText, nidNum, emailText;
   JRadioButton radioButtonM, radioButtonF;

   AddEmployee() {
      // Jpanel
      JPanel panel = new JPanel();
      panel.setBounds(5, 5, 890, 490);
      panel.setLayout(null);
      panel.setBackground(new Color(3, 45, 48));
      add(panel);

      // Texts
      JLabel name = new JLabel("NAME:");
      name.setBounds(60, 30, 150, 27);
      name.setFont(new Font("serif", Font.BOLD, 17));
      name.setForeground(Color.WHITE);
      panel.add(name);

      // Textfields
      nameText = new JTextField();
      nameText.setBounds(200, 30, 150, 27);
      nameText.setBackground(new Color(16, 108, 115));
      nameText.setFont(new Font("Tahoma", Font.BOLD, 14));
      nameText.setForeground(Color.WHITE);
      panel.add(nameText);

      // Texts for age
      JLabel Age = new JLabel("AGE:");
      Age.setBounds(60, 80, 150, 27);
      Age.setFont(new Font("serif", Font.BOLD, 17));
      Age.setForeground(Color.WHITE);
      panel.add(Age);

      // Textfields
      ageText = new JTextField();
      ageText.setBounds(200, 80, 150, 27);
      ageText.setBackground(new Color(16, 108, 115));
      ageText.setFont(new Font("Tahoma", Font.BOLD, 14));
      ageText.setForeground(Color.WHITE);
      panel.add(ageText);

      JLabel Gender = new JLabel("GENDER:");
      Gender.setBounds(60, 120, 150, 27);
      Gender.setFont(new Font("serif", Font.BOLD, 17));
      Gender.setForeground(Color.WHITE);
      panel.add(Gender);

      // RadioButton for male
      radioButtonM = new JRadioButton("MALE");
      radioButtonM.setBounds(200, 120, 70, 27);
      radioButtonM.setBackground(new Color(3, 45, 48));
      radioButtonM.setFont(new Font("Tahoma", Font.BOLD, 14));
      radioButtonM.setForeground(Color.WHITE);
      panel.add(radioButtonM);

      radioButtonF = new JRadioButton("FEMALE");
      radioButtonF.setBounds(275, 120, 90, 27);
      radioButtonF.setBackground(new Color(3, 45, 48));
      radioButtonF.setFont(new Font("Tahoma", Font.BOLD, 14));
      radioButtonF.setForeground(Color.WHITE);
      panel.add(radioButtonF);

      JLabel job = new JLabel("JOB:");
      job.setBounds(60, 170, 150, 27);
      job.setFont(new Font("seif", Font.BOLD, 17));
      job.setForeground(Color.WHITE);
      panel.add(job);

      // ComboBox
      comboBox = new JComboBox<>(new String[] { "Front Desk", "House Keeping", "Kitchen Staff",
            "Room service", "Manager", "Accountant", "Chef" });
      comboBox.setBackground(new Color(16, 108, 115));
      comboBox.setBounds(200, 170, 155, 30);
      comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
      comboBox.setForeground(Color.WHITE);
      panel.add(comboBox);

      JLabel Salary = new JLabel("SALARY:");
      Salary.setBounds(60, 220, 150, 27);
      Salary.setFont(new Font("serif", Font.BOLD, 17));
      Salary.setForeground(Color.WHITE);
      panel.add(Salary);

      salaryText = new JTextField();
      salaryText.setBounds(200, 220, 150, 27);
      salaryText.setBackground(new Color(16, 108, 115));
      salaryText.setFont(new Font("Tahoma", Font.BOLD, 14));
      salaryText.setForeground(Color.WHITE);
      panel.add(salaryText);

      JLabel Phone = new JLabel("PHONE:");
      Phone.setBounds(60, 270, 150, 27);
      Phone.setFont(new Font("serif", Font.BOLD, 17));
      Phone.setForeground(Color.WHITE);
      panel.add(Phone);

      phoneText = new JTextField();
      phoneText.setBounds(200, 270, 150, 27);
      phoneText.setBackground(new Color(16, 108, 115));
      phoneText.setFont(new Font("Tahoma", Font.BOLD, 14));
      phoneText.setForeground(Color.WHITE);
      panel.add(phoneText);

      JLabel nid = new JLabel("NID NO:");
      nid.setBounds(60, 320, 150, 27);
      nid.setFont(new Font("serif", Font.BOLD, 17));
      nid.setForeground(Color.WHITE);
      panel.add(nid);

      nidNum = new JTextField();
      nidNum.setBounds(200, 320, 150, 27);
      nidNum.setBackground(new Color(16, 108, 115));
      nidNum.setFont(new Font("Tahoma", Font.BOLD, 14));
      nidNum.setForeground(Color.WHITE);
      panel.add(nidNum);

      JLabel Email = new JLabel("EMAIL:");
      Email.setBounds(60, 370, 150, 27);
      Email.setFont(new Font("serif", Font.BOLD, 17));
      Email.setForeground(Color.WHITE);
      panel.add(Email);

      emailText = new JTextField();
      emailText.setBounds(200, 370, 150, 27);
      emailText.setBackground(new Color(16, 108, 115));
      emailText.setFont(new Font("Tahoma", Font.BOLD, 14));
      emailText.setForeground(Color.WHITE);
      panel.add(emailText);

      JLabel AED = new JLabel("ADD EMPLOYEE DETAILS");
      AED.setBounds(450, 24, 445, 35);
      AED.setFont(new Font("Tahoma", Font.BOLD, 30));
      AED.setForeground(Color.WHITE);
      panel.add(AED);

      // Buttons
      add = new JButton("ADD");
      add.setBounds(80, 420, 100, 30);
      add.setBackground(Color.BLACK);
      add.addActionListener(this);
      add.setForeground(Color.WHITE);
      panel.add(add);

      back = new JButton("BACK");
      back.setBounds(200, 420, 100, 30);
      back.setBackground(Color.BLACK);
      back.setForeground(Color.WHITE);
      back.addActionListener(this);
      panel.add(back);

      // Image
      ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icons/incorporation.png"));
      Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
      ImageIcon imageIcon1 = new ImageIcon(image);
      JLabel label = new JLabel(imageIcon1);
      label.setBounds(500, 100, 300, 300);
      panel.add(label);

      // Frame
      setUndecorated(true);
      setLocation(60, 160);
      setSize(900, 500);
      setLayout(null);
      setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == add) {
         String name = nameText.getText();
         String age = ageText.getText();
         String salary = salaryText.getText();
         String phone = phoneText.getText();
         String email = emailText.getText();
         String nid = nidNum.getText();
         String job = (String) comboBox.getSelectedItem();
         String gender = null;
         if (radioButtonM.isSelected()) {
            gender = "Male";
         } else if (radioButtonF.isSelected()) {
            gender = "Female";
         }
         try {
            DatabaseConnection c = new DatabaseConnection();
            String q = "insert into employee values('"+name+"', '"+age+"', '"+gender+"', '"+job+"', '"+salary+"', '"+phone+"', '"+email+"', '"+nid+"')";
            c.statement.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "Employee added");
            setVisible(false);
         } catch (Exception E) {
            E.printStackTrace();
         }
      } else {
         setVisible(false);
      }
   }
   public static void main(String[] args) {
      new AddEmployee();
   }
}
