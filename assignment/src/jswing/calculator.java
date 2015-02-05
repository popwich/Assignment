package jswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Map;
import org.apache.commons.lang.ArrayUtils;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;

public class calculator {

	private JFrame frame;
	private JTextArea textField;
	
	//create a dictionary to hold last operator user clicked
	@SuppressWarnings("unchecked")
	private Map<String, String> operatorDict = ArrayUtils.toMap(new String [][]{
			{"plus", "false"}, {"minus", "false"}, {"multiply", "false"}, {"divide", "false"} 
			}
	);
	protected double left;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
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
		
		textField = new JTextArea(); //result display panel
		textField.setEditable(false);
		textField.setText("0");
		textField.setBounds(127, 11, 200, 32);
		frame.getContentPane().add(textField);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			if ( textField.getText().equals("0")) {
				textField.setText("");
				}
				textField.append("1");
				left = Double.parseDouble(textField.getText());
			}
		});
		button_1.setBounds(28, 59, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( textField.getText().equals("0")) {
					textField.setText("");
					}
					textField.append("2");
				}
		});
		button_2.setBounds(127, 59, 89, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( textField.getText().equals("0")) {
					textField.setText("");
					}
					textField.append("3");
				}
		});
		button_3.setBounds(226, 59, 89, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_eq = new JButton("=");
		button_eq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//perform * / + -  calculation in sequence	
				double right = 0.0;
				double total = 0.0;
				if (textField.getText().isEmpty()) { //check whether number to the right of operator is empty or not, assign the left number to right name if right number is empty
					right = left;
				} else {
				right = Double.parseDouble(textField.getText()); //right number is not empty, extract double value out of string 
				}
				if (operatorDict.get("multiply") == "true") {
					total = left * right;
					textField.setText(""+total);
				}
				else if (operatorDict.get("divide") == "true") {
					 total = left / right;
					textField.setText(""+total);
				} else if (operatorDict.get("plus") == "true") {
					 total = left + right;
					textField.setText(""+total);
				} else if (operatorDict.get("minus") == "true") {
					 total = left - right;
					textField.setText(""+total);
				} 				
			}
		});
		button_eq.setBounds(226, 161, 89, 23);
		frame.getContentPane().add(button_eq);
		
		JButton button_plus= new JButton("+");
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorDict.put("plus", "true");				
				operatorDict.put("minus", "false");
				operatorDict.put("multiply", "false");
				operatorDict.put("divide", "false");				
				String textbox = textField.getText();
				textField.setText(""); //clear textbox after operator is clicked so additional click on the operator go to below statement and does nothing
				if (!textbox.isEmpty()) { //do nothing if textbox is empty, otherwise extract double vaule out of textbox and assign to left 
		   			left = Double.parseDouble(textbox); 
				}						
			}
		});
		button_plus.setBounds(325, 59, 89, 23);
		frame.getContentPane().add(button_plus);
		
		JButton button = new JButton("4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( textField.getText().equals("0")) {
					textField.setText("");
					}
					textField.append("4");
				}
		});
		button.setBounds(28, 93, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( textField.getText().equals("0")) {
					textField.setText("");
					}
					textField.append("5");
				}
		});
		button_4.setBounds(127, 93, 89, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( textField.getText().equals("0")) {
					textField.setText("");
					}
					textField.append("6");
				}
		});
		button_5.setBounds(226, 93, 89, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( textField.getText().equals("0")) {
					textField.setText("");
					}
					textField.append("7");
				}
		});
		button_6.setBounds(28, 127, 89, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( textField.getText().equals("0")) {
					textField.setText("");
					}
					textField.append("8");
				}
		});
		button_7.setBounds(127, 127, 89, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( textField.getText().equals("0")) {
					textField.setText("");
					}
					textField.append("9");
				}
		});
		button_8.setBounds(226, 127, 89, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( textField.getText().equals("0")) {
					textField.setText("");
					}
					textField.append("0");
				}
		});
		button_9.setBounds(127, 161, 89, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorDict.put("plus", "false");
				operatorDict.put("minus", "true");
				operatorDict.put("multiply", "false");
				operatorDict.put("divide", "false");
				String textbox = textField.getText();
				textField.setText("");
				if (!textbox.isEmpty()) {
		   			left = Double.parseDouble(textbox);
				}			
			}
		});
		button_10.setBounds(325, 93, 89, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorDict.put("plus", "false");
				operatorDict.put("minus", "false");
				operatorDict.put("multiply", "true");
				operatorDict.put("divide", "false");
				String textbox = textField.getText();
				textField.setText("");
				if (!textbox.isEmpty()) {
		   			left = Double.parseDouble(textbox);
				}
			}
		});
		button_11.setBounds(325, 127, 89, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorDict.put("plus", "false");
				operatorDict.put("minus", "false");
				operatorDict.put("multiply", "false");
				operatorDict.put("divide", "true");
				String textbox = textField.getText();
				textField.setText("");
				if (!textbox.isEmpty()) {
		   			left = Double.parseDouble(textbox);
				}
			}
		});
		button_12.setBounds(325, 161, 89, 23);
		frame.getContentPane().add(button_12);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
			}
		});
		btnC.setBounds(28, 161, 89, 23);
		frame.getContentPane().add(btnC);
		
		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Radians");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String trigonometric_type = "radian";
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.setBounds(108, 222, 89, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("sin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if (rdbtnNewRadioButton_1.isSelected()) { 
					textField.setText("" + Math.sin(Double.valueOf(textField.getText()))); //radians type
				}else {					
					textField.setText("" + Math.sin(Math.toRadians(Double.valueOf(textField.getText())))); //convert to radians if degree type is choosed
				}				
			}
			
		});
		btnNewButton.setBounds(28, 195, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton_1.isSelected()) { 
					textField.setText("" + Math.cos(Double.valueOf(textField.getText()))); //radians type
				}else {					
					textField.setText("" + Math.cos(Math.toRadians(Double.valueOf(textField.getText())))); //convert to radians if degree type is choosed
				}	
			}
		});
		btnNewButton_1.setBounds(127, 195, 89, 23);
		frame.getContentPane().add(btnNewButton_1);	
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Degrees");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(28, 222, 74, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton_1.isSelected()) { 
					textField.setText("" + Math.tan(Double.valueOf(textField.getText()))); //radians type
				}else {					
					textField.setText("" + Math.tan(Math.toRadians(Double.valueOf(textField.getText())))); //convert to radians if degree type is choosed
				}	
			}
		});
		btnTan.setBounds(226, 195, 89, 23);
		frame.getContentPane().add(btnTan);
		
		JButton btnX = new JButton("Square");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("" + (Double.valueOf(textField.getText())) * (Double.valueOf(textField.getText())));
			}
		});
		btnX.setBounds(325, 195, 89, 23);
		frame.getContentPane().add(btnX);
		
		JButton btnSqrt = new JButton("Sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("" + Math.sqrt(Double.valueOf(textField.getText())));
			}
		});
		btnSqrt.setBounds(325, 228, 89, 23);
		frame.getContentPane().add(btnSqrt);

	}
}
