package library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class HomeScreenGUI {

	public static JFrame frame;
	private CheckOutGUI coGUI;
	private DisplayCollectionGUI dcGUI;
	
	/**
	 * Allows access to HomeScreenGUI's frame so its visibility can be updated. 
	 * @return HomeScreenGUI's frame. 
	 */
	public JFrame getFrame() {
		return frame;
	}


	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("Library");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JButton checkout = new JButton("Check Out");
		checkout.addActionListener(new ActionListener() {
			
			//Creates CheckoutGUI
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if(coGUI == null) {
					coGUI = new CheckOutGUI();
					coGUI.initialize();
				}
				JFrame coFrame = coGUI.getcoFrame();
				coFrame.setVisible(true);
				
				
					
			}
		});
		
		JButton displaycollection = new JButton("Display Collection");
		displaycollection.addActionListener(new ActionListener() {
			
			//Creates DisplayCollectionGUI
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if(dcGUI == null) {
					dcGUI = new DisplayCollectionGUI();
					dcGUI.initialize();
				}
				JFrame dcFrame = dcGUI.getdisplayFrame();
				dcFrame.setVisible(true);
				
					
			}
		});
		
		JLabel greeting = new JLabel("Welcome to the Library! Please use the buttons to navigate.");
		
		JButton quit = new JButton("Quit");
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(72)
							.addComponent(greeting))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(150)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(checkout, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(displaycollection, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
					.addContainerGap(73, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(365, Short.MAX_VALUE)
					.addComponent(quit, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(greeting)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(displaycollection)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(checkout)
					.addGap(129)
					.addComponent(quit)
					.addGap(19))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
