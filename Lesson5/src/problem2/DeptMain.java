package problem2;

import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		// The string type of date will be parsed into LocalDate format at the super
		// class
		Scanner sc = new Scanner(System.in);
		Professor pro1 = new Professor("Misgan", 30000, 5, 2020, 11, 10);
		Professor pro2 = new Professor("Asmamaw", 50000, 10, 2015, 11, 11);
		Professor pro3 = new Professor("Misgan", 30000, 5, 2010, 11, 11);

		Secretary sec1 = new Secretary("Selam", 10000, 30, 2020, 11, 11);
		Professor sec2 = new Professor("Bethel", 30000, 50, 2011, 11, 11);

		DeptEmployee[] dept = new DeptEmployee[5];
		dept[0] = pro1;
		dept[1] = pro2;
		dept[2] = pro3;
		dept[3] = sec1;
		dept[4] = sec2;
		System.out.println("Type 'Y' if you wish to see salary sum of the department:");
		double sum = 0.0;
		String input = sc.nextLine();
		if (input.equals("y") || input.equals("Y")) {

			for (DeptEmployee e : dept) {
				sum = sum + e.computeSalary();
			}
			System.out.println("Salary sum of all professors and secretaries is:" + sum);
		}

	}

}
