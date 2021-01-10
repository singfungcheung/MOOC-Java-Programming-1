
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> numList = new ArrayList<>();
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 9999) {
                break;
            }
            numList.add(num);
        }
        System.out.println();
        
        int smallest = numList.get(0);
        int indexSmallest = 0;
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) < smallest) {
                smallest = numList.get(i);
            }     
        }
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}
