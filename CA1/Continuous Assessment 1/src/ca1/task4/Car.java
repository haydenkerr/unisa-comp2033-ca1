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
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public void noDuplicates() {}
}
