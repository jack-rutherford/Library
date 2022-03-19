package library;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class DisplayCollectionGUI {

	public static JFrame frmDisplaymaterials;
	public JTextArea textArea;
	private HomeScreenGUI hs;
	private Library lib;

	/**
	 * Constructor for DisplayCollectionGUI that takes a library parameter
	 * so that the same library variable is used among the 3 GUI's
	 * @param lib
	 */
	public DisplayCollectionGUI(Library lib) {
		this.lib = lib;
	}
	
	public JTextArea getTA() {
		return textArea;
	}
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
//		Library lib = new Library();
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
				hs = new HomeScreenGUI(lib);
				JFrame frame = hs.getFrame();
				frame.setVisible(true);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
	
		GroupLayout groupLayout = new GroupLayout(frmDisplaymaterials.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(back)
							.addGap(296)
							.addComponent(quit))
						.addComponent(Greeting, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(Greeting)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(back)
						.addComponent(quit))
					.addContainerGap())
		);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setText(lib.displayCollection());
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		frmDisplaymaterials.getContentPane().setLayout(groupLayout);
		frmDisplaymaterials.getContentPane().setLayout(groupLayout);
		frmDisplaymaterials.getContentPane().setLayout(groupLayout);
		
	}
}
