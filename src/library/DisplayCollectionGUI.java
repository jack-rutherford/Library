package library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;

public class DisplayCollectionGUI {

	public static JFrame frmDisplaymaterials;
	private HomeScreenGUI hs;

	/**
	 * Allows acces to the static frmDisplayMaterials field so its visibility can be updated.
	 * @return DisplayCollectionGUI's frame.
	 */
	public JFrame getdisplayFrame() {
		return frmDisplaymaterials;
	}
	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		Library lib = new Library();
		frmDisplaymaterials = new JFrame();
		frmDisplaymaterials.setTitle("DisplayMaterials");
		frmDisplaymaterials.setBounds(100, 100, 450, 300);
		frmDisplaymaterials.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDisplaymaterials.setVisible(true);
		
		JLabel Greeting = new JLabel("Current inventory of all materials.");
		
		JButton quit = new JButton("Quit");
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JButton back = new JButton("< Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDisplaymaterials.setVisible(false);
				hs = new HomeScreenGUI();
				JFrame frame = hs.getFrame();
				frame.setVisible(true);
			}
		});
		
		JTextArea textArea = new JTextArea(lib.displayCollection(),50,50);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		
		
		GroupLayout groupLayout = new GroupLayout(frmDisplaymaterials.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 364, Short.MAX_VALUE)
							.addGap(32))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(Greeting, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
								.addGap(66))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(back)
								.addPreferredGap(ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
								.addComponent(quit)
								.addContainerGap()))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(Greeting)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(quit)
						.addComponent(back))
					.addContainerGap())
		);
		frmDisplaymaterials.getContentPane().setLayout(groupLayout);
		
	}
}
