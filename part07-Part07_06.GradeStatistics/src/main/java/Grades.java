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

public class Grades {
    private ArrayList<Integer> grades;
    
    public Grades() {
        this.grades = new ArrayList<>();
    }
    
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    
    public void allPointAverage() {
        int sum = 0;
        for (int grade: grades) {
            sum += grade;
        }
        System.out.println("Point average (all): " + 1.0 * sum / this.grades.size());
    }
    
    public void passingPointAverage() {
        int sum = 0;
        int numOfPassing = 0;
        for (int grade: grades) {
            if (grade >= 50) {
                sum += grade;
                numOfPassing++;
            }
        }
        if (numOfPassing == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + 1.0 * sum / numOfPassing);
        }
    }
    
    public void passPercentage() {
        int numOfPassing = 0;
        for (int grade: grades) {
            if (grade >= 50) {
                numOfPassing++;
            }
        }
        System.out.println("Pass percentage: " + 100.0 * numOfPassing / this.grades.size());
    }
    
    public void distribution() {
        int[] stars = new int[6];
        
        // Initalize the array values to be 0.
        for (int i = 0; i < 6; i++) {
            stars[i] = 0;
        }
        
        // Incremenet the array values by looping through the ArrayList.
        for (int grade: grades) {
            if (grade < 50) {
                stars[0]++;
            } else if (grade < 60) {
                stars[1]++;
            } else if (grade < 70) {
                stars[2]++;
            } else if (grade < 80) {
                stars[3]++;
            } else if (grade < 90) {
                stars[4]++;
            } else {
                stars[5]++;
            }
        }
        
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            
            // Print the stars.
            for (int j = 0; j < stars[i]; j++) {
                System.out.print("*");
            }
            
            // Print new line.
            System.out.println();
        }
        
    }
}
