import java.util.Scanner;

public class AdminLogin {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("===== Admin Login =====");
System.out.print("Username: ");
  String username = sc.nextLine();
 System.out.print("Password: ");
   String password = sc.nextLine();
 if(username.equals("admin") && password.equals("admin123")){
  System.out.println("Admin Login Successful!");
 System.out.println("Open admin.html");
    }
 else{
    System.out.println("Invalid Admin Credentials!");
        }
 sc.close();
    }
}