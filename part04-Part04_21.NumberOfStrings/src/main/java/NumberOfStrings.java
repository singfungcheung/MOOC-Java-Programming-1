
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfString = 0;
        while (true) {
            String message = scanner.nextLine();
            if (message.equals("end")) {
                break;
            }
            numOfString++;
        }
        
        System.out.println(numOfString);
    }
}
