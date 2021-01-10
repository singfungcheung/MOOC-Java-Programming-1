/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sing Fung
 */
public class Timer {
    private ClockHand hundredthsOfSeconds;
    private ClockHand seconds;
    
    public Timer () {
        this.hundredthsOfSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance() {
        // Advance the hundreds of seconds
        this.hundredthsOfSeconds.advance();
        if (this.hundredthsOfSeconds.value() == 0) {
            this.seconds.advance();
        }
        
    }
    
    public String toString() {
        return this.seconds + ":" + this.hundredthsOfSeconds;
    }
}
