package ca1.task2;

import java.util.Scanner;
/**
 *  <p>Task 2: “Loops”
 * @see <a href="https://uo.unisa.edu.au/course/view.php?id=2945&section=12">Continual Assessment 1!</a>
 *  <p>File: Loops.java</p>
 *  <p>Author: Hayden Kerr</p>
 * 	@author hayden
 *  <p>Email Id: kerhy006@mymail.unisa.edu.au</p>
 *  <p>COMP2033 - Applied Data Structures</p>
 *  <p>This is my own work as defined by the University's Academic Misconduct policy.</p>
 *  <p>04/04/2023</p>
 */


public class Loops {
	/**
	 * 
	 * @param numberOfTimes - int how many times should the word be output to console
	 */
	public void printWords(int numberOfTimes) {
		
		
		for (int i = 0; i < numberOfTimes; i++){
			System.out.print("words");
			System.out.print(" ");
			}
	}
	
	 @SuppressWarnings("resource")
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
				System.out.print("Would you like to print words on screen again? Y/N ");
				
				String response = scanner.nextLine();
				
				
				if(response.equalsIgnoreCase("n")) {
					
					exit = true;
					
					System.out.print("Goodbye");
					break;
				}
				
					
			}
		 
	
			
	 }
	
}
