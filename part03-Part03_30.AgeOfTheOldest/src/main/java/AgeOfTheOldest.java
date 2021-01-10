
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        
        while (true) {
            String message = scanner.nextLine();
            if (message.equals("")) {
                break;
            }
            String[] nameAge = message.split(",");
            for (int i = 0; i < nameAge.length; i++) {
                if (Integer.valueOf(nameAge[1]) > oldest) {
                    oldest = Integer.valueOf(nameAge[1]);
                }
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);
    }
}
