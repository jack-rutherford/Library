package library;

import java.io.FileNotFoundException;

public class Project6Main {

	public static void main(String[] args) {
		Library l = new Library();
		try {
			l.loadMaterials();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		
		
		UserInterface UI = new UserInterface();
	/*	try {
			UI.runProgram();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found...");
		}
	}*/

}
}
