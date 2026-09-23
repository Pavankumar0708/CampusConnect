import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class RegisterStudent {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("===== Student Registration =====");
System.out.print("Full Name: ");
String fullName = sc.nextLine();
 System.out.print("Student ID: ");
String studentId = sc.nextLine();
System.out.print("Email: ");
String email = sc.nextLine();
System.out.print("Department: ");
String department = sc.nextLine();
System.out.print("Password: ");
 String password = sc.nextLine();

        try {
            Connection con = DatabaseConnection.getConnection();

            String sql = "INSERT INTO campusconnect_students(full_name, student_id, email, department, password) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, fullName);
            ps.setString(2, studentId);
            ps.setString(3, email);
            ps.setString(4, department);
            ps.setString(5, password);

            ps.executeUpdate();

            System.out.println("Registration Successful!");

            con.close();

        } 
        
        
catch (Exception e) {
  e.printStackTrace();
        }

        sc.close();
    }
}
    

