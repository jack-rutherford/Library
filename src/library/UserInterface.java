package library;

import javax.swing.*;

public class UserInterface implements IUserInterface {
	
	private JPanel homePanel;
	private JButton displayCollection, Checkout, Quit;
	private JLabel title;
	private final int WINDOW_WIDTH = 1000, WINDOW_HEIGHT = 500;

	/**
	 * Initializes JPanel features. 
	 */
	public UserInterface() {
		displayCollection = new JButton("Display Collection");
		Checkout = new JButton("Checkout");
		title = new JLabel("Library");
		System.out.println("Working");
		
		//Register buttons with action listener. 
		
		
	}
	
	@Override
	public void runProgram() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildPanel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		
	}

}
