import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateEvent {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("===== Update Event =====");
 System.out.print("Enter Event ID: ");
 int eventId = sc.nextInt();
sc.nextLine();
System.out.print("New Event Name: ");
String eventName = sc.nextLine();
 System.out.print("New Event Date (YYYY-MM-DD): ");
String eventDate = sc.nextLine();
System.out.print("New Venue: ");
 String venue = sc.nextLine();

try {
    Connection con = DatabaseConnection.getConnection();
String sql = "UPDATE events SET event_name=?, event_date=?, venue=? WHERE id=?";
PreparedStatement ps = con.prepareStatement(sql);

ps.setString(1, eventName);
ps.setString(2, eventDate);
ps.setString(3, venue);
ps.setInt(4, eventId);
int rows = ps.executeUpdate();
 if (rows > 0) {
    System.out.println("Event Updated Successfully!");
} 
else {
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