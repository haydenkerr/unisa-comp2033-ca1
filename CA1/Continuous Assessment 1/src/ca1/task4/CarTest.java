package ca1.task4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * <p>Task 4: “Car - Remove Duplicates”
 * <a href="https://uo.unisa.edu.au/course/view.php?id=2945&section=12">CA1!</a><p>
 *  File: CarTest.java
 *  Author: Hayden Kerr
 *  Email Id: kerhy006@mymail.unisa.edu.au
 *  COMP2033 - Applied Data Structures
 *  This is my own work as defined by the University's
 *  Academic Misconduct policy.
 *  06/04/2023
 * @since 1.0
 */

public class CarTest {


	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testObjectString() {
		Car carTestOne_tesla = new Car("tesla", "Y", "Black");

		
		String expectedString = "tesla, Y, Black";
		
	
		assertEquals(expectedString, carTestOne_tesla.toString(), "The method does not work as expected." );
	}

	@Test
	void testObjectEquals() {
		Car carTestOne_tesla = new Car("tesla", "Y", "Black");
		Car carTestTwo_honda = new Car("honda", "Y", "Black");

		System.out.println(carTestOne_tesla.equals(carTestTwo_honda));
			
	
		assertTrue(carTestOne_tesla.equals(carTestTwo_honda), "The method does not work as expected." );
	}

}

	// 

