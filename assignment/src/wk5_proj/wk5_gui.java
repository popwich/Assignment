package wk5_proj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class wk5_gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wk5_gui window = new wk5_gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public wk5_gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddCustomer = new JButton("Add customer");
		btnAddCustomer.setBounds(10, 111, 99, 23);
		frame.getContentPane().add(btnAddCustomer);
	}

}
