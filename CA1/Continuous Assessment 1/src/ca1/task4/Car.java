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

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(make, color, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Car))
			return false;
		Car other = (Car) obj;
		return Objects.equals(make, other.make) && Objects.equals(model, other.model)  
				&& Objects.equals(color, other.color);
	}
	

    
}
