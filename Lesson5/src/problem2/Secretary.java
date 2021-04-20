package problem2;

public class Secretary extends DeptEmployee {
	
	private double overtimeHours;

	public Secretary(String name,double salary, double overtimeHours, int year, int month, int day) {
		super(name, salary,year,month,day);
		this.overtimeHours=overtimeHours;
	}
	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
  
	@Override
	public double computeSalary() {
		return super.salary+(12* this.overtimeHours);
	}

}
