/**
 * 
 */

/**
 * @author hayde
 *
 */
// extend person to employee with interface
public class Bird extends Pet implements PetInterface{
	protected String featherColour;
	protected boolean canFly;
	protected boolean wild;
	protected boolean nativeToAustralia;

	/**
	 * 
	 */
	public Bird(String petName, String petDiet, boolean nocturnal, boolean mammal, 
			String featherColour, boolean canFly, boolean wild, boolean nativeToAustralia) {
		// TODO Auto-generated constructor stub
		
				super(petName, petDiet, nocturnal, mammal);
				this.featherColour = featherColour;
				this.canFly = canFly;
				this.wild = wild;
				this.nativeToAustralia = nativeToAustralia;
		
		
	}
	

	/**
	 * @param args
	 */

// method to show employee info
	public void getBirdInfo() {
		System.out.println("Bird Name: " + petName +" is a "+featherColour+" bird who eats a "+petDiet+" diet.");
		System.out.println("Nocturnal: " + nocturnal+" \tMammal: "+mammal);
		System.out.println("Can "+petName+" fly? " + canFly);
		System.out.println("Is the bird wild? " + wild);
		System.out.println("Is the bird native to Australia " + nativeToAustralia);
		System.out.println("");
	}
			
@Override
	public void getPetInfo() {
		// TODO Auto-generated method stub
		
	}
 public static void main(String[] args) {
		
        Bird owl = new Bird("sinter", "mice, small rodents", true,false, "snow white", true, true, true);
        owl.getBirdInfo();
    
 
        Bird incanMinor = new Bird("pesky minor", "berries and other", true,false, "black with yellow beak", true, true, false);
        incanMinor.getBirdInfo();
		}


@Override
public void getPeInfo() {
	// TODO Auto-generated method stub
	
}	


}



