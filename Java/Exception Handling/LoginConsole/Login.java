package practiceworkjava;
import java.util.Scanner;

public class Login {

    String username = "akshu";
    String password = "12345"; 

    void validateUsername(String enteredUsername) throws InvalidUsernameException {
        if (!enteredUsername.equals(username)) {
            throw new InvalidUsernameException();
        } else {
            System.out.println("Username matched");
        }
    }

    void validatePassword(String enteredPassword) throws InvalidPasswordException {
        if (!enteredPassword.equals(password)) {
            throw new InvalidPasswordException();
        } else {
            System.out.println("Password matched");
        }
    }
}




 class TestLogin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Login l = new Login();

        System.out.print("Enter username: ");
        String user = sc.nextLine();

        try {
            l.validateUsername(user);

            int attempts = 3;
            boolean success = false;

            while (attempts > 0) {
                System.out.print("Enter password: ");
                String pass = sc.nextLine();

                try {
                    l.validatePassword(pass);
                    System.out.println("Login Successful!");
                    success = true;
                    break;
                } catch (InvalidPasswordException e) {
                    attempts--;
                    System.out.println(e + " Attempts remaining: " + attempts);
                }
                
            }

            if (!success) {
                System.out.println("Account Locked!");
            }

        } catch (InvalidUsernameException e) {
            System.out.println(e);
        }
    }
}
