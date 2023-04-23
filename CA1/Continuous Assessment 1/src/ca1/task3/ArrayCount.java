package ca1.task3;
import java.util.Scanner;


/**
 * <p>Task 3: “Count Occurrences in Array”
 * @see <a href="https://uo.unisa.edu.au/course/view.php?id=2945&section=12">CA1!</a><p>
 * 	<p>File: ArrayCount.java</p>
 * @author hayden
 * <p>Author: Hayden Kerr</p>
 *  <p>Email Id: kerhy006@mymail.unisa.edu.au</p>
 *  <p>COMP2033 - Applied Data Structures</p>
 *  <p>This is my own work as defined by the University's Academic Misconduct policy.</p>
 *  <p>04/04/2023</p>
*/

// class ArrayCount will see if target is in stringArray
public class ArrayCount {
	/**
	 * 
	 * @param stringArray
	 * @param target
	 * @return counted int - count of times target string exists in Array
	 */
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
	
	// create object of ArrayCount and request input from use
			 // use while loop to continual operation until exit requested
			 ArrayCount arrayCount = new ArrayCount(); 
			 while(exit) {
		    	Scanner scanner = new Scanner(System.in); 
		    		System.out.println("");
		    		System.out.print("Please enter the string: ");
		    		String inputArray=scanner.nextLine();
					
		    		String[] stringArray;
		    		
		    		// request the delimiter or separator between string words
		    		System.out.println("Please enter the delimiter: ");
		    		System.out.print("Just enter as  , or ,_ or _ ");
		    		
		    		String delimiter=scanner.nextLine();
		    		
		    		stringArray = inputArray.split( delimiter);
		    	
		    		// request target string
		    		System.out.print("Please enter the target: ");
		    		String target =scanner.nextLine();
					
					int counted = arrayCount.count(stringArray,target);
					
					System.out.print(target +" was found " + counted +" times.");
					System.out.println();
					
					System.out.print("Would you like to count again? Y/N ");
					
					String response = scanner.nextLine();
					
					
					if(response.equalsIgnoreCase("n")) {
						
						exit = true;
						
						System.out.print("Goodbye");
						break;
					}
					
				}
	
	
}
}
