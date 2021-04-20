package lesson8comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {
	public static void main(String[] args) {
		new EmployeeSort();
	}

	public EmployeeSort() {
		Employee[] empArray = { new Employee("George",30, 2011, 11, 5),
				new Employee("Dave", 30,2000, 2, 7),
				new Employee("Richard",29, 2001, 2, 7) };
		List<Employee> empList = Arrays.asList(empArray);
		Comparator<Employee> nameComp = new NameComparator1();
		Collections.sort(empList, nameComp);
		System.out.println(empList.toString());
	}
}
