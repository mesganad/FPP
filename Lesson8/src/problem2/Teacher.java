package problem2;

public final class Teacher extends Statistics {
	private double bonus;

	public Teacher(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	@Override
	public double getSalary() {
		return super.getSalary() + bonus;
	}

	public double getBonus() {
		return bonus;
	}

	@Override
	public String toString() {
		return "Teacher [bonus=" + bonus + ", getSalary()=" + getSalary() + ", getName()=" + getName() + "]";
	}

}
