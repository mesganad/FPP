package problem2;

import java.util.Scanner;

//Recursive program to search minimum character from the sting input
public class MinimumChar {

	public static char minChar(String str) {
		if (str == "" || str.length()==0) {
			return 0;
		} else if (str.length() == 1) {
			return str.charAt(0);
		}

		if (str.charAt(0) < minChar(str.substring(1))) {
			return str.charAt(0);
		} else {
			return minChar(str.substring(1));
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input1 = scanner.nextLine();
		System.out.println("The minimum character is: " + minChar(input1));

	}

}
