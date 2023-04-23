package ca1.task4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * <p>Task 4: “Car - Remove Duplicates”
 * <a href="https://uo.unisa.edu.au/course/view.php?id=2945&section=12">CA1!</a><p>
 *  File: CarProcessingTest.java
 *  Author: Hayden Kerr
 *  Email Id: kerhy006@mymail.unisa.edu.au
 *  COMP2033 - Applied Data Structures
 *  This is my own work as defined by the University's
 *  Academic Misconduct policy.
 *  06/04/2023
 * @since 1.0
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

