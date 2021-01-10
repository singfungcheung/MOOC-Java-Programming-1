
public class HealthStation {
    private int weightOccurence;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weightOccurence++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return this.weightOccurence;
    }
}
