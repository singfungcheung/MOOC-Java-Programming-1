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

public class MessagingService {
    private ArrayList<Message> myMessages;
    
    public MessagingService() {
        myMessages = new ArrayList<>();
    }
    
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            myMessages.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.myMessages;
    }
}
