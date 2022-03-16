package library;

public class Periodical extends Material {

	private String issue, volume, genre;
	
	public Periodical(String callNumber, String title, String issue, String volume, String genre) {
		super(title, callNumber);
		this.issue = issue;
		this.volume = volume;
		this.genre = genre;
		// TODO Auto-generated constructor stub
	}
}
