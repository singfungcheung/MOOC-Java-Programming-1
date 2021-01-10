
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus (Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }
    
    public boolean lessThan (Money compared){
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int newEuro = 0;
        int newCent = 0;
        
        if (this.lessThan(decreaser)) {
            Money newMoney = new Money(newEuro, newCent);
            return newMoney;
        }
        
        if (this.cents < decreaser.cents) {
            newCent = 100 + this.cents;
            newEuro = this.euros - 1;
        } else {
            newCent = this.cents;
            newEuro = this.euros;
        }
        Money newMoney = new Money(newEuro - decreaser.euros, newCent - decreaser.cents);
        return newMoney;
    }
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
