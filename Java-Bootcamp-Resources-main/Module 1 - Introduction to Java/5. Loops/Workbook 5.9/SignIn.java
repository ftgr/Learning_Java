import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        //pick up username
        String usernameEntry = scan.nextLine();
        System.out.print("- Password: ");
        //pick up password
        String passwordEntry = scan.nextLine();

        while (!usernameEntry.equals(username) || !passwordEntry.equals(password)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            usernameEntry = scan.nextLine();
            System.out.print("- Password: ");
            passwordEntry = scan.nextLine();
        }

        if (usernameEntry.equals(username) && passwordEntry.equals(password)) {
            System.out.println("\nSign in successful. Welcome!");
        }
        
        scan.close();
        
    }
}
