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
		
		Car[] noDuplicates = cp.removeDuplicates(cars);
		
		for(Car c : noDuplicates ) {
			System.out.println(c);
		}
	}
	// https://javarevisited.blogspot.com/2015/06/3-ways-to-find-duplicate-elements-in-array-java.html#:~:text=The%20standard%20way%20to%20find,property%20to%20filter%20duplicate%20elements.
	
	
	public Car[] removeDuplicates(Car[] inputArray) {
		
	      System.out.println("Duplicate elements from array using HashSet data structure");
	      Set<Car> set = new HashSet<>();

	      for (Car car : cars) {
	            if (set.equals() == false) {
	                System.out.println("found a duplicate element in array : "
	                        + name);
	            }
	        }

		return null;
	}
	
}
