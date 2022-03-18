package library;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 * An abstract class with a dynamic type of Book or Periodical.
 * Made an abstract class so there can't be an instance of just a material
 * (has to be a book or periodical). Deals with setting the due date for
 * itself depending on it's dynamic type as well.
 * 
 * @author jackrutherford
 * @author justinfay
 * @date 3/17/22
 * @class CSCI 235
 *
 */
public abstract class Material {

	private String title;
	private String callNumber;
	private boolean canBeCheckedOut;
	private GregorianCalendar dateCheckedOut;
	private Calendar dueDate;

	/**
	 * Constructor for Material. Instantiates fields and also
	 * sets up a calendar and Gregorian calendar 
	 * @param title
	 * @param callNumber
	 */
	public Material(String title, String callNumber) {
		this.title = title;
		this.callNumber = callNumber;
		canBeCheckedOut = true;
		dateCheckedOut = new GregorianCalendar();
		dueDate = (GregorianCalendar)dateCheckedOut.clone();

	}

	/**
	 * Accessor method for canBeCheckedOut field
	 * @return if the book can be checked out
	 */
	public boolean canBeCheckedOut() {
		return canBeCheckedOut;
	}

	/**
	 * Mutator method for canBeCheckedOut field
	 * @param canBeCheckedOut
	 */
	public void setCanBeCheckedOut(boolean canBeCheckedOut) {
		this.canBeCheckedOut = canBeCheckedOut;
	}

	/**
	 * Accessor method for title field
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Accessor method for callNumber field
	 * @return callNumber
	 */
	public String getCallNumber() {
		return callNumber;
	}

	/**
	 * Mutator method for due date.
	 * Sets due date 7 days out for periodicals, and 21 for books
	 */
	public void setDueDate() {
		if(this instanceof Book) {
			dueDate.add(Calendar.DAY_OF_YEAR, 21);
		}
		else {
			dueDate.add(Calendar.DAY_OF_YEAR, 7);
		}
	}

	/**
	 * Accessor method for the due date of the material
	 * @return due date
	 */
	public String getDueDate() {
		return String.format("Due Date: %tD\n", dueDate);
	}
	
	/**
	 * Accessor method for the check out date of the material
	 * @return check out date
	 */
	public String getCheckOutDate() {
		return String.format("Date Out: %tD\n", dateCheckedOut);
	}

}
