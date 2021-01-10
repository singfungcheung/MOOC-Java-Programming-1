
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> identifierList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            
            // Check to see if the identifier is already in the list
            if (!(identifierList.contains(identifier))) {
                identifierList.add(identifier);
                nameList.add(name);
            }
        }
        
        System.out.println("==Items==");
        for (int i = 0; i < identifierList.size(); i++) {
            System.out.println(identifierList.get(i) + ": " + nameList.get(i));
        }
    }
}
