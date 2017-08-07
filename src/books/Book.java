package books;

public class Book {
	
	static int count = 0;
	String title, author, genre;
	int pages; 
	double price;
	final double tax = 0.085;
	
	public Book() {
		count++;
		
	}
	public Book(String title) {
		this.title = title;
		count++;
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		count++;
	}
	public Book(String title, String author, String genre) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		count++;
	}
	public Book(String title, String author, String genre, int pages, int price) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pages = pages;
		this.price = price;
		count++;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getGenre() {
		return genre;
	}
	public int getPages() {
		return pages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
	public void reedBook() {
		System.out.println("I read " + title + " by " + author); //  "I read (title) by (Author)"
		
		
	}
	
	public static int getCpont() {
		return count;
	}
	
	
	public double checkoutBook() {
		double totalprice;
		
		totalprice = this.price + (this.price * tax);
		
		System.out.println("the total checkout of " + this.title + 
				" by " + this.author + " is $ " + totalprice);
		
		return totalprice;
	}
	
	
	
	

}
