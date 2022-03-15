package library;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class UserInterface extends JFrame {

	private JPanel homePanel;
	private JButton displayCollection, checkout, quit;
	private JLabel title;
	private final int WINDOW_WIDTH = 1000, WINDOW_HEIGHT = 500;

	/**
	 * Initializes JPanel features.
	 */
	public UserInterface() {

		setTitle("Library");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(homePanel);
		setVisible(true);

	}

	public void runProgram() throws FileNotFoundException {
		// TODO Auto-generated method stub

	}

	public void greeting() {
		// TODO Auto-generated method stub

	}

	public void buildPanel() {
		// Builds GUI Panel
		displayCollection = new JButton("Display Collection");
		checkout = new JButton("Checkout");
		quit = new JButton("Quit");
		title = new JLabel("Library");

		// Register buttons with action listener
		displayCollection.addActionListener(new ConvertButtonListener());
		checkout.addActionListener(new ConvertButtonListener());
		quit.addActionListener(new ConvertButtonListener());

		// add elements to panel.
		homePanel = new JPanel();

		homePanel.add(title);
		homePanel.add(checkout);
		homePanel.add(displayCollection);
		homePanel.add(quit);
	}

	private class ConvertButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Makes buttons usable

			if (e.getSource() == displayCollection) {
				System.out.println("Display Collection...");
			} else if (e.getSource() == checkout) {
				// open checkout page...
				System.out.println("Open checkout...");
			} else if (e.getSource() == quit) {
				// quit program...
				setVisible(false);
				System.out.println("Quit program...");
			}
		}
	}
}
