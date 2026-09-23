import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteBook {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("===== Delete Book =====");
 System.out.print("Enter Book ID: ");
  int bookId = sc.nextInt();

try {
   Connection con = DatabaseConnection.getConnection();

  String sql = "DELETE FROM books WHERE id = ?";

 PreparedStatement ps = con.prepareStatement(sql);
 ps.setInt(1, bookId);
 int rows = ps.executeUpdate();
if (rows > 0) {
 System.out.println("Book Deleted Successfully!");
 }
  else {
 System.out.println("Book ID Not Found!");
 }

con.close();

} 
catch (Exception e) {
e.printStackTrace();
}
sc.close();
    }
}