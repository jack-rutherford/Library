package library;

import java.io.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Library implements ILibrary {

	private ArrayList<Material> materialList;
	
	//Current date of type gregorian calendar
	
	/**
	 * Initializes and loads materials from a text file (libraries inventory list) into an array to be accessed. 
	 */
	@Override
	public void loadMaterials() throws FileNotFoundException {
		// TODO Loads materials from input file into array of materials. 
		materialList = new ArrayList<>();
		
		//try statement to catch file not found
		try {
			File file = new File("Input.txt");
			Scanner scan = new Scanner(file);
			String[] temp = new String[4];
			while(scan.hasNextLine()) {
					temp = scan.nextLine().split(",");
					if(temp[0].equals("B")) 
						materialList.add(new Book(temp[1],temp[2],temp[3],temp[4]));
					else
						materialList.add(new Periodical(temp[1],temp[2],temp[3],temp[4],temp[5]));	
			}
			scan.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found...");
		}
	}

	@Override
	public boolean checkOut(String callNumber) {
		for(Material mat : materialList) {
			if(mat.getCallNumber().equalsIgnoreCase(callNumber)) {
				mat.setCanBeCheckedOut(false);
				mat.setDueDate();
				return true; //Found the material we were looking for
			}
		}
		return false; //Didn't find the material in the collection
	}

	@Override
	public String displayCollection() {
		String result = "";
		String type = "";
		String otherInfo = "";
		String checkedOut = "";
		
		for(Material mat : materialList) {
			if(mat.canBeCheckedOut()) {
				//if canBeCheckedOut = true, it is NOT checked out (it is available to check out)
				checkedOut = "No";
			}
			else {
				//if canBeCheckedOut = false, it IS checked out (it is NOT available to check out)
				checkedOut = "Yes";
			}
			//check what type the material is first,
			//add related info depending on the type
			if(mat instanceof Book) { 
				type = "Book";
				otherInfo = "Author: " + ((Book)mat).getAuthor() + "\nGenre: " + ((Book)mat).getGenre();
			}
			
			else if(mat instanceof Periodical){
				type = "Periodical";
				otherInfo = "Volume: " + ((Periodical)mat).getVolume() + "\nIssue: " + ((Periodical)mat).getIssue() +
						"\nGenre: " + ((Periodical)mat).getGenre();
			}
			
			//concatenate all String info to display in a cohesive way
			result += "Material Type: " + type + "\nCall Number: " + mat.getCallNumber() + "\nTitle: " 
					+ mat.getTitle() + "\nChecked Out: " + checkedOut + "\nDate Checked Out: " + mat.getCheckOutDate() + 
					"\nDue Date: " + mat.getDueDate() + "\n" + otherInfo + "\n\n";
		}
		
		return result;
	}

	@Override
	public ArrayList<Material> getMaterialList() {
		return materialList;
	}

}
