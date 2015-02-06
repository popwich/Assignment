package wk5_proj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class wk5_gui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblInitialBalance;
	private JTextArea textArea;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextArea textArea_1;

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
		frame.setBounds(100, 100, 450, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddCustomer = new JButton("Create Acct");
		btnAddCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//retrieve acct data from input box
				String acctId = textField_4.getText();	
				double initBalance = Double.parseDouble(textField_5.getText());
				
				//new Acct object
				Acct acct1 = new Acct();
				acct1.setAccountId(acctId);
				acct1.setBalance(initBalance);
				
				//display customer in textAre_1
				textArea_1.append("New acct created: \n");
				textArea_1.append("AccountId: " + acct1.getAccountId() + "\n");
				textArea_1.append("Account Balancer: " + acct1.getBalance() + "\n");				
			}
		});
		btnAddCustomer.setBounds(221, 73, 99, 23);
		frame.getContentPane().add(btnAddCustomer);
		
		JLabel lblAcctNumber = new JLabel("Acct Number");
		lblAcctNumber.setBounds(221, 19, 74, 14);
		frame.getContentPane().add(lblAcctNumber);
		
		textField = new JTextField();
		textField.setBounds(59, 16, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(59, 46, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblInitialBalance = new JLabel("Initial Balance");
		lblInitialBalance.setBounds(221, 48, 74, 14);
		frame.getContentPane().add(lblInitialBalance);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 178, 143, 220);
		frame.getContentPane().add(textArea);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 19, 74, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 50, 74, 14);
		frame.getContentPane().add(lblGender);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(10, 77, 42, 14);
		frame.getContentPane().add(lblAge);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(59, 78, 86, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(59, 109, 86, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(305, 19, 86, 20);
		frame.getContentPane().add(textField_4);
		
		JButton btnCreateCustomer = new JButton("Create Customer");
		btnCreateCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//retrieve customer data input
				String name = textField.getText();	
				String gender = textField_1.getText();
				int age = Integer.parseInt(textField_2.getText());
				String address = textField_3.getText();				
				Customer c1 = new Customer();
				c1.setName(name); c1.setGender(gender); c1.setAge(age); c1.setAddress(address); 
				
				//display customer in textArea		
				textArea.append("New customer created: \n");
				textArea.append("name: " + c1.getName() + "\n");
				textArea.append("gender: " + c1.getGender() + "\n");
				textArea.append("age: " + c1.getAge() + "\n");
				textArea.append("address: " + c1.getAddress() + "\n");
			}
		});
		btnCreateCustomer.setBounds(5, 144, 124, 23);
		frame.getContentPane().add(btnCreateCustomer);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 112, 42, 14);
		frame.getContentPane().add(lblAddress);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(305, 46, 86, 20);
		frame.getContentPane().add(textField_5);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(216, 109, 143, 75);
		frame.getContentPane().add(textArea_1);
	}
}
