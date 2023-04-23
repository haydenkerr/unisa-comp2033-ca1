package ca1.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * <p>Task 1: “Caesar Cypher Test”
 * @see <a href="https://uo.unisa.edu.au/course/view.php?id=2945&section=12">CA1!</a><p>
 * <p> File: CaesarCypherTest.java</p>
 * @author hayden
 * <p>Author: Hayden Kerr</p>
 *  <p>Email Id: kerhy006@mymail.unisa.edu.au</p>
 *  <p>COMP2033 - Applied Data Structures</p>
 *  <p>This is my own work as defined by the University's Academic Misconduct policy.</p>
 *  <p>04/04/2023</p>
 * @since 1.0
 */
class CaesarCypherTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testEncode() {
		CaesarCypher cc = new CaesarCypher();
		
		char[] input = {'a', 'b', 'c'};
		char[] expected = {'c', 'd', 'e'};
		
		assertArrayEquals(expected, cc.encode(input, 2), "The encoding method does not work as expected.");
	}

	@Test
	void testDecode() {
		CaesarCypher cc = new CaesarCypher();
		
	
		char[] input = {'c', 'd', 'e'};
		char[] expected = {'a', 'b', 'c'};
		
		assertArrayEquals(expected, cc.decode(input, 2), "The decoding method does not work as expected.");
	}
}
