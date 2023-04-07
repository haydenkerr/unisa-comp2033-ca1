/**
 * 
 */
package ca1.task3;

/**
 * @author hayde
 *
 */


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayCount_Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testEncode() {
		ArrayCount ac = new ArrayCount();
		
		char[] input = {'a', 'b', 'c'};
		char[] expected = {'c', 'd', 'e'};
		
		assertArrayEquals(expected, ac.encode(input, 2), "The encoding method does not work as expected.");
	}

	@Test
	void testDecode() {
		ArrayCount ac = new ArrayCount();
		
	
		char[] input = {'c', 'd', 'e'};
		char[] expected = {'a', 'b', 'c'};
		
		assertArrayEquals(expected, ac.decode(input, 2), "The decoding method does not work as expected.");
	}
}

}
