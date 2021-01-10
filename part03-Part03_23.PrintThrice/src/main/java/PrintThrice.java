
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        String message = scanner.nextLine();
        printThreeTimes(message);

    }
    
    public static void printThreeTimes(String message) {
        for (int i = 0; i < 3; i++) {
            System.out.print(message);
        }
        System.out.println();
    }
}
