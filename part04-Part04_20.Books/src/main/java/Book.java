/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sing Fung
 */
public class Book {
    private String bookTitle;
    private int bookPages;
    private int publicationYear;
    
    public Book(String bookTitle, int bookPages, int publicationYear) {
        this.bookTitle = bookTitle;
        this.bookPages = bookPages;
        this.publicationYear = publicationYear;
    }
    
    public String getBookTitle() {
        return this.bookTitle;
    }
    
    public String toString() {
        return this.bookTitle + ", " + this.bookPages + " pages, " + this.publicationYear;
    }
}
