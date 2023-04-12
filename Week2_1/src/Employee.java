	// extend person to employee with interface
		public class Employee extends Person implements PersonInterface {
			protected String taxFileNumber;
			protected String superNumber;
			protected String employeeID;
			protected String position;

			// employee constructor
			public Employee(String firstName, String lastName, int dayOfBirth, int monthOfBirth, 
					int yearOfBirth, String taxFileNumber, String superNumber, String employeeID, String position) {
				//
				super(firstName, lastName, dayOfBirth, monthOfBirth, yearOfBirth);
				this.taxFileNumber = taxFileNumber;
				this.superNumber = superNumber;
				this.employeeID = employeeID;
				this.position = position;
			}

			// method to show employee info
			public void getEmployeeInfo() {
				System.out.println("Name: " + firstName +" "+lastName);
				System.out.println("BirthDate: " + dayOfBirth+"-"+monthOfBirth+"-"+yearOfBirth);
				System.out.println("EmployeeID: " + employeeID+", Position: "+position);
				System.out.println("Super Number: " + superNumber+", TFN: "+taxFileNumber);
			}
					
		@Override
			public void getPersonInfo() {
				// TODO Auto-generated method stub
				
			}
		 public static void main(String[] args) {
				
		        Employee employee2 = new Employee("John", "Kerr", 8,11,1980, "TFN###", "Super##", "EmployeeID##", "positionTitle");
		        employee2.getEmployeeInfo();
		    }	

		
		}
	


