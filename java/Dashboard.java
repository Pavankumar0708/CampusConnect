import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dashboard {
 public static void main(String[] args) {
 try {
  Connection con = DatabaseConnection.getConnection();
  Statement st = con.createStatement();
 ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM campusconnect_students");
  rs.next();
 System.out.println("Total Students : " + rs.getInt(1));
 rs = st.executeQuery("SELECT COUNT(*) FROM events");
   rs.next();
 System.out.println("Total Events : " + rs.getInt(1));
  rs = st.executeQuery("SELECT COUNT(*) FROM books");
   rs.next();
  System.out.println("Total Books : " + rs.getInt(1));
  rs = st.executeQuery("SELECT COUNT(*) FROM internships");
  rs.next();
   System.out.println("Total Internships : " + rs.getInt(1));
  rs = st.executeQuery("SELECT COUNT(*) FROM lost_items");
   rs.next();
   System.out.println("Total Lost Items : " + rs.getInt(1));
  con.close();
 }
  catch (Exception e) {
  e.printStackTrace();
 }
    }
}