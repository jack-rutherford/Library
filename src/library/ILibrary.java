package library;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface ILibrary {
	
	void loadMaterials() throws FileNotFoundException;
	
	void checkOut();
	
	String displayCollection();
	
	ArrayList<Material> getMaterialList(); 
	
}
