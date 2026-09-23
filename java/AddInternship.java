import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddInternship {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 System.out.println("===== Add Internship =====");
System.out.print("Company Name: ");
 String company = sc.nextLine();
System.out.print("Role: ");
  String role = sc.nextLine();
 System.out.print("Location: ");
 String location = sc.nextLine();
 System.out.print("Apply Link: ");
  String link = sc.nextLine();
 try {
  Connection con = DatabaseConnection.getConnection();
 String sql = "INSERT INTO internships(company_name, role, location, apply_link) VALUES (?, ?, ?, ?)";
 PreparedStatement ps = con.prepareStatement(sql);
 ps.setString(1, company);
  ps.setString(2, role);
ps.setString(3, location);
  ps.setString(4, link);
 ps.executeUpdate();
 System.out.println("Internship Added Successfully!");
  con.close();
 }
  catch (Exception e) {
  e.printStackTrace();
  }
 sc.close();
    }
}
