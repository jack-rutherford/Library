package library;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface ILibrary {
	
	void loadMaterials() throws FileNotFoundException;
	
	boolean checkOut(String callNumber);
	
	String displayCollection();
	
	ArrayList<Material> getMaterialList(); 
	
}
