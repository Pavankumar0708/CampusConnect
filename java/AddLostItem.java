import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddLostItem {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("===== Report Lost Item =====");
 System.out.print("Item Name: ");
String itemName = sc.nextLine();
 System.out.print("Location: ");
  String location = sc.nextLine();
 System.out.print("Status (Lost/Found): ");
  String status = sc.nextLine();
 System.out.print("Student Name: ");
String studentName = sc.nextLine();
try {
  Connection con = DatabaseConnection.getConnection();
String sql = "INSERT INTO lost_items(item_name, location, status, student_name) VALUES (?, ?, ?, ?)";

 PreparedStatement ps = con.prepareStatement(sql);

 ps.setString(1, itemName);
 ps.setString(2, location);
 ps.setString(3, status);
 ps.setString(4, studentName);
 ps.executeUpdate();

 System.out.println("Lost Item Reported Successfully!");

con.close();

} 
 catch (Exception e) {
  e.printStackTrace();
}

sc.close();
    }
}
