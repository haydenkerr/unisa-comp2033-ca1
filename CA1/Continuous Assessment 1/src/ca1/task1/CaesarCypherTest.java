package ca1.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaesarCypherTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testEncode() {
		ArrayCount cc = new ArrayCount();
		
		char[] input = {'a', 'b', 'c'};
		char[] expected = {'c', 'd', 'e'};
		
		assertArrayEquals(expected, cc.encode(input, 2), "The encoding method does not work as expected.");
	}

	@Test
	void testDecode() {
		ArrayCount cc = new ArrayCount();
		
	
		char[] input = {'c', 'd', 'e'};
		char[] expected = {'a', 'b', 'c'};
		
		assertArrayEquals(expected, cc.decode(input, 2), "The decoding method does not work as expected.");
	}
}
