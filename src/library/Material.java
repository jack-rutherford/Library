package library;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Material {
	
//	private int checkOutTime;
	private String title;
	private String callNumber;
	private boolean canBeCheckedOut;
	private GregorianCalendar dueDate;
	private Calendar calendar;
	
	public Material(String title, String callNumber) {
		this.title = title;
		this.callNumber = callNumber;
		canBeCheckedOut = true;
		dueDate = new GregorianCalendar(2022, 3, 15);
		calendar = Calendar.getInstance();
		
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
