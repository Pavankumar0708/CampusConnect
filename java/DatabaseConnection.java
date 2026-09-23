import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
static String url = "jdbc:mysql://localhost:3306/campusconnect";
static String username = "root";
static String password = "Pawan@99";
public static Connection getConnection() {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con = DriverManager.getConnection(
url,
username,
password
 );
System.out.println("Database Connected Successfully!");

 return con;
 } catch (Exception e) {

 System.out.println("Connection Failed!");
e.printStackTrace();

}
return null;
    }    public static void main(String[] args) {
        getConnection();
    }
}