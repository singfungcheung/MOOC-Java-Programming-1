
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        // Search for the string
        try (Scanner textScan = new Scanner(Paths.get(file))) {
            
            // Read the lines from the file
            while (textScan.hasNextLine()) {
                String[] lines = textScan.nextLine().split(" ");
                
                // Loop through the String (lines) array to see if it has the searchedFor
                for (String line: lines) {
                    if (line.equals(searchedFor)) {
                        System.out.println("Found!");
                        return;
                    }
                }
                
            }
            // If code made it here that means name wasn't found.
            System.out.println("Not found.");
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
