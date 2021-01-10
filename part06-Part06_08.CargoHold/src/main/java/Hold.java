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

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;
    
    public Hold(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.maximumWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.maximumWeight() + " kg)";
    }
    
    public int maximumWeight() {
        int maxWeight = 0;
        for (Suitcase suitcase: suitcases) {
            maxWeight += suitcase.totalWeight();
        }
        
        return maxWeight;
    }
    
    public void printItems() {
        for (Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }
}
