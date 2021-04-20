package problem1;

public class Key {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		return firstName.equals(other.firstName) && (lastName.equals(other.lastName));

	}

	@Override
	public String toString() {
		return "[" + firstName + "," + lastName + "]";
	}
	

}
