package problem1;

import java.util.Arrays;
import java.util.Scanner;

//Recursive program to merge two sorted strings
public class Merge {

	public static String mergeStrings(String s1, String s2) {
		if (s1 == "") {
			if (s2 == "") {
				return "";
			}
			return s2;
		} else if (s2 == "") {
			return s1;
		}
		if (s1.charAt(0) > s2.charAt(0)) {
			return s2.charAt(0) + mergeStrings(s1, s2.substring(1));
		} else {
			return s1.charAt(0) + mergeStrings(s1.substring(1), s2);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first string: ");
		String input1 = scanner.nextLine();
		char[] firstChars = input1.toCharArray();
		Arrays.sort(firstChars);
		String sortedString1 = new String(firstChars);

		System.out.println("Enter the second string: ");
		String input2 = scanner.nextLine();
		char[] secondChars = input2.toCharArray();
		Arrays.sort(secondChars);
		String sortedString2 = new String(secondChars);
		scanner.close();

		System.out.println("The merged string is: " + Merge.mergeStrings(sortedString1, sortedString2));

	}

}
