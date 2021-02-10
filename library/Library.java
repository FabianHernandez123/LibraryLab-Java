package library;

import java.util.ArrayList;
import java.util.List;


public class Library {
    // Add the missing implementation to this class
	private String address;
	private List<Book> catalog = new ArrayList<Book>();
	
	
	public Library() {};
	
	public Library(String address) {
		this.address = address; 
	}
	
	public void addBook(Book newBook) {
		this.catalog.add(newBook);
		
		
	}
	
	public void removeBook(Book newBook) {
		this.catalog.remove(newBook);
	}
	
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");		
	}
	
	public void printAddress() {
		System.out.println(this.address);
	}
	
	public void borrowBook(String bookTitle) {
		//need to check if book is there to borrow
		//is it in the catalog
		//and then check the status: borrowed or unborrowed
		boolean inLibrary = false;
		for(Book libBook: this.catalog) {
			//checking if book is in the catalog, but through iterating through every title
			//since the titles aren't easily accessible through the catalog arraylist
			if(libBook.getTitle().equalsIgnoreCase(bookTitle)) {
				inLibrary = true;
				break;
			}
		}
		if(inLibrary == false) {
			System.out.println("Sorry, this book is not in our catalog.");
		}
		if (inLibrary)
			for(Book libBook : this.catalog) {
				if(libBook.isBorrowed()) {
					System.out.println("Sorry, this book is already borrowed.");
				}
				else {
					if(libBook.getTitle().equalsIgnoreCase(bookTitle)) {
						System.out.println("You sucessfully borrowed "+bookTitle);
						libBook.borrowed();
					}
				}
			}		
	}
	
	public void printAvailableBooks() {
		if(this.catalog.size()==0 || this.catalog ==null)
			System.out.println("No book in catalog");
		else
			for(Book libBook: this.catalog) {
				if(libBook.isBorrowed()==false)
					System.out.println(libBook.title);
		}
	}
	
	public void returnBook(String bookTitle) {
		boolean bookPres= false;
		for(Book libBook: this.catalog) {
			if(libBook.getTitle().equalsIgnoreCase(bookTitle)) {
				System.out.println("You successfully returned The Lord of the Rings");
				libBook.returned();
				bookPres = true;
				break;
			}
		}
		if (bookPres==false) {
			System.out.println("This book is not in this library");
		}
			//think about whether you need to say if a book is not in the catalog
		
	}
	
} 