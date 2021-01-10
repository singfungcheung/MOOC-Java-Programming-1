
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String message = scanner.nextLine();
            
            if (message.equals("end")) {
                break;
            }
            
            int num = Integer.valueOf(message);
            System.out.println((int)Math.pow(num, 3));
            
        }
    }
}
