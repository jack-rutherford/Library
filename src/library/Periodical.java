package library;

public class Periodical extends Material {

	private String volume, issue, subject;
	
	public Periodical(String title, String callNumber, String issue, String volume) {
		super(title, callNumber);
		this.issue = issue;
		this.volume = volume;
		// TODO Auto-generated constructor stub
	}
}
