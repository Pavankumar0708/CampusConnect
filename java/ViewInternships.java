import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewInternships {
public static void main(String[] args) {
 try {
 Connection con = DatabaseConnection.getConnection();
  String sql = "SELECT * FROM internships";
Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 System.out.println("===== Internship Opportunities =====");
 while (rs.next()) {
 System.out.println("Internship ID : " + rs.getInt("id"));
System.out.println("Company       : " + rs.getString("company_name"));
System.out.println("Role          : " + rs.getString("role"));
 System.out.println("Location      : " + rs.getString("location"));
System.out.println("Apply Link    : " + rs.getString("apply_link"));
System.out.println("------------------------------------");
   }
  con.close();
 } 
 catch (Exception e) {
e.printStackTrace();
  }
    }
}