package exceptiondemo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Throwsdemo {
   // Unchecked Exception handled using try-catch, checked exception handled using throws
	public static void main(String[] args) throws IOException{// Checked Exception
	try{
			int a,b;
           BufferedReader in = new BufferedReader(new
            InputStreamReader(System.in));
           Scanner inp = new Scanner(System.in);
            System.out.println("Enter A :" );
         // throw NumberFormatException during the parsing, if you give other that int value
			a = Integer.parseInt(in.readLine());
			// throw InputMismatchException, if you give other than int value
			System.out.println("Enter B :" ); 
			b = inp.nextInt();
			System.out.println("Result : " + (a+b));
		}
		catch(NumberFormatException | InputMismatchException ex){ // Unchecked Exception
			System.out.println(ex);
			System.out.println(ex.getMessage() + " is not a numeric value.");
					}
	}
}

