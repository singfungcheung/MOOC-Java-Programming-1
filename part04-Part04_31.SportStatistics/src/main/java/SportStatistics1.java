
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        
        // Keep track number of games
        int games = 0;
        
        // Number of games won
        int win = 0;
        
        try (Scanner fileScan = new Scanner(Paths.get(fileName))) {
            while (fileScan.hasNextLine()) {
                // Separate line by comma.
                String[] line = fileScan.nextLine().split(",");
                if (line[0].equals(teamName)) {
                    games++;
                    // Check to see if score is winning
                    if (Integer.valueOf(line[2]) > Integer.valueOf(line[3])) {
                        win++;
                    }
                } else if (line[1].equals(teamName)) {
                    games++;
                    // Check to see if score is winning
                    if (Integer.valueOf(line[2]) < Integer.valueOf(line[3])) {
                        win++;
                    }
                }
            }
        } catch (Exception e) {
            // Do nothing.
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + (games - win));
    }

}
