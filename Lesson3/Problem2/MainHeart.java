package Problem2;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class MainHeart {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate da=null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter your first name:");
		String fname = scanner.nextLine();
		System.out.println("Please, enter your lastname name:");
		String lname = scanner.nextLine();
		System.out.println("Please enter your birthday in yyyy-MM-dd (e.g 1990-09-18):");
		String input = scanner.nextLine();
		try {
			da = LocalDate.parse(input, formatter);
		} catch (DateTimeParseException e) {
			System.out.println("Error! Please try again");
		}
		HeartRate hr = new HeartRate("Misgan", "Asmamaw", da);
		hr.setFirstName(fname);
		hr.setLastName(lname);
		hr.setDob(da);

		System.out.println(hr.toString());

	}

}
