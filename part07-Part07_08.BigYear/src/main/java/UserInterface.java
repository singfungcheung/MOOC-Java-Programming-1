/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sing Fung
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<BirdBox> birds;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }
    
    public void start() {
        while (true) {
            System.out.print("? ");
            String command = this.scanner.nextLine();
            if (command.equals("Add")) {
                this.add();
            } else if (command.equals("Observation")) {
                this.observation();
            } else if (command.equals("All")) {
                this.all();
            } else if (command.equals("One")) {
                this.one();
            } else if (command.equals("Quit")) {
                break;
            }
        }
    }
    
    public void add() {
        System.out.print("Name: ");
        String name = this.scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = this.scanner.nextLine();
        birds.add(new BirdBox(name, latinName));
    }
    
    public void observation() {
        boolean found = false;
        System.out.print("Bird?");
        String birdName = this.scanner.nextLine();
        for (BirdBox bird: birds) {
            if (bird.getName().equals(birdName)) {
                bird.observationUp();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not a bird!");
        }
    }
    
    public void all() {
        for (BirdBox bird: birds) {
            System.out.println(bird.getName() + "(" + bird.getLatinName() + "): " 
                             + bird.getObservation() + " observations");
        }
    }
    
    public void one() {
        System.out.print("Bird?");
        String birdName = this.scanner.nextLine();
        for (BirdBox bird: birds) {
            if (bird.getName().equals(birdName)) {
                System.out.println(bird.getName() + "(" + bird.getLatinName() + "): "
                                + bird.getObservation() + " observations");
            }
        }
    }
}
