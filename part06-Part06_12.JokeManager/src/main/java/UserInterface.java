/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sing Fung
 */
import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String choice = scanner.nextLine();

            if (choice.equals("X")) {
                break;
            } else if (choice.equals("1")) {
                System.out.println("Write the joke to be added:");
                this.jokes.addJoke(scanner.nextLine());
            } else if (choice.equals("2")) {
                System.out.println(this.jokes.drawJoke());
            } else if (choice.equals("3")) {
                this.jokes.printJokes();
            }
        }
    }
}
