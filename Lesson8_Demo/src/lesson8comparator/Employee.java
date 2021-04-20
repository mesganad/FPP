package lesson8comparator;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee {
	// instance fields
	private String name;
	private int age;
	private Date hireDay;

	// constructor
	Employee(String aName,int age, int aYear,
			int aMonth, int aDay) {
		name = aName;
		this.age=age;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
	}

	// instance methods
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	// needs to be improved!!
	public Date getHireDay() {
		return (Date)hireDay.clone();
	}
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee e = (Employee)ob;
		return e.name.equals(name) && (e.age==this.age) && e.hireDay.equals(hireDay);
	}
	
	/*
	 * public int hashCode() { return Objects.hash(name,age,hireDay); }
	 */
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Bob", 30,2000, 10, 2);
		Employee e2 = new Employee("Bob", 31,2000, 10, 2);
		String n = e1.getName();
		System.out.println(e1.equals(e2));
		System.out.println(n);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
