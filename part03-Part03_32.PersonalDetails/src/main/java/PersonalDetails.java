
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare ArrayList
        ArrayList<String> nameList = new ArrayList<>();
        
        // Sum of birth year
        int sum = 0;
        
        while (true) {
            String message = scanner.nextLine();
            if (message.equals("")) {
                break;
            }
            String[] nameAndAge = message.split(",");
            nameList.add(nameAndAge[0]);
            sum += Integer.valueOf(nameAndAge[1]);
        }
        
        // Declare index for longest name
        int indexLongestName = 0;
        int longestNameLength = 0;
        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).length() > longestNameLength) {
                longestNameLength = nameList.get(i).length();
                indexLongestName = i;
            }
        }
        System.out.println("Longest name: " + nameList.get(indexLongestName));
        System.out.println("Average of the birth years: " + 
                           (1.0 * sum / nameList.size()));
    }
}
