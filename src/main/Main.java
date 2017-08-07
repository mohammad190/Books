package main;
import books.Book;

public class Main {

	public static void main(String[] args) {
		
		
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		Book book4 = new Book("Harry potter", "j.k rolling", "nonfication", 300, 14);
		
		
		
		book4.checkoutBook(); 
		
	
		
	} 

}
