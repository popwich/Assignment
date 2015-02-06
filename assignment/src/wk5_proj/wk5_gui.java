package wk5_proj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class wk5_gui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblInitialBalance;

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
		
		JButton btnAddCustomer = new JButton("Create Acct");
		btnAddCustomer.setBounds(10, 111, 99, 23);
		frame.getContentPane().add(btnAddCustomer);
		
		JLabel lblAcctNumber = new JLabel("Acct Number");
		lblAcctNumber.setBounds(10, 24, 74, 14);
		frame.getContentPane().add(lblAcctNumber);
		
		textField = new JTextField();
		textField.setBounds(94, 21, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(94, 47, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblInitialBalance = new JLabel("Initial Balance");
		lblInitialBalance.setBounds(10, 50, 74, 14);
		frame.getContentPane().add(lblInitialBalance);
	}

}
