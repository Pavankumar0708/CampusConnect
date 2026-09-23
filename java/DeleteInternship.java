import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteInternship {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("===== Delete Internship =====");
System.out.print("Enter Internship ID: ");
 int internshipId = sc.nextInt();
try {
 Connection con = DatabaseConnection.getConnection();
 String sql = "DELETE FROM internships WHERE id=?";
PreparedStatement ps = con.prepareStatement(sql);
 ps.setInt(1, internshipId);
 int rows = ps.executeUpdate();
 if (rows > 0) {
  System.out.println("Internship Deleted Successfully!");
  } 
 else {
System.out.println("Internship ID Not Found!");
  }
 con.close();
} 
catch (Exception e) {
 e.printStackTrace();
  }
 sc.close();
    }
}
