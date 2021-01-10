
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Read the names from the user
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            items.add(new Item(name));
        }
        
        System.out.println();
        for (Item item:items) {
            System.out.println(item);
        }
    }
}
