/**
 * 
 */

/**
 * @author hayde
 *
 */
	/**
	 * @param args
	 */

// abstract class created for person

public abstract class Person {
		protected String firstName;
		protected String lastName;
		protected int dayOfBirth;
		protected int monthOfBirth;
		protected int yearOfBirth;

		public Person(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.dayOfBirth = dayOfBirth;
			this.monthOfBirth = monthOfBirth;
			this.yearOfBirth = yearOfBirth;

		}
		// abstract methods
		public abstract void getPersonInfo();
	}











