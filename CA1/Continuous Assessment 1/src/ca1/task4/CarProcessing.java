package ca1.task4;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import ca1.task4.Car;

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
	// https://javarevisited.blogspot.com/2015/06/3-ways-to-find-duplicate-elements-in-array-java.html#:~:text=The%20standard%20way%20to%20find,property%20to%20filter%20duplicate%20elements.
	
	
	public Car[] removeDuplicates(Car[] inputArray) {

		int carCount = 0;
	    for (int i = 0; i < inputArray.length; i++) {
	        boolean isDuplicate = false;
	        for (int j = i + 1; j < inputArray.length; j++) {
	            if (inputArray[i].equals(inputArray[j])) {
	                isDuplicate = true;
	                break;
	            }
	        }
	        if (!isDuplicate) {
	        	carCount++;
	        }
	    }
	    
	        

	
	}
	
}
