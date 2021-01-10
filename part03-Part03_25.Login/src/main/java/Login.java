
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userName = new String[2];
        String[] password = new String[2];
        
        userName[0] = "alex";
        userName[1] = "emma";
        
        password[0] = "sunshine";
        password[1] = "haskell";
        
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.println();
        
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();
        System.out.println();
        
        boolean userFound = false;
        boolean passFound = false;
        
        for (int i = 0; i < userName.length; i++) {
            if (userName[i].equals(user)) {
                userFound = true;
            }
            if (password[i].equals(pass)) {
                passFound = true;
            }
        }
        if (userFound && passFound) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
        
    }
}
