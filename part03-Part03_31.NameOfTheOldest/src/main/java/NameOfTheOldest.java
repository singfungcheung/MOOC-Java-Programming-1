
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare array list
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();
        
        // Declare largest age
        int oldest = 0;
        
        // Declare location (index) of person that is oldest
        int location = 0;
        
        while (true) {
            String message = scanner.nextLine();
            if (message.equals("")) {
                break;
            }
            String[] nameAndAge = message.split(",");
            nameList.add(nameAndAge[0]);
            ageList.add(Integer.valueOf(nameAndAge[1]));
        }
        
        for (int i = 0; i < ageList.size(); i++) {
            if (ageList.get(i) > oldest) {
                oldest = ageList.get(i);
                location = i;
            }
        }
        
        System.out.println("Name of the oldest: " + nameList.get(location));
    }
}
