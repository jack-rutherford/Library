package library;

import java.io.FileNotFoundException;

/**
 * 
 * Main class that runs the entire project
 * 
 * @author jackrutherford
 * @author justinfay
 * @date 3/17/22
 * @class CSCI 235
 *
 */
public class Project6Main {

	public static void main(String[] args) {	
		UserInterface UI = new UserInterface();
		try {
			UI.runProgram();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found...");
		}
	}

}

