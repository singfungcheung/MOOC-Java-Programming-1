import java.util.ArrayList;

public class Stack {
    private ArrayList<String> myString;
    
    public Stack() {
        this.myString = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.myString.isEmpty();
    }
    
    public void add(String value) {
        this.myString.add(value);
    }
    
    public ArrayList<String> values() {
        return this.myString;
    }
    
    public String take() {
        String lastElement = this.myString.get(this.myString.size() - 1);
        // remove the last element
        this.myString.remove(this.myString.size() - 1);
        //return lastElement;
        return lastElement;
    }
}
