package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnection {

   public void connectToDatabase() {
      try {
         Class.forName("com.mysql.jdbc.Driver"); // Load the JDBC driver
         // ... rest of your connection logic using DriverManager ...
      } catch (ClassNotFoundException e) {
         // Handle the exception if the driver class is not found
         e.printStackTrace();
      }
   }

   Connection connection;
   Statement statement;

   public DatabaseConnection() {
      System.out.println("Connected to database!");
      try {
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelManagementDatabase", "root",
               "i#%28=7]EJ0b");
         statement = connection.createStatement();

      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}