import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Event {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
System.out.println("===== Add New Event =====");
System.out.print("Event Name: ");
String eventName = sc.nextLine();
System.out.print("Event Date (YYYY-MM-DD): ");
String eventDate = sc.nextLine();

System.out.print("Venue: ");
String venue = sc.nextLine();

try {
 Connection con = DatabaseConnection.getConnection();

 String sql = "INSERT INTO events(event_name, event_date, venue) VALUES (?, ?, ?)";

 PreparedStatement ps = con.prepareStatement(sql);

ps.setString(1, eventName);
ps.setString(2, eventDate);
 ps.setString(3, venue);

 ps.executeUpdate();

 System.out.println("Event Added Successfully!");

con.close();

 } 
 catch (Exception e) {
e.printStackTrace();
        }

        sc.close();
    }
}
