
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        // count and sum defaults to 0.
    }
    
    public void addNumber(int number) {
        count++;
        sum += number;
    }
    
    public int getCount() {
        return count;
    }
    
    public int sum() {
        return sum;
    }
    
    public double average() {
        if (count == 0) {
            return 0;
        }
        return 1.0 * sum / count;
    }
}
