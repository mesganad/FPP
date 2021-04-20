package problem2;

import java.util.*;
public  class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	private String name;
	private double salary;
	
	public Statistics(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public static double computeSumOfSalaries(List<Statistics> aList) {
		double sum=0.0;
		for(int i=0;i<aList.size();i++) {
			sum+=aList.get(i).getSalary();
		}
		return sum;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Statistics [name=" + name + ", salary=" + salary + "]";
	}
	
}
