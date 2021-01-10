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
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList taskList;
    
    public UserInterface(TodoList taskList, Scanner scanner) {
        this.taskList = taskList;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            String command = this.commandSelection();
            if (command.equals("add")) {
                this.add();
            } else if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                this.list();
            } else if (command.equals("remove")) {
                this.remove();
            }
        }
    }
    
    public String commandSelection() {
        System.out.print("Command: ");
        String command = scanner.nextLine();
        return command;
    }
    
    public void add() {
        System.out.print("To add: ");
        this.taskList.add(scanner.nextLine());
    }
    
    public void list() {
        this.taskList.print();
    }
    
    public void remove() {
        System.out.print("Which one is removed?");
        this.taskList.remove(Integer.valueOf(scanner.nextLine()));
    }
}
