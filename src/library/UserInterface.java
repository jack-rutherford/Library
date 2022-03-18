package library;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

/**
 * 
 * User Interface deals with making an instance of the library class and
 * passing it to the GUI's for them to use. Also initializes the GUI's
 * 
 * @author jackrutherford
 * @author justinfay
 * @date 3/17/22
 * @class CSCI 235
 *
 */
public class UserInterface extends JFrame {

	/**
	 * Initializes JPanel features.
	 */
	public void runProgram() throws FileNotFoundException {
		// TODO Auto-generated method stub

		//Make the library and load the materials

		try {
			Library lib = new Library();
			HomeScreenGUI g = new HomeScreenGUI(lib);
			g.initialize();

		} catch(Exception e) {
			System.out.println("Error is: " + e);
			e.printStackTrace();
		}
	}

}
