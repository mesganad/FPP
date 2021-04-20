package problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Marketing {
	String empName;
	String prodName;
	double salesAmount;

	public Marketing(String empName, String prodName, double salesAmount) {
		this.empName = empName;
		this.prodName = prodName;
		this.salesAmount = salesAmount;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
	}

	@Override
	public String toString() {
		return "(" + empName + "," + prodName + "," + salesAmount + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.empName, this.prodName, this.salesAmount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marketing other = (Marketing) obj;
		return (empName.equals(other.empName) && prodName.equals(other.prodName) && salesAmount == other.salesAmount);
	}
	
	public static List<Marketing> listMoreThan1000(List<Marketing> list1){
		List<Marketing> newList=new ArrayList<>();
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i).salesAmount>1000) {
				newList.add(list1.get(i));
			}
		}
		return newList;
		
		}

	
}
