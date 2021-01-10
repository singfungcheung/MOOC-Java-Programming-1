
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthew = new Account("Matthews account", 1000);
        Account me = new Account("My account", 0);
        
        matthew.withdrawal(100);
        me.deposit(100);
        
        System.out.println(matthew);
        System.out.println(me);
    }
}
