
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> myNums = new ArrayList<>();
        myNums.add(3);
        myNums.add(2);
        myNums.add(6);
        myNums.add(-1);
        System.out.println(sum(myNums));
        
        myNums.add(5);
        myNums.add(1);
        System.out.println(sum(myNums));
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

}
