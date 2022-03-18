package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import library.Library;
import library.Material;

public class Library_Tests {

	@Test
	public void testLoadMaterials() {
		Library lib = new Library();
		ArrayList<Material> mats = lib.getMaterialList();
		int size = mats.size();
		assertEquals("there should be 4 materials in the mats arraylist", 4, size);
	}

	@Test
	public void testCheckOut() {
		Library lib = new Library();
		Material mat = lib.findMaterial("C124.S17");
		assertEquals("Checking to see if this callnumber isn't checked out yet" , true, mat.canBeCheckedOut());
		lib.checkOut("C124.S17");
		assertEquals("This item should be checked out now", false, mat.canBeCheckedOut());
	}

	@Test
	public void testFindMaterial() {
		Library lib = new Library();
		assertEquals("The call number should match up with the material", "QJ015.C42.55.2", 
				lib.findMaterial("QJ015.C42.55.2").getCallNumber());
		
	}

}
