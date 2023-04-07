package ca1.task2;



/**
 * @author hayden
 *  File: Loops.java
Author: Hayden Kerr
Email Id: kerhy006@mymail.unisa.edu.au
COMP2033 - Applied Data Structures
This is my own work as defined by the University's
Academic Misconduct policy.
04/04/2023
 *
 */
import java.util.Scanner;



/**This task does not have any tests associated with it.  
In this task, you are required to:

Implement the body of the ‘printWords’ method. 
Your method needs to print “words” within a loop. 
The method parameter determines the total number of times the loop should run. 
Add a ‘main’ method. 
Create an instance of the Loops object and call 
the ‘printWords’ method to verify your implementation. 

*/

public class Loops {
	public void printWords(int numberOfTimes) {
		
		
		for (int i = 0; i < numberOfTimes; i++){
			System.out.print("words");
			System.out.print(" ");
			}
		
		
	}
	
	
	 public static void main(String[] args) {
	   boolean exit = true;
		 System.out.println("Words - Task 2 - Loops");
			while(exit) {
	    	Scanner scanner = new Scanner(System.in); 
	    		System.out.println("");
	    		
	    		//Created number validation with try / catch statement
				// used logic that only int can be entered
				// used the NumberFormtException 
				int numberTimes = 0;
				boolean validInput = false;
				
				while (!validInput) {
					System.out.print("How many times would you like \"words\" on screen? ");
					String input = scanner.nextLine();
				    try {
				    	numberTimes = Integer.parseInt(input);
				        validInput = true;
				    } catch (NumberFormatException e) {
				        System.out.println("Invalid input. Please enter an integer value.");
				    }
				}
				
				Loops loopWords = new Loops();   
				loopWords.printWords(numberTimes);
				
				System.out.println();
				System.out.print("Would you like to encode/decode again? Y/N ");
				
				String response = scanner.nextLine();
				
				
				if(response.equalsIgnoreCase("n")) {
					
					exit = true;
					
					System.out.print("Goodbye");
					break;
				}
				
					
			}
		 
	
			
	 }
	
}
