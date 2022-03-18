package library;

/**
 * 
 * Book is a subclass to Material, it's defining traits are
 * having genre and author, and passing the callNumber and title
 * to the super class. 
 * 
 * @author jackrutherford
 * @author justinfay
 * @date 3/17/22
 * @class CSCI 235
 *
 */
public class Book extends Material {
	
	private String genre, author;
	
	/**
	 * Constructor for the Book class, passes callNumber and 
	 * title to the super class, and defines auther and genre itself
	 * @param callNumber
	 * @param title
	 * @param author
	 * @param genre
	 */
	public Book(String callNumber, String title, String author, String genre) {
		super(title, callNumber);
		this.author = author;
		this.genre = genre;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Accessor method for author of the book
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * Accessor method for the genre of the book
	 * @return genre
	 */
	public String getGenre() {
		return genre;
	}
}
