
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        int elementsSize = this.elements.size();
        if (elementsSize == 0) {
            return "The collection " + this.name + " is empty.";
        }
        
        String output = "";
        for (int i = 0; i < this.elements.size(); i++) {
            output += this.elements.get(i);
            if (i != this.elements.size() - 1) {
                output += "\n";
            }
        }
        if (elementsSize > 1) {
            return "The collection " + this.name + " has " + elementsSize + " elements:\n" + output;
        } else {
            return "The collection " + this.name + " has " + elementsSize + " element:\n" + output;
        }
        
        
        
        
    }
    
}
