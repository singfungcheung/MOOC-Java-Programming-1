/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sing Fung
 */

//import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private Grades grades;
    
    public UserInterface(Scanner scanner, Grades grades) {
        this.scanner = scanner;
        this.grades = grades;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            
            // Check to see if the input is out of bounds [0, 100]
            if (input < 0 || input > 100) {
                continue;
            }
            
            // Add the number to the ArrayList
            this.grades.addGrade(input);
        }
        this.grades.allPointAverage();
        this.grades.passingPointAverage();
        this.grades.passPercentage();
        this.grades.distribution();
    }
    
}
