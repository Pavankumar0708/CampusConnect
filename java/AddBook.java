import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddBook {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
System.out.println("===== Add Book =====");
System.out.print("Book Name: ");
String bookName = sc.nextLine();
System.out.print("Author Name: ");
 String author = sc.nextLine();
System.out.print("Price: ");
 int price = sc.nextInt();
 sc.nextLine();
System.out.print("Seller Name: ");
String seller = sc.nextLine();
 try {
 Connection con = DatabaseConnection.getConnection();
 String sql = "INSERT INTO books(book_name, author, price, seller_name) VALUES (?, ?, ?, ?)";
 PreparedStatement ps = con.prepareStatement(sql);

 ps.setString(1, bookName);
 ps.setString(2, author);
 ps.setInt(3, price);
 ps.setString(4, seller);
 ps.executeUpdate();

 System.out.println("Book Added Successfully!");

 con.close();

} 
catch (Exception e) {
     e.printStackTrace();
        
}
 sc.close();
    }
}