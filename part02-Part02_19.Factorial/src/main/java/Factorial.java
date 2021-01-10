
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        if (num == 0) {
            System.out.print("Factorial: 0");
            return;
        }
        int total = 1;
        for (int i = 1; i <= num; i++) {
            total *= i;
        }
        System.out.print("Factorial: " + total);
    }
}
