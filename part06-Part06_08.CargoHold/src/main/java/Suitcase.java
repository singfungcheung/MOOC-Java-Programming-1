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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        int totalWeight = this.totalWeight();
        
        if (item.getWeight() + totalWeight <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        int totalWeight = this.totalWeight();
        int numberOfItems = this.items.size();
        if (numberOfItems == 1) {
            return numberOfItems + " item (" + totalWeight + " kg)";
        }
        
        return this.items.size() + " items (" + totalWeight + " kg)";
    }
    
    public void printItems() {
        for (Item item: items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item: items) {
            totalWeight += item.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        // reference object
        Item heaviestItem = this.items.get(0);
        
        for (Item item: items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        
        return heaviestItem;
    }
}
