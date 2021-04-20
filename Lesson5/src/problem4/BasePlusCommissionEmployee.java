package problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
			double grossSales,double commissionRate,double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, commissionRate,grossSales);
		this.baseSalary=baseSalary;
		
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public double getPayment() {
		return this.baseSalary+(super.getGrossSales()*super.getCommissionRate()/100);
	}
	
}
