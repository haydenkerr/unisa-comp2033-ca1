/**
 * 
 */
package ca1.task3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ca1.task3.ArrayCount;
/**
 * <p>Task 3: “Count Occurances in Array”
 * @see <a href="https://uo.unisa.edu.au/course/view.php?id=2945&section=12">Continual Assessment 1!</a>
 * 	<p>File: ArrayCount_Test.java</p>
 * 	<p>Author: Hayden Kerr</p>
 *  <p>Email Id: kerhy006@mymail.unisa.edu.au</p>
 *  <p>COMP2033 - Applied Data Structures</p>
 *  <p>This is my own work as defined by the University's Academic Misconduct policy.</p>
 *  <p>04/04/2023</p>
*/




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


