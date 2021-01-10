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


public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public boolean isEmpty() {
        return this.people.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }
        // Find the shortest person. Don't remove the person from the list.
        Person pseudoPerson = this.people.get(0);
        
        for (Person person: this.people) {
            if (person.getHeight() < pseudoPerson.getHeight()) {
                pseudoPerson = person;
            }
        }
        
        return pseudoPerson;
    }
    
    public Person take() {
        Person shortestPerson = this.shortest();
        this.people.remove(shortestPerson);
        return shortestPerson;
    }
}
