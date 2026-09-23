import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewBooks {
public static void main(String[] args) {

 try {
 Connection con = DatabaseConnection.getConnection();
 String sql = "SELECT * FROM books";
 Statement st = con.createStatement();
 ResultSet rs = st.executeQuery(sql);
 System.out.println("===== Books Exchange =====");
while (rs.next()) {
  System.out.println("Book ID     : " + rs.getInt("id"));
System.out.println("Book Name   : " + rs.getString("book_name"));
System.out.println("Author      : " + rs.getString("author"));
System.out.println("Price       : ₹" + rs.getInt("price"));
 System.out.println("Seller Name : " + rs.getString("seller_name")); System.out.println("----------------------------");
  }

con.close();

 } 
catch (Exception e) {
 e.printStackTrace();
 }
    }
}