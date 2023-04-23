package ca1.task1;
import java.util.Scanner;

/**
 * 
 * <p>Task 1: “CaesarCypher”
 * @see <a href="https://uo.unisa.edu.au/course/view.php?id=2945&section=12">Continual Assessment 1!</a>
 *  <p>File: CaesarCypher.java</p>
 * @author hayden
 *  <p>Author: Hayden Kerr</p>
 *  <p>Email Id: kerhy006@mymail.unisa.edu.au</p>
 *  <p>COMP2033 - Applied Data Structures</p>
 *  <p>This is my own work as defined by the University's Academic Misconduct policy.</p>
 *  <p>04/04/2023</p>
 *
 */
public class CaesarCypher {

	/**
	 *  @param ALPHABET_LENGTH constant for alphabet length
	 */  
	   private static final int ALPHABET_LENGTH = 26;

	   
	   /**
	 * @param input - input is the string input
	 * @param offset - offset from the 
	 * @return encodedOutput - output of encryption user cypher
	 */
	public static char[] encode(char[] input, int offset) {
	        char[] encodedOutput = new char[input.length]; 
	        for (int i = 0; i < input.length; i++) {
	            char c = input[i];
	            if (Character.isLetter(c)) { //checks if array entry is a letter.
	                char startingLetter = Character.isUpperCase(c) ? 'A' : 'a'; // sets the base to good things
	                
	                // if c = 26(z)  
	                int encoded = ((c - startingLetter + offset) % ALPHABET_LENGTH + ALPHABET_LENGTH) % ALPHABET_LENGTH;// gets the encoded letter ID 
	            
	                encodedOutput[i] = (char) (startingLetter + encoded); // converts to character
	            } else {
	                encodedOutput[i] = c; // if not a alphabetic letter, then return. works for symbols, and numbers
	            }
	        }
	        return encodedOutput;
	    }
	
	  
	   /**
	 * @param input - input is the string input
	 * @param offset - offset from the 
	 * @return decodedOutput - output of decryption user cypher
	 */
	   public static char[] decode(char[] input, int offset) {
	        char[] decodedOutput = new char[input.length];
	        for (int i = 0; i < input.length; i++) {
	            char c = input[i];
	            if (Character.isLetter(c)) { //checks if array entry is a letter.
	                char startingLetter = Character.isUpperCase(c) ? 'A' : 'a'; // sets the base
	                int encoded = ((c - startingLetter - offset) % ALPHABET_LENGTH + ALPHABET_LENGTH) % ALPHABET_LENGTH; // gets the decoded letter ID 
	                decodedOutput[i] = (char) (startingLetter + encoded); // converts to character
	            } else {
	                decodedOutput[i] = c;
	            }
	        }
	        return decodedOutput;
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


			int inputOffset = 0;
			boolean validInput = false;
			while (!validInput) {
				System.out.print("Enter an offset value: ");
			    String offsetString = scanner.nextLine();
			    try {
			    	inputOffset = Integer.parseInt(offsetString);
			        validInput = true;
			    } catch (NumberFormatException e) {
			        System.out.println("Invalid input. Please enter an integer value.");
			    }
			}
			
			
			char[] encoded = CaesarCypher.encode(charArray, inputOffset);
			System.out.println("Encoded message: " + new String(encoded));

			char[] decoded = CaesarCypher.decode(encoded, inputOffset);
			System.out.println("Decoded message: " + new String(decoded));
			
			System.out.println();
			System.out.print("Would you like to encode/decode again? Y/N ");
			
			String response = scanner.nextLine();
			
			
			if(response.equalsIgnoreCase("n")) {
				char[] goodbye = "Goodbye".toCharArray();
				char[] exitEncoded = CaesarCypher.encode(goodbye, inputOffset);
				exit = true;
				
				System.out.print("Goodbye - "+ new String(exitEncoded) );
				break;
			}
				
					
			}
	    
	    }
	    }

