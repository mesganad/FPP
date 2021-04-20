package api;

public class Emp {
	private String firstName;
	private String lastName;
	private String ssn;
	private double salary;
	public Emp(String firstName, String lastName, String ssn, double salary) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + ", salary=" + salary + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSsn() {
		return ssn;
	}
	public double getSalary() {
		return salary;
	}
	

}
