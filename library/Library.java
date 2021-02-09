package library;

import java.util.List;

public class Library {
    // Add the missing implementation to this class
	private String address;
	private List<Book> catalog;
	
	
	public Library() {};
	
	public Library(String address) {
		this.address = address; 
	}
	
	public void addBook(Book newBook) {
		catalog.add(newBook);
		
	}
	
	public static void printOpeningHours() {
		System.out.println("Daily from 9am to 5pm.");		
	}
	
	public void printAddress() {
		System.out.prinln(this.address);
	}
	
} 