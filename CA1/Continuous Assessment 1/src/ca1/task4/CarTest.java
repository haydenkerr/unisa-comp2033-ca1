package ca1.task4;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
	void testCreateOject() {
		Car carTestOne_tesla = new Car("tesla", "Y", "Black");
//		Car carTestTwo_tesla = new Car("tesla", "Z", "Black");
//		Car carTestThree_honda = new Car("honda", "Y", "Black");	
	
		
		int expectedCount = 1;
		

		assertEquals(expectedCount, carTestOne_tesla, "The count does not work as expected.");
	}

//	@Test
//	void testDuplicateTwo() {
//	CarProcessing cp = new CarProcessing();
//	
//	
//	Car[] cars = { 
//			new Car("Honda", "Civic", "Red"),
//			new Car("Holden", "Civic", "Red"),
//			new Car("Holden", "Rodeo", "Red")
//
//	};
//	
//	Car[] noDuplicatesObj = cp.removeDuplicates(cars);
//	
//
//	
//	int expectedCount = 2;
//	
//
//	assertEquals(expectedCount, noDuplicatesObj.length, "The count does not work as expected.");
//}
//
//	@Test
//	void testDuplicateThree() {
//	CarProcessing cp = new CarProcessing();
//	
//	
//	Car[] cars = { 
//			new Car("Honda", "Civic", "Red"),
//			new Car("Tesla", "Y", "Red"),
//			new Car("Holden", "Rodeo", "Red")
//
//	};
//	
//	Car[] noDuplicatesObj = cp.removeDuplicates(cars);
////	for(int i =0; i<noDuplicatesObj.length; i++) //test to view the put. 
////		System.out.println(noDuplicatesObj[i]);
//
//	
//	int expectedCount = 3;
//	
//
//	assertEquals(expectedCount, noDuplicatesObj.length, "The count does not work as expected.");
//	
//}
//	 public static void main(String[] args) {
//	// add in tests to confirm and test variations
//		
//		System.out.println(carTestOne_tesla.toString());
//		System.out.println(honda.toString());
//		System.out.print("equals to: ");
//		System.out.println(tesla.equals(tesla2));
//		
//		System.out.println(tesla.hashCode());
//		System.out.println(tesla2.hashCode());
//		System.out.println(honda.hashCode());
//		
//	 }


}

	// 

