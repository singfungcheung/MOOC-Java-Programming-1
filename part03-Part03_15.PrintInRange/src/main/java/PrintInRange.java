
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> myNum = new ArrayList<>();
        myNum.add(3);
        myNum.add(2);
        myNum.add(6);
        myNum.add(-1);
        myNum.add(5);
        myNum.add(1);
        printNumbersInRange(myNum, 0, 5);
        
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num >= lowerLimit && num <= upperLimit) {
                System.out.println(num);
            }
        }
    }
    
}
