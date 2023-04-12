/**
 * 
 */

/**
 * @author hayde
 *
 */
public abstract class Pet {
		protected String petName;
		protected String petDiet;
		protected boolean nocturnal;
		protected boolean mammal;

		public Pet(String petName, String petDiet, boolean nocturnal, boolean mammal) {
			this.petName = petName;
			this.petDiet = petDiet;
			this.nocturnal = nocturnal;
			this.mammal = mammal;
		

		}
		// abstract methods
		public abstract void getPetInfo();
	}


