/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sing Fung
 */
public class Timer1 {
    private int hundredthsOfSeconds;
    private int seconds;
    
    public Timer1 () {
        this.hundredthsOfSeconds = 0;
        this.seconds = 0;
    }
    
    public void advance() {
        this.hundredthsOfSeconds += 1;
        
        // Check to see if hundredthsOfSeconds reached 100
        if (this.hundredthsOfSeconds > 99) {
            this.hundredthsOfSeconds = 0;
            this.seconds += 1;
            
            // Check to see if seconds has reached 60
            if (this.seconds > 59) {
                this.seconds = 0;
            }
        }
    }
    
    public String toString() {
        if (this.seconds < 10) {
            if (this.hundredthsOfSeconds < 10) {
                return "0" + this.seconds + ":" + "0" + this.hundredthsOfSeconds;
            } 
            return "0" + this.seconds + ":" + this.hundredthsOfSeconds;
        } else if (this.hundredthsOfSeconds < 10) {
            return this.seconds + ":" + "0" + this.hundredthsOfSeconds;
        }
        return this.seconds + ":" + this.hundredthsOfSeconds;
    }
}
