import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookInfo = new ArrayList<>();
        
        while (true) {
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();
            if (bookTitle.equals("")) {
                break;
            }
            System.out.print("Pages: ");
            int bookPages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            // Create object and add to list
            bookInfo.add(new Book(bookTitle, bookPages, publicationYear));
           
        }
        
        System.out.println();
        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();
        
        for (Book book: bookInfo) {
            if (choice.equals("everything")) {
                System.out.println(book);
            } else if (choice.equals("name")) {
                System.out.println(book.getBookTitle());
            }
        }
    }
}
