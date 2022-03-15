package library;

public abstract class Material {
	
//	private int checkOutTime;
	private String title;
	private String callNumber;
	private boolean canBeCheckedOut;
	//Gregorian calendar due date
	
	public Material(String title, String callNumber) {
		this.title = title;
		this.callNumber = callNumber;
		canBeCheckedOut = true;
	}
	
	public boolean canBeCheckedOut() {
		return canBeCheckedOut();
	}
	
	public void setCanBeCheckedOut(boolean canBeCheckedOut) {
		this.canBeCheckedOut = canBeCheckedOut;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCallNumber() {
		return callNumber;
	}
	
}
