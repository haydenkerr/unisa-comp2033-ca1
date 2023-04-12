/**
 * 
 */

/**
 * @author hayde
 *
 */
// extend person to employee with interface
public class Dog extends Pet implements PetInterface{
	protected String hairColour;
	protected String size;
	protected String type;
	protected boolean active;

	/**
	 * 
	 */
	public Dog(String petName, String petDiet, boolean nocturnal, boolean mammal, 
			String hairColour, String size, String type, boolean active) {
		// TODO Auto-generated constructor stub
		
				super(petName, petDiet, nocturnal, mammal);
				this.hairColour = hairColour;
				this.size = size;
				this.type = type;
				this.active = active;
		
		
	}
	

	/**
	 * @param args
	 */

// method to show employee info
	public void getDogInfo() {
		System.out.println("Dog Name: " + petName +" is a "+type+" who eats a "+petDiet+" diet.");
		System.out.println("Nocturnal: " + nocturnal+" \tMammal: "+mammal);
		System.out.println(petName+" is a " + size+" "+hairColour+" dog. ");
		System.out.println("Is the dog is  active? " + active);
		System.out.println("");
	}
			
@Override
	public void getPetInfo() {
		// TODO Auto-generated method stub
		
	}
 public static void main(String[] args) {
		
        Dog vizsla = new Dog("Huxley", "omnivore", false,true, "Russet", "Large", "Pointer, Gun dog", true);
        vizsla.getDogInfo();
    
 
		 Dog doberman = new Dog("Pincher", "omnivore", false,true, "black", "Large", "Pointer, Gun dog", true);
		 doberman.getDogInfo();
		}


@Override
public void getPeInfo() {
	// TODO Auto-generated method stub
	
}	


}



