package library;

/**
 * 
 * Periodical is a subclass to Material, it's defining traits are
 * having genre, issue, and volume, and passing the callNumber and title
 * to the super class. 
 * 
 * @author jackrutherford
 * @author justinfay
 * @date 3/17/22
 * @class CSCI 235
 *
 */
public class Periodical extends Material {

	private String issue, volume, genre;
	
	/**
	 * Constructor for Periodical. Passes callNumber and title to the super class
	 * and instantiates the other fields.
	 * @param callNumber
	 * @param title
	 * @param issue
	 * @param volume
	 * @param genre
	 */
	public Periodical(String callNumber, String title, String issue, String volume, String genre) {
		super(title, callNumber);
		this.issue = issue;
		this.volume = volume;
		this.genre = genre;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Accessor method for issue
	 * @return issue
	 */
	public String getIssue() {
		return issue;
	}
	
	/**
	 * Accessor method for volume
	 * @return volume
	 */
	public String getVolume() {
		return volume;
	}
	
	/**
	 * Accessor method for genre
	 * @return genre
	 */
	public String getGenre() {
		return genre;
	}
	
}
