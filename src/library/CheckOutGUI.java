package library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckOutGUI {

	public static JFrame frmCheckout;
	private JTextField input;
	private HomeScreenGUI hs;

	/**
	 * Allows access to CheckOutGUI's frmCheckout so its visibility can be updated. 
	 * @return CheckOutGUI's frame.
	 */
	public JFrame getcoFrame() {
		return frmCheckout;
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frmCheckout = new JFrame();
		frmCheckout.setTitle("Checkout");
		frmCheckout.setBounds(100, 100, 450, 300);
		frmCheckout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Library lib = new Library();
		
		JButton back = new JButton("< Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCheckout.setVisible(false);
				hs = new HomeScreenGUI();
				JFrame frame = hs.getFrame();
				frame.setVisible(true);
			}
		});
		
		JButton quit = new JButton("Quit");
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		input = new JTextField();
		input.setColumns(10);
		
		JButton checkout = new JButton("CHECKOUT");
		checkout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String callNumber = input.getText();
				System.out.println(callNumber);
				if(lib.checkOut(callNumber) == false)
				{
					JOptionPane.showMessageDialog(frmCheckout, "Material not found in collection!");
				}
				lib.checkOut(callNumber);
				
			}
		});
		
		JLabel instruction = new JLabel("Enter call number:");
		GroupLayout groupLayout = new GroupLayout(frmCheckout.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(back)
							.addPreferredGap(ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
							.addComponent(quit))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(76)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(instruction, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(input, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(checkout)))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(61)
					.addComponent(instruction)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkout))
					.addPreferredGap(ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(quit)
						.addComponent(back))
					.addContainerGap())
		);
		
		frmCheckout.getContentPane().setLayout(groupLayout);
		frmCheckout.setVisible(true);
	}
}
