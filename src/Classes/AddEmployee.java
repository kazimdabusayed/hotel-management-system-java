package Classes;

import javax.swing.*;
import java.awt.*;

public class AddEmployee extends JFrame {
   JTextField nameText, ageText, SalaryText, PhoneText, NationalIDNum, EmailText;
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
      JComboBox<String> comboBox = new JComboBox<>(new String[] {"Front Desk", "House Keeping", "Kitchen Staff", "Room service", "Manager", "Accountant", "Chef"});
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

      SalaryText = new JTextField();
      SalaryText.setBounds(200, 220, 150, 27);
      SalaryText.setBackground(new Color(16, 108, 115));
      SalaryText.setFont(new Font("Tahoma", Font.BOLD, 14));
      SalaryText.setForeground(Color.WHITE);
      panel.add(SalaryText);

      JLabel Phone = new JLabel("PHONE:");
      Phone.setBounds(60, 270, 150, 27);
      Phone.setFont(new Font("serif", Font.BOLD, 17));
      Phone.setForeground(Color.WHITE);
      panel.add(Phone);

      PhoneText = new JTextField();
      PhoneText.setBounds(200, 270, 150, 27);
      PhoneText.setBackground(new Color(16, 108, 115));
      PhoneText.setFont(new Font("Tahoma", Font.BOLD, 14));
      PhoneText.setForeground(Color.WHITE);
      panel.add(PhoneText);

      JLabel NationalID = new JLabel("NID NO:");
      NationalID.setBounds(60, 320, 150, 27);
      NationalID.setFont(new Font("serif", Font.BOLD, 17));
      NationalID.setForeground(Color.WHITE);
      panel.add(NationalID);

      NationalIDNum = new JTextField();
      NationalIDNum.setBounds(200, 320, 150, 27);
      NationalIDNum.setBackground(new Color(16, 108, 115));
      NationalIDNum.setFont(new Font("Tahoma", Font.BOLD, 14));
      NationalIDNum.setForeground(Color.WHITE);
      panel.add(NationalIDNum);

      JLabel Email = new JLabel("E-MAIL:");
      Email.setBounds(60, 370, 150, 27);
      Email.setFont(new Font("serif", Font.BOLD, 17));
      Email.setForeground(Color.WHITE);
      panel.add(Email);

      EmailText = new JTextField();
      EmailText.setBounds(200, 370, 150, 27);
      EmailText.setBackground(new Color(16, 108, 115));
      EmailText.setFont(new Font("Tahoma", Font.BOLD, 14));
      EmailText.setForeground(Color.WHITE);
      panel.add(EmailText);

      JLabel AED = new JLabel("ADD EMPLOYEE DETAILS");
      AED.setBounds(450, 24, 445, 35);
      AED.setFont(new Font("Tahoma", Font.BOLD, 30));
      AED.setForeground(Color.WHITE);
      panel.add(AED);

      // Frame
      setUndecorated(true);
      setLocation(60, 160);
      setSize(900, 500);
      setLayout(null);
      setVisible(true);
   }
   public static void main(String[] args) {
      new AddEmployee();
   }
}
