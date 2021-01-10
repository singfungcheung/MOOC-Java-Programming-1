
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Get file name.
        System.out.println("File:");
        String fileName = scan.nextLine();
        
        // Insert file data into ArrayList.
        ArrayList<Game> gameInfo = dataInsertion(fileName);
        
        // Get the team name.
        System.out.println("Team:");
        String teamName = scan.nextLine();
        
        
        // Keep track number of games
        int games = 0;
        
        // Number of games won
        int win = 0;
        
        // Loop through ArrayList to see how many times the team name comes up.
        for (Game game: gameInfo) {
            if (game.getHomeTeam().equals(teamName)) {
                games++;
            } else if (game.getEnemyTeam().equals(teamName)) {
                games++;
            }
            // Check if the team won 
            if (game.winningTeam().equals(teamName)) {
                    win++;
            }
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + (games - win));
    }
    public static ArrayList<Game> dataInsertion(String fileName) {
        // Declare arraylist with Game class
        ArrayList<Game> gameInfo = new ArrayList<>();
        try (Scanner fileScan = new Scanner(Paths.get(fileName))) {
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] info = line.split(",");
                
                // Make object and insert into array
                gameInfo.add(new Game(info[0], info[1], Integer.valueOf(info[2]), Integer.valueOf(info[3])));
            }
        } catch (Exception e) {
            // Do nothing.
        }
        return gameInfo;
    }
}
