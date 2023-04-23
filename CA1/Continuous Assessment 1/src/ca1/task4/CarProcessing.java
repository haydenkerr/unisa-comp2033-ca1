package ca1.task4;

/**
 * @author hayden
 * <p>“Task 4: “Remove duplicate object from array””
 * @see <a href="https://uo.unisa.edu.au/course/view.php?id=2945&section=12">Continual Assessment 1!</a>
 * 	<p>File: CarProcessing.java</p>
 *  <p>Author: Hayden Kerr</p>
 *  <p>Email Id: kerhy006@mymail.unisa.edu.au</p>
 *  <p>COMP2033 - Applied Data Structures</p>
 *  <p>This is my own work as defined by the University's Academic Misconduct policy.</p>
 *  <p>04/04/2023</p>
*/
public class CarProcessing {
	public static void main(String[] args) {
		
		CarProcessing cp = new CarProcessing();
		
		Car[] cars = { 
				new Car("Honda", "Civic", "Red"),
				new Car("Holden", "Civic", "Red"),
				new Car("Jeep", "Wrangler", "Blue"),
				new Car("Jeep", "Wrangler", "Green"),
				new Car("Holden", "Falcon", "Yellow"),
				new Car("Honda", "Civic", "Blue"),
				new Car("Honda", "Falcon", "Blue"),
				new Car("Honda", "Civic", "Purple")
		};
		
		Car[] noDuplicatesObj = cp.removeDuplicates(cars);
		
		for(Car c : noDuplicatesObj ) {
			System.out.println(c);
		}
	}
	/**
	 * 	
	 * @param inputArray
	 * @return singleCars - Array of unique non duplicate entries
	 */
	public Car[] removeDuplicates(Car[] inputArray) {

		// go through loop to identify and count distinct cars
		int distinctCar = 0;
	    for (int i = 0; i < inputArray.length; i++) {
	        boolean isDuplicate = false;
	        for (int j = i + 1; j < inputArray.length; j++) {
	            if (inputArray[i].equals(inputArray[j])) {
	                isDuplicate = true; // if one is equals, from car class, then duplicate
	                break;
	            }
	        }
	        if (!isDuplicate) {
	        	distinctCar++; // if not duplicate, then increment distinctCar
	        }
	    }
	    
	    Car[] singleCars = new Car[distinctCar]; // creates a new Car Array length of distinct cars found
	    int currentIndex = 0;
	    for (int i = 0; i < inputArray.length; i++) {
	        boolean isDuplicate = false;
	        // secondary loop and check for duplicate entries
	        for (int j = i + 1; j < inputArray.length; j++) {
	            if (inputArray[i].equals(inputArray[j])) {
	                isDuplicate = true;
	                break;
	            }
	        }
	        if (!isDuplicate) {// if no duplicate, then add from the distinctCar array to the new singleCars object to return.
	        	singleCars[currentIndex++] = inputArray[i];
	        }
	    }
	    return singleCars;
	
	}
	
}
