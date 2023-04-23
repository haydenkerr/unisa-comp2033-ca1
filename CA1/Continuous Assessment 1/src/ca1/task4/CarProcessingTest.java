package ca1.task4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * <p>Task 4: “Car - Remove Duplicates”
* @see <a href="https://uo.unisa.edu.au/course/view.php?id=2945&section=12">Continual Assessment 1!</a>
 * 	<p>File: CarProcessingTest.java</p>
 *  <p>Author: Hayden Kerr</p>
 *  <p>Email Id: kerhy006@mymail.unisa.edu.au</p>
 *  <p>COMP2033 - Applied Data Structures</p>
 *  <p>This is my own work as defined by the University's Academic Misconduct policy.</p>
 *  <p>04/04/2023</p>
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

