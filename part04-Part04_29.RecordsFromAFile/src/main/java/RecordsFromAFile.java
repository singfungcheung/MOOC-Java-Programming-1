
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String nameOfFile = scanner.nextLine();
        
        try (Scanner scanFile = new Scanner(Paths.get(nameOfFile))) {
            while (scanFile.hasNextLine()) {
                // Separates line by comma.
                String[] line = scanFile.nextLine().split(",");
                String name = line[0];
                int age = Integer.valueOf(line[1]);
                
                String year = null;
                // Assign year based on age
                if (age != 1) {
                    year = " years";
                } else {
                    year = " year";
                }
                System.out.println(name + ", age: " + age + year);
                
            }
        } catch (Exception e) {
            // Do nothing.
        }
    }
}
