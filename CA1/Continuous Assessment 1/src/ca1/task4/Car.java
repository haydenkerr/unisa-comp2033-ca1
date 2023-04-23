package ca1.task4;

import java.util.Objects;

/**
 * <p>Task 4: “Remove duplicate object from array”
 * <a href="https://uo.unisa.edu.au/course/view.php?id=2945&section=12">CA1!</a><p>
 * File: Car.java
 *  Author: Hayden Kerr
 *  Email Id: kerhy006@mymail.unisa.edu.au
 *  COMP2033 - Applied Data Structures
 *  This is my own work as defined by the University's
 *  Academic Misconduct policy.
 *  06/04/2023
 * @since 1.0
 */
public class Car {
	private String make;
	private String model;
	private String color;
	
	/**
	 * 
	 * @param make the brand or make of the car
	 * @param model the model of the branded car
	 * @param colour the color of the car
	 */
	public Car(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}
	
	// create setters / getters for the car class objects
	
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
	/** over ride the default eclipse source created hashcode. limiting the hashcode 
	* to only be based on model / colour
	* ie have the equals and hashcode data fields the same as to not violate the java 
	* contract for hashcode 
	* if obj1.equals(obj2) is true, then obj1.hashCode() == obj2.hashCode(). 
	*/
	public int hashCode() {
		return Objects.hash(model, color );
	}

	@Override
	// Two cars are equal if they have the same model and color, regardless of make.
	// over ride of the default equals method 
	public boolean equals(Object obj) {
		if (this == obj) // test if same object
			return true;
		if (!(obj instanceof Car)) // test if the object is not of car class
			return false;
		
		Car other = (Car) obj;
		return Objects.equals(model, other.model) && Objects.equals(color, other.color);
	}   
}

