package helloworld;
//package swapassignment;

/**
 *
 * @author Ihab Kassem
 */

import javax.swing.JOptionPane;

public class SwapAssignment {

    /**
     * @param args the command line arguments
     */
    
    private String firstNumber = null;
    private String secondNumber = null;
    
    public static void main(String[] args) {
        // Create class instance 
        SwapAssignment callClass = new SwapAssignment();
        // Show greeting message
        callClass.greeting();
        // Show first number message
        callClass.getFirstNumber();
        // Show second number message
        callClass.getSecondNumber();
        // Swap the numbers
        callClass.swapNumber();
    }
    public void greeting()
    {
        // Create the message object
        JOptionPane.showMessageDialog(null, "Welcome to my program!", 
                "Welcome!", JOptionPane.PLAIN_MESSAGE);
    }
    public void getFirstNumber()
    {
        // Create the message object, and take the input of first number
        firstNumber = JOptionPane.showInputDialog(null, 
                "First number?", "", JOptionPane.QUESTION_MESSAGE);
    }
    public void getSecondNumber()
    {
        // Create the message object, and take the input of second number
        secondNumber = JOptionPane.showInputDialog(null, 
                "Second number?", "", JOptionPane.QUESTION_MESSAGE);
    }
    public void swapNumber()
    {
        // Create temp var for swapping purposes
        int temp = 0;
        // Create the integer vars of the first number and second number
        int fNumber = Integer.parseInt(firstNumber);
        int sNumber = Integer.parseInt(secondNumber);
        // Show the summary message of the original values
        JOptionPane.showMessageDialog(null, 
                "The original value of the first number is: " + fNumber + 
                "\nThe original value of the second number is: " + sNumber, 
                "Summary of Original", JOptionPane.PLAIN_MESSAGE);        
        // Swap the numbers and complete the increment
        temp = sNumber;
        sNumber = fNumber;
        fNumber = temp;

        temp = 0;
	fNumber = fNumber + 100; //it can be written as fNumber += 100;
	sNumber = sNumber + 50; //it can be written as sNumber += 50;

        // Show the summary message of first number
        JOptionPane.showMessageDialog(null, "The new value of first number is: "
                + fNumber, "Summary", JOptionPane.PLAIN_MESSAGE);
        // Show the summary message of first number
        JOptionPane.showMessageDialog(null, 
                "The new value of second number is: " + sNumber, 
                "Summary", JOptionPane.PLAIN_MESSAGE);
        
    }
}