package src.ca1.task1;

/**
 * @author hayde
 *  File: CaesarCypher.java
Author: Hayden Kerr
Email Id: kerhy006@mymail.unisa.edu.au
COMP2033 - Applied Data Structures
This is my own work as defined by the University's
Academic Misconduct policy.
04/04/2023
 *
 */
import java.util.Scanner;

public class CaesarCypher {

	
	   private static final int ALPHABET_LENGTH = 26;

	   
	   /**
	 * @param input - input is the string input
	 * @param offset - offset from the 
	 * @return
	 */
	public static char[] encode(char[] input, int offset) {
	        char[] encodedInput = new char[input.length]; 
	        for (int i = 0; i < input.length; i++) {
	            char c = input[i];
	            if (Character.isLetter(c)) { //checks if array entry is a letter.
	                char startingLetter = Character.isUpperCase(c) ? 'A' : 'a'; // sets the base to good things
	                int encoded = (c - startingLetter + offset) % ALPHABET_LENGTH; // gets the encoded letter ID 
	            
	                encodedInput[i] = (char) (startingLetter + encoded); // converts to character
	            } else {
	                encodedInput[i] = c; // if not a alphabetic letter, then return. works for symbols, and numbers
	            }
	        }
	        return encodedInput;
	    }
	
	   public static char[] decode(char[] input, int offset) {
	        char[] decodedInput = new char[input.length];
	        for (int i = 0; i < input.length; i++) {
	            char c = input[i];
	            if (Character.isLetter(c)) { //checks if array entry is a letter.
	                char startingLetter = Character.isUpperCase(c) ? 'A' : 'a'; // sets the base
	                int encoded = (c - startingLetter - offset) % ALPHABET_LENGTH; // gets the encoded letter ID 
	                decodedInput[i] = (char) (startingLetter + encoded); // converts to character
	            } else {
	                decodedInput[i] = c;
	            }
	        }
	        return decodedInput;
	    }
	   
	    public static void main(String[] args) {
	       
			boolean exit = true;
			
			System.out.println("Caesar Cypher - Will encode alphabetic letters only");
			while(exit) {
	    	Scanner scanner = new Scanner(System.in); 
	    		System.out.println("");
	    		System.out.print("Enter a message to encode: ");
				String input = scanner.nextLine();
				char[] charArray = input.toCharArray();

				System.out.print("Enter an offset value: ");
				int offset = Integer.parseInt(scanner.nextLine());
				
				char[] encoded = CaesarCypher.encode(charArray, offset);
				System.out.println("Encoded message: " + new String(encoded));

				char[] decoded = CaesarCypher.decode(encoded, offset);
				System.out.println("Decoded message: " + new String(decoded));
				
				System.out.println();
				System.out.print("Would you like to encode/decode again? Y/N ");
				
				String response = scanner.nextLine();
				
				
				if(response.equalsIgnoreCase("n")) {
					char[] goodbye = "Goodbye".toCharArray();
					char[] exitEncoded = CaesarCypher.encode(goodbye, offset);
					exit = true;
					
					System.out.print("Goodbye - "+ new String(exitEncoded) );
					break;
				}
				
					
			}
	    
	    }
	    }

