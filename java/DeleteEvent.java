import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteEvent {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("===== Delete Event =====");
 System.out.print("Enter Event ID: ");
 int eventId = sc.nextInt();

 try {
Connection con = DatabaseConnection.getConnection();
String sql = "DELETE FROM events WHERE id = ?";
PreparedStatement ps = con.prepareStatement(sql);
ps.setInt(1, eventId);
int rows = ps.executeUpdate();
if (rows > 0) {
System.out.println("Event Deleted Successfully!");
} else {
  System.out.println("Event ID Not Found!");
}
 con.close();
 } 
 catch (Exception e) {
      e.printStackTrace();
 }

 sc.close();
    }
}