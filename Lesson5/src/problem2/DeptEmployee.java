package problem2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DeptEmployee {

	String name;
	LocalDate hiredate;
	double salary;
    
	public DeptEmployee(String name, double salary, int year, int month,int day) {
		this.name=name;
		LocalDate date = LocalDate.of(year, month, day);
		//LocalDate date = LocalDate.parse(hireD);
		this.hiredate=date;
		this.salary=salary;
		
	}
	
	
	

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDate() {
		return hiredate;
		
	}

	public void setHireDate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	
	public double computeSalary() {
		return this.salary;
	}

}
