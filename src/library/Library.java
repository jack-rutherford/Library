package library;

import java.io.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Library implements ILibrary {

	private ArrayList<Material> materialList;
	
	//Current date of type gregorian calendar
	
	@Override
	public void loadMaterials() throws FileNotFoundException {
		// TODO Loads materials from input file into array of materials. 
		materialList = new ArrayList<>();
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
		for(int i = 0; i < materialList.size(); i++)
		{
			System.out.println(materialList.get(i).getTitle());
		}
		
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String displayCollection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Material> getMaterialList() {
		// TODO Auto-generated method stub
		return null;
	}

}
