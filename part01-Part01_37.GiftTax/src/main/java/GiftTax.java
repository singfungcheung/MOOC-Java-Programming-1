
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int num = Integer.valueOf(scan.nextLine());
        if (num >=5000 && num <= 25000) {
            System.out.println("Tax: " + ((num - 5000) * 0.08 + 100));
        } else if (num >= 25000 && num <= 55000) {
            System.out.println("Tax: " + ((num - 25000) * 0.10 + 1700));
        } else if (num >= 55000 && num <= 200000) {
            System.out.println("Tax: " + ((num - 55000) * 0.12 + 4700));
        } else if (num >= 200000 && num <= 1000000) {
            System.out.println("Tax: " + ((num - 200000) * 0.15 + 22100));
        } else if (num >= 1000000) {
            System.out.println("Tax: " + ((num - 1000000) * 0.17 + 142100));
        } else {
            System.out.println("No tax!");
        }
    }
}
