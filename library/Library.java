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
		catalog.add(newBook);
		
	}
	
	public void removeBook(Book newBook) {
		catalog.remove(newBook);
	}
	
	public static void printOpeningHours() {
		System.out.println("Daily from 9am to 5pm.");		
	}
	
	public void printAddress() {
		System.out.println(this.address);
	}
	
	public void borrowBook(String title) {
		//need to check if book is there to borrow
		//is it in the catalog
		//and then check the status: borrowed or unborrowed
		boolean inLibrary = false;
		for(Book libBook: catalog) {
			if(libBook.title.equalsIgnoreCase(title))
				inLibrary = true;
				break;
		}
		if(inLibrary == false)
			System.out.println("Book is not in catalog");
		
		if (inLibrary)
			for(Book libBook : catalog) {
				if(libBook.isBorrowed())
					System.out.println("This book is currently checked out");
				else
					libBook.borrowed();
			}		
	}
	
	public void printAvailableBooks() {
		for(Book libBook: catalog) {
			System.out.println(libBook.title);
		}
	}
	
	public void returnBook(String title) {
		for(Book libBook: catalog) {
			if(libBook.title.equalsIgnoreCase(title))
				libBook.returned();
			else
				System.out.println("This book is not in this library");
		}
	}
	
} 