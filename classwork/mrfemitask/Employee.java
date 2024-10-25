 
public class Employee{

	

	public static int count = 0;
	private String firstName;
	private String lastName;
	private String employeeNumber;

	public Employee(String firstName, String lastName, String employeeNumber){

	this.firstName = firstName;
	this.lastName = lastName;
	this.employeeNumber = employeeNumber;
	++count;
	//System.out.printf("Employee Details %s %s %s employee count = %d%n", firstName, lastName, employeeNumber, count);

}

	public String getFirstName(){
	
		return firstName;

}


	public String getLastName(){

		return lastName;

}

	public String getEmployeeNumber(){

		return employeeNumber;
}

	public int getCount(){
		return count;
}


	public static void main(String...args){
	System.out.printf("employee count %d", count);

	Employee employee1 = new Employee("smith", "joy" , "09010899287");
	Employee employee2 = new Employee("john", "mark", "08094567891");
	System.out.printf("first employee data %s %s %s %d", employee1.getFirstName(), employee1.getLastName(), employee1.getEmployeeNumber(), employee1.getCount());

System.out.printf("Second employee data %s %s %s %d", employee2.getFirstName(), employee2.getLastName(), employee2.getEmployeeNumber(), employee2.getCount());

}

}



	 