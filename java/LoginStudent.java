import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LoginStudent {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("===== Student Login =====");
 System.out.print("Email: ");
 String email = sc.nextLine();
 System.out.print("Password: ");
  String password = sc.nextLine();
 try {
 Connection con = DatabaseConnection.getConnection();
 String sql = "SELECT * FROM campusconnect_students WHERE email=? AND password=?";
PreparedStatement ps = con.prepareStatement(sql);
 ps.setString(1, email);
   ps.setString(2, password);
 ResultSet rs = ps.executeQuery();
 if (rs.next()) {
 String studentName = rs.getString("full_name");
 System.out.println("Login Successful!");
System.out.println("Welcome " + studentName);
 System.out.println("Opening Dashboard...");
 }
  else {
  System.out.println("Invalid Email or Password!");
   }
 con.close();
} 
catch (Exception e) {
  e.printStackTrace();
   }
 sc.close();
    }
}
