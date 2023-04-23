package ca1.task4;





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
