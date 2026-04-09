import java.util.Scanner;

public class LoginExample {
    public static void main(String[] args) {
        String crtUsername = "admin";
        String crtPassword = "password123";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if(username.equals(crtUsername) && password.equals(crtPassword)) {
            System.out.println("Login successful! Welcome " + username);
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }

        scanner.close();
    }
}
