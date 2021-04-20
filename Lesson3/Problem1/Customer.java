package Problem1;

public class Customer {
	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address billingAddress;
	private Address shippingAddress;

	public Customer(String fisrtName, String lastName, String socSecurityNum) {
		this.firstName = fisrtName;
		this.lastName = lastName;
		this.socSecurityNum = socSecurityNum;
	}

	public String getFisrtName() {
		return firstName;
	}

	public void setFisrtName(String fisrtName) {
		this.firstName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocSecurityNum() {
		return socSecurityNum;
	}

	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Address getShippingAddress() {

		return shippingAddress;
	}

	public String toString() {

		return "[" + firstName + "," + lastName + "," + "ssn:" + socSecurityNum + "]";
	}
}
