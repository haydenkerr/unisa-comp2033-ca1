package ca1.task4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author hayde
 * 
 *  <p>
 *  </p>
 * @param make the amount of incoming damage
 * @param model the amount of incoming damage
 * @param colour the amount of incoming damage
 * @return toString of the object
 * @since 1.0
 * 
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

