package problem1;

import java.util.InputMismatchException;
import java.lang.UnsupportedOperationException;
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
		System.out.println("Enter score between 0 and 100: ");
		int score=sc.nextInt();
		if(score<0||score>100) {
			throw new UnsupportedOperationException();
		}
		System.out.println("Your score is: "+score);
		

		}
		catch(InputMismatchException ex) {
			System.out.println("You provided wrong input.Please enter integer value!");
		}
		
		finally {
			sc.close();
		}
		System.out.println(" Resumes the rest of the program after exception caught!");
	}

}
