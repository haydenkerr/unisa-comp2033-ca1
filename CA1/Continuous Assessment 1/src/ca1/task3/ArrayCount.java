package ca1.task3;


/**
 * @author hayden
 *  File: ArrayCount.java
Author: Hayden Kerr
Email Id: kerhy006@mymail.unisa.edu.au
COMP2033 - Applied Data Structures
This is my own work as defined by the University's
Academic Misconduct policy.
04/04/2023
 *
 */

/*
 * Task 3: “Count occurrences of a string within an array”

This task requires you to count the number of occurrences of a 
given target within an array. 

You will need to implement the ‘count’ method contained within the ‘ArrayCount’ class. 
It is important to consider your unit tests prior to beginning this task. 
You will need to implement a number of tests to ensure your implementation is correct. 

Consider the following situations:
The target does not exist in the array, 
	response if Count = 0 
The target appears only once in the array, 
	response if count =1
The target appears multiple times in the array
	response if count >1
 */

import java.util.Scanner;


// class ArrayCount will see if target is in stringArray
public class ArrayCount {
	public int count(String[] stringArray, String target) {
		
		int counted=0;
	    
	    boolean flag = false;
	 
	        for (int i = 0; i < stringArray.length; i++) {
	            if (stringArray[i].equalsIgnoreCase(target)) {
	            	counted++;
	                flag = true;
	            }
	        }
	        if (flag == false) {
	            System.out.println("Not found");

	}
	       
	        System.out.println();
	        return counted;
}
	
	public static void main(String[] args) {
		   boolean exit = true;
			 System.out.println("Array Count - Task 3 ");
				
			 ArrayCount arrayCount = new ArrayCount(); 
			 while(exit) {
		    	Scanner scanner = new Scanner(System.in); 
		    		System.out.println("");
		    		System.out.print("Please enter the string: ");
		    		String inputArray=scanner.nextLine();
					
		    		String[] stringArray;
		    		
		    		System.out.println("Please enter the delimiter: ");
		    		System.out.print("Just enter as  , or ,_ or _ ");
		    		
		    		String delimiter=scanner.nextLine();
		    		
		    		stringArray = inputArray.split( delimiter);
		    	

		    		System.out.print("Please enter the target: ");
		    		String target =scanner.nextLine();
					


					
					
					int counted = arrayCount.count(stringArray,target);
					
					System.out.print(target +" was found " + counted +" times.");
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
