package helloworld;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

 
public class DigitConverterSimple

{ 
	public static void main(String[] args)
	{
		// Create class instance 
		DigitConverterSimple callClass = new DigitConverterSimple();
		
		// call callClass method getUserAnswer to ask whether user like to continue or not.
		// continue if method getUserExitAnswer is true, exit if false
		while (callClass.getUserExitAnswer() == true) {		
			
			String digit = callClass.getNumber(); //assign user entered digit to string variable 'digit'
			int number = Integer.parseInt(digit); //cast to int
			String text1 = callClass.digitConvert(number); //convert user entered digit to text form
		    callClass.displayText(digit, text1); //display converted text 
		}	
	}
		
 public  boolean getUserExitAnswer () {
	// create a jframe
    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
     
    // show a joptionpane dialog using show confirmdialog to ask wheher user like to continue or exit
    int dialogResult = JOptionPane.showConfirmDialog(frame, "Would you like to convert a digit to text? ",
    	"Welcome!",
        JOptionPane.YES_NO_OPTION);
    
    if(dialogResult==0)
    	return true; //return 'true' if user selected 'Yes' which indicates user would like to continue
    else
    	return false; //return 'false' for all other user selections
  }
 
 public String getNumber() {
	// create a jframe
    JFrame frame = new JFrame("JOptionPane showInputDialog example");
     
    // show a joptionpane dialog using showInputDialog
    String number1 = JOptionPane.showInputDialog(frame,
        "Pls enter currency in numerical form? e.g.: 12345",
    	"number?",
        JOptionPane.QUESTION_MESSAGE);
     return number1;
  }

 public void displayText(String digit, String text) {
	// create a jframe
    JFrame frame = new JFrame("JOptionPane showInputDialog example");
     
 // show a joptionpane dialog using showMessageDialog
 	JOptionPane.showMessageDialog(frame,
 		 digit + " is: " + text + "\n",
 	  	 "Summary",
 		 JOptionPane.PLAIN_MESSAGE);	

  }
 public String digitConvert(final int num) {
	final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    final String[] tens = {
            "",        // 0
            "",        // 1
            "twenty",  // 2
            "thirty",  // 3
            "forty",   // 4
            "fifty",   // 5
            "sixty",   // 6
            "seventy", // 7
            "eighty",  // 8
            "ninety"   // 9
    };
	 
     if (num < 0) {
         return "minus " + digitConvert(-num);
     }

     if (num < 20) {
         return units[num];
     }

     if (num < 100) {
         return tens[num / 10] + ((num % 10 != 0) ? " " : "") + units[num % 10];
     }

     if (num < 1000) {
         return units[num / 100] + " hundred" + ((num % 100 != 0) ? " " : "") + digitConvert(num % 100);
     }

     if (num < 1000000) {
         return digitConvert(num / 1000) + " thousand" + ((num % 1000 != 0) ? " " : "") + digitConvert(num % 1000);
     }

     if (num < 1000000000) {
         return digitConvert(num / 1000000) + " million" + ((num % 1000000 != 0) ? " " : "") + digitConvert(num % 1000000);
     }

     return digitConvert(num / 1000000000) + " billion"  + ((num % 1000000000 != 0) ? " " : "") + digitConvert(num % 1000000000);
 }

}

