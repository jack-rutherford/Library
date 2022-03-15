package library;

public class Book extends Material {
	
	private String genre, author;
	
	
	public Book(String title, String callNumber, String author, String genre) {
		super(title, callNumber);
		this.author = author;
		this.genre = genre;
		// TODO Auto-generated constructor stub
	}

	
}
