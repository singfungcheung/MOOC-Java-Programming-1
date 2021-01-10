
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int num = 0;
        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;
        while (true) {
            num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            
            // Check to see whether it's odd or even.
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            sum += num;
            count++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (1.0 * sum / count));
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);

    }
}
