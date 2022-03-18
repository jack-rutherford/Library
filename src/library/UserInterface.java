package library;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class UserInterface extends JFrame {
	public UserInterface() {
	}

//	private JPanel homePanel;
//	private JButton displayCollection, checkout, quit;
//	private JLabel title;
//	private final int WINDOW_WIDTH = 500, WINDOW_HEIGHT = 200;

	/**
	 * Initializes JPanel features.
	 */

	public void runProgram() throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//Make the library and load the materials
		
		try {
			Library lib = new Library();
//			lib.loadMaterials();
//			lib.displayCollection();
			HomeScreenGUI g = new HomeScreenGUI(lib);
			g.initialize();
			
		}
//		catch (FileNotFoundException e) {
//			System.out.println("File not found...");
//		}
		catch(Exception e) {
			System.out.println("Error is: " + e);
			e.printStackTrace();
		}
	}
		
		public String test() {
			String result = "test";
			return result;
		}
	
		
		
		
		
		//Build the GUI
//		setTitle("Library");
//		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		buildPanel();
//		getContentPane().add(homePanel);
//		setVisible(true);
		
		
		

	public void greeting() {
		// TODO Auto-generated method stub

	}

	public void buildPanel() {
		
		
//		// Builds GUI Panel
//		displayCollection = new JButton("Display Collection");
//		checkout = new JButton("Checkout");
//		quit = new JButton("Quit");
//	
//		
//
//		// Register buttons with action listener
//		displayCollection.addActionListener(new ConvertButtonListener());
//		checkout.addActionListener(new ConvertButtonListener());
//		quit.addActionListener(new ConvertButtonListener());
//		
//		//formatting
//		getContentPane().setLayout(new BorderLayout(0, 0));
//		
//
//		// add elements to panel.
//		homePanel = new JPanel();
//		homePanel.setLayout(new BorderLayout());
//
//		homePanel.add(checkout, BorderLayout.LINE_START);
//		homePanel.add(displayCollection, BorderLayout.LINE_END);
//		homePanel.add(quit, BorderLayout.PAGE_END);

		
		
	}
//
//	private class ConvertButtonListener implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// Makes buttons usable
//
//			if (e.getSource() == displayCollection) {
//				System.out.println("Display Collection...");
//			} else if (e.getSource() == checkout) {
//				// open checkout page...
//				System.out.println("Open checkout...");
//			} else if (e.getSource() == quit) {
//				// quit program...
//				System.out.println("Quit program...");
//			}
//		}
//	}
}
