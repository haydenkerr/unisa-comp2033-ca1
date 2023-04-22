package ca1.task4;
/*
 * Task 4: “Remove duplicate object from array”

This task requires you to implement the equals() and hashCode() methods in the Car class. 
Two cars are equal if they have the same model and colour, regardless of make.

Implement the ‘toString()’ method of the Car class. 
The toString() should return a string representation of a Car. 
The format should be “<Make>, <Model>, <Color>”.   
Implement the ‘removeDuplicates’ method in the CarProcessing class. 
Your method should remove duplicates from the given array using the Car equals() method. 
Write unit tests for both the Car and the CarProcessing class. 

 */

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Car {
	private String make;
	private String model;
	private String color;
	
	public Car(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}
	
	// create getters for the car to be able to 
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}

	
	@Override
	public String toString() {
		return make + ", " + model + ", " + color;
	}

	@Override
	// over ride the default eclipse source created hashcode. limiting the hashcode 
	// to only be based on model / colour
	// ie have the equals and hashcode data fields the same as to not violate the java 
	// contract for hashcode 
	// if obj1.equals(obj2) is true, then obj1.hashCode() == obj2.hashCode(). 
	public int hashCode() {
		return Objects.hash(model, color );
	}

	@Override
	// Two cars are equal if they have the same model and colour, regardless of make.
	// over ride of the default equals method 
	public boolean equals(Object obj) {
		if (this == obj) // test if same object
			return true;
		if (!(obj instanceof Car)) // test if the object is not of car class
			return false;
		
		Car other = (Car) obj;
		return Objects.equals(model, other.model) && Objects.equals(color, other.color);
	}
	
	 public static void main(String[] args) {
	// add in tests to confirm and test variations
		 
		 Car tesla = new Car("tesla", "Y", "Black");
		Car tesla2 = new Car("tesla", "Z", "Black");
		Car honda = new Car("honda", "Y", "Black");
		
		System.out.println(tesla.toString());
		System.out.println(honda.toString());
		System.out.print("equals to: ");
		System.out.println(tesla.equals(tesla2));
		
		System.out.println(tesla.hashCode());
		System.out.println(tesla2.hashCode());
		System.out.println(honda.hashCode());
		
	 }


    
}

