import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteLostItem {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
System.out.println("===== Delete Lost Item =====");
System.out.print("Enter Item ID: ");
  int itemId = sc.nextInt();
 try {
 Connection con = DatabaseConnection.getConnection();
  String sql = "DELETE FROM lost_items WHERE id=?";
 PreparedStatement ps = con.prepareStatement(sql);
ps.setInt(1, itemId);
int rows = ps.executeUpdate();
 if (rows > 0) {
  System.out.println("Lost Item Deleted Successfully!");
} 
else {
System.out.println("Item ID Not Found!");
  }
 con.close();
} 
catch (Exception e) {
  e.printStackTrace();
 }
 sc.close();
    }
}