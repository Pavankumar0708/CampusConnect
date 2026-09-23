import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewLostItems {
 public static void main(String[] args) {
try {
 Connection con = DatabaseConnection.getConnection();
 String sql = "SELECT * FROM lost_items";
  Statement st = con.createStatement();
  ResultSet rs = st.executeQuery(sql);
 System.out.println("===== Lost & Found Items =====");
while (rs.next()) {
 System.out.println("Item ID      : " + rs.getInt("id"));
System.out.println("Item Name    : " + rs.getString("item_name"));
System.out.println("Location     : " + rs.getString("location"));
 System.out.println("Status       : " + rs.getString("status"));
 System.out.println("Student Name : " + rs.getString("student_name"));
 System.out.println("--------------------------------");
          
}
 con.close();
 } 
 catch (Exception e) {
    e.printStackTrace();
        
}
    }
}