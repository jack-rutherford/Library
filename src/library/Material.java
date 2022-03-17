package library;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Material {

	//	private int checkOutTime;
	private String title;
	private String callNumber;
	private boolean canBeCheckedOut;
	private GregorianCalendar dateCheckedOut;
	private Calendar dueDate;

	public Material(String title, String callNumber) {
		this.title = title;
		this.callNumber = callNumber;
		canBeCheckedOut = true;
		dateCheckedOut = new GregorianCalendar();
		dueDate = (GregorianCalendar)dateCheckedOut.clone();

	}

	public boolean canBeCheckedOut() {
		return canBeCheckedOut;
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

	public void setDueDate() {
		if(this instanceof Book) {
			dueDate.add(Calendar.DAY_OF_YEAR, 21);
		}
		else {
			dueDate.add(Calendar.DAY_OF_YEAR, 7);
		}
	}

	public String getDueDate() {
		return String.format("Due Date: %tD\n", dueDate);
	}
	
	public String getCheckOutDate() {
		return String.format("Date Out: %tD\n", dateCheckedOut);
	}

}
