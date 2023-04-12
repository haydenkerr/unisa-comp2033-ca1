/**
 * 
 */

/**
 * @author hayde
 *
 */
// extend person to employee with interface
public class Cat extends Pet implements PetInterface{
	protected String hairColour;
	protected boolean annoying;
	protected boolean meows;
	protected boolean isBetterThanDog;

	/**
	 * 
	 */
	public Cat(String petName, String petDiet, boolean nocturnal, boolean mammal, 
			String hairColour, boolean annoying, boolean meows, boolean isBetterThanDog) {
		// TODO Auto-generated constructor stub
		
				super(petName, petDiet, nocturnal, mammal);
				this.hairColour = hairColour;
				this.annoying = annoying;
				this.meows = meows;
				this.isBetterThanDog = isBetterThanDog;
		
		
	}
	

	/**
	 * @param args
	 */

// method to show employee info
	public void getCatInfo() {
		System.out.println("Cat Name: " + petName +" is a "+hairColour+" cat who eats a "+petDiet+" diet.");
		System.out.println("Nocturnal: " + nocturnal+" \tMammal: "+mammal);
		System.out.println("Does "+petName+" meow? " + meows);
		System.out.println("Is the cat is annoying? " + annoying);
		System.out.println("Is the cat is better than a dog? " + isBetterThanDog);
		System.out.println("");
	}
			
@Override
	public void getPetInfo() {
		// TODO Auto-generated method stub
		
	}
 public static void main(String[] args) {
		
        Cat curentCat = new Cat("sinter", "omnivore", false,true, "black", true, true, false);
        curentCat.getCatInfo();
    
 
		 Cat curentCat2 = new Cat("sinters replacement", "omnivore", false,true, "grey", true, true, false);
		 curentCat2.getCatInfo();
		}


@Override
public void getPeInfo() {
	// TODO Auto-generated method stub
	
}	


}



