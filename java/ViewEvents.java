import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewEvents {
public static void main(String[] args) {
 try {
    Connection con = DatabaseConnection.getConnection();

 String sql = "SELECT * FROM events";

    Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);

System.out.println("===== Campus Events =====");

 while (rs.next()) {

 System.out.println("Event ID   : " + rs.getInt("id"));
 System.out.println("Event Name : " + rs.getString("event_name"));
System.out.println("Date       : " + rs.getDate("event_date"));
System.out.println("Venue      : " + rs.getString("venue"));
System.out.println("-----------------------------");
}

con.close();

 } catch (Exception e) {
 e.printStackTrace();
        }
    }
}