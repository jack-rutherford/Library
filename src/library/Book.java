package library;

public class Book extends Material {
	
	private String genre, author;
	
	
	public Book(String callNumber, String title, String author, String genre) {
		super(title, callNumber);
		this.author = author;
		this.genre = genre;
		// TODO Auto-generated constructor stub
	}

	public String getAuthor() {
		return author;
	}
	
	public String getGenre() {
		return genre;
	}
}
