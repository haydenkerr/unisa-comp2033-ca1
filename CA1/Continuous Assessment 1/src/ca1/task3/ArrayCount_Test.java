/**
 * 
 */
package ca1.task3;

/**
 * @author hayde
 *
 */


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ca1.task3.ArrayCount;

class ArrayCount_Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCountOne() {
		ArrayCount ac = new ArrayCount();
		
		String[] inputString = {"apple", "banana", "orange", "pineapple", "fruit"};
	
		String inputTarget = "apple";
		
		int expected = 1;
		

		assertEquals(expected, ac.count(inputString, inputTarget), "The count does not work as expected.");
	}

	@Test
	void testCountTwo() {
		ArrayCount ac = new ArrayCount();
		
		String[] inputString = {"apple", "banana", "orange", "apple", "fruit"};
	
		String inputTarget = "apple";
		
		int expected = 2;
		
	
	
		assertEquals(expected, ac.count(inputString, inputTarget), "The count does not work as expected.");
	}
	@Test
	void testCountNone() {
		ArrayCount ac = new ArrayCount();
		
		String[] inputString = {"apple", "banana", "orange", "apple", "fruit"};
	
		String inputTarget = "pineapple";
		
		int expected = 0;
		
	
	
		assertEquals(expected, ac.count(inputString, inputTarget), "The count does not work as expected.");
	}
	
}


