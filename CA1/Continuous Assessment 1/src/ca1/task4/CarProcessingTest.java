package ca1.task4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author hayde
 */



public class CarProcessingTest {


	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testDuplicateOne() {
		CarProcessing cp = new CarProcessing();
	
		
		Car[] cars = { 
				new Car("Honda", "Civic", "Red"),
				new Car("Holden", "Civic", "Red"),
	
		};
		
		Car[] noDuplicatesObj = cp.removeDuplicates(cars);
		
	
		
		int expectedCount = 1;
		

		assertEquals(expectedCount, noDuplicatesObj.length, "The count does not work as expected.");
	}

	@Test
	void testDuplicateTwo() {
	CarProcessing cp = new CarProcessing();
	
	
	Car[] cars = { 
			new Car("Honda", "Civic", "Red"),
			new Car("Holden", "Civic", "Red"),
			new Car("Holden", "Rodeo", "Red")

	};
	
	Car[] noDuplicatesObj = cp.removeDuplicates(cars);
	

	
	int expectedCount = 2;
	

	assertEquals(expectedCount, noDuplicatesObj.length, "The count does not work as expected.");
}

	@Test
	void testDuplicateThree() {
	CarProcessing cp = new CarProcessing();
	
	
	Car[] cars = { 
			new Car("Honda", "Civic", "Red"),
			new Car("Tesla", "Y", "Red"),
			new Car("Holden", "Rodeo", "Red")

	};
	
	Car[] noDuplicatesObj = cp.removeDuplicates(cars);
//	for(int i =0; i<noDuplicatesObj.length; i++) //test to view the put. 
//		System.out.println(noDuplicatesObj[i]);

	
	int expectedCount = 3;
	

	assertEquals(expectedCount, noDuplicatesObj.length, "The count does not work as expected.");
	
}
}

	// 

