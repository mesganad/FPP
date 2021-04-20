package problem4;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
	Employee[] emp=new Employee[5];
	emp[0]=new CommissionEmployee("Misgan","Asmamaw","1122233",10000.0,20.0);
	emp[1]=new HourlyEmployee("Shmels","Asmamaw","1122834",1000.0,30.0);
	emp[2]=new SalariedEmployee("muller","Dargie","1127233",250.0);
	emp[3]=new BasePlusCommissionEmployee("Selam","Asmamaw","1123233",1000.0,20.0,2000.0);
	emp[4]=new BasePlusCommissionEmployee("abel","johon","1124233",500.0,20.0,400.0);
	
	//if uncommented, current state of objects would be displayed.
	//System.out.println(Arrays.toString(emp));
	
	double totalSalary=0.0;
	for(Employee e:emp) {
		    totalSalary=totalSalary+e.getPayment();
   
	}
	System.out.println("Salary sum of the employees is: "+totalSalary);
	
}
}
