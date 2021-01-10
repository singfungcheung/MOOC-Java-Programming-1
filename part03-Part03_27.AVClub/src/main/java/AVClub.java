
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String message = scanner.nextLine();
            if (message.equals("")) {
                break;
            }
            // Split the string
            String[] newMessage = message.split(" ");
            
            for (int i = 0; i < newMessage.length; i++) {
                if (newMessage[i].contains("av")) {
                    System.out.println(newMessage[i]);
                }
            }
        }
        

    }
}
