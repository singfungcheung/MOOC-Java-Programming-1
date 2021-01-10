
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String message1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String message2 = scan.nextLine();
        if (message1.equals(message2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
