
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        // Keep track of how many numbers are within the range
        int numbers = 0;
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                int num = Integer.valueOf(fileScan.nextLine());
                if (num >= lowerBound && num <= upperBound) {
                    numbers++;
                }
            }
        } catch (Exception e) {
            // Do nothing
        }
        System.out.println("Numbers: " + numbers);

    }

}
