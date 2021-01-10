/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sing Fung
 */
public class BirdBox {
    private String name;
    private String latinName;
    private int observation;
    
    public BirdBox(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }
    
    public void observationUp() {
        this.observation++;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public int getObservation() {
        return this.observation;
    }
}
