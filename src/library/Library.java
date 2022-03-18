package library;

import java.io.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * The library class deals with managing and populating the arraylist
 * of Materials for UserInterface and the GUI's to use. It also displays
 * the contents of the material arraylist in String form.
 * 
 * @author jackrutherford
 * @author justinfay
 * @date 3/17/22
 * @class CSCI 235
 *
 */
public class Library implements ILibrary {

	private ArrayList<Material> materialList;
	
	//Current date of type gregorian calendar
	
	public Library() { 
		materialList = new ArrayList<>();
		try {
			loadMaterials();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Initializes and loads materials from a text file (libraries inventory list) into an array to be accessed. 
	 */
	@Override
	public void loadMaterials() throws FileNotFoundException {
		
		//try statement to catch file not found
		try {
			File file = new File("Input.txt");
			Scanner scan = new Scanner(file);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String[] temp = new String[4];
			String line = br.readLine();
			while(line != null) {
					temp = line.split(",");
					if(temp[0].equals("B")) 
						materialList.add(new Book(temp[1],temp[2],temp[3],temp[4]));
					else
						materialList.add(new Periodical(temp[1],temp[2],temp[3],temp[4],temp[5]));
					line = br.readLine();
			}
			scan.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found...");
		} catch(IOException e) {
			System.out.println("Error reading the line...");
		}
	}
	
	
	/**
	 * Finds a material in the material arraylist given its call number
	 * returns true and sets the due date if it was found, and false if not
	 */
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
	
	/**
	 * Finds a material and returns the type material if it is found.
	 * Finds the material using a String callNumber
	 * @param callNumber
	 * @return material or null
	 */
	public Material findMaterial(String callNumber) {
		for(Material mat : materialList) {
			if(mat.getCallNumber().equalsIgnoreCase(callNumber)) {
				return mat;
			}
		}
		return null;
	}
	
	/**
	 * Prints out the entire materialList collection in a concise and clear way.
	 * It prints out different information depending on the variables type, and 
	 * whether or not it's checked out
	 */
	@Override
	public String displayCollection() {
		String result = "";
		String type = "";
		String otherInfo = "";
		String checkedOut = "";
		
		for(Material mat : materialList) {
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
			if(mat.canBeCheckedOut()) {
				//if canBeCheckedOut = true, it is NOT checked out (it is available to check out)
				checkedOut = "No";
				result += "Material Type: " + type + "\nCall Number: " + mat.getCallNumber() + "\nTitle: " 
						+ mat.getTitle() + "\nChecked Out: " + checkedOut + "\n" +  otherInfo + "\n\n";
			}
			else { //don't display checkout date and due date if it isn't checked out
				//if canBeCheckedOut = false, it IS checked out (it is NOT available to check out)
				checkedOut = "Yes";
				result += "Material Type: " + type + "\nCall Number: " + mat.getCallNumber() + "\nTitle: " 
						+ mat.getTitle() + "\nChecked Out: " + checkedOut + "\n" +  otherInfo + "\n" + mat.getCheckOutDate() + 
						mat.getDueDate() + "\n";
			}
			
		}
//		System.out.println(result);
		return result;
	}
	
	/**
	 * Returns an arraylist of the materialList
	 * @return materialList
	 */
	@Override
	public ArrayList<Material> getMaterialList() {
		return materialList;
	}

}
