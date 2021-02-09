package library;

public class Book {

    String title;
    boolean borrowed = false;

    // Creates a new Book
    public Book(String bookTitle) {
        this.title = bookTitle;
    }
   
    // Marks the book as rented
    public void borrowed() {
        this.borrowed = true; //this is run on a book object
    }
   
    // Marks the book as not rented
    public void returned() {
        this.borrowed = false; 
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        return borrowed; 
    }
   
    // Returns the title of the book
    public String getTitle() {
        return title;
    }

  
} 