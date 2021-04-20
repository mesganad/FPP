package problem2;

public final class Staff extends Statistics {

	private int numDependants;

	public Staff(String name, double salary, int numDependants) {
		super(name, salary);
		this.numDependants = numDependants;
	}

	public double getSalary() {
		return super.getSalary();
	}

	public int getNumDependants() {
		return numDependants;
	}

	@Override
	public String toString() {
		return "Staff [numDependants=" + numDependants + ", getSalary()=" + getSalary() + ", getName()=" + getName()
				+ "]";
	}

}
