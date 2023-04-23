package ca1.task4;



import java.util.Objects;



/**
 * <p>Task 4: “Remove duplicate object from array”
 * <a href="https://uo.unisa.edu.au/course/view.php?id=2945&section=12">CA1!</a>
 * This task requires you to implement the equals() and hashCode() methods in the Car class. 
 * Two cars are equal if they have the same model and colour, regardless of make.
	
 * Implement the ‘toString()’ method of the Car class. 
 * The toString() should return a string representation of a Car. 
 * The format should be “<Make>, <Model>, <Color>”.   
 * Implement the ‘removeDuplicates’ method in the CarProcessing class. 
 * Your method should remove duplicates from the given array using the Car equals() method. 
 * Write unit tests for both the Car and the CarProcessing class. 

 * </p>
 * @param make the amount of incoming damage
 * @param model the amount of incoming damage
 * @param colour the amount of incoming damage
 * @return toString of the object
 * @since 1.0
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
	*  to only be based on model / colour
	* ie have the equals and hashcode data fields the same as to not violate the java 
	* contract for hashcode 
	* if obj1.equals(obj2) is true, then obj1.hashCode() == obj2.hashCode(). 
	*/
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
	



    
}

