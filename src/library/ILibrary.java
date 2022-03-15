package library;

import java.util.ArrayList;

public interface ILibrary {
	
	void loadMaterials();
	
	void checkOut();
	
	String displayCollection();
	
	ArrayList<Material> getMaterialList(); 
	
}
