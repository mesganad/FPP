package exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * public class BalanceThrow { public static void main(String[] args) { int
 * balance = 100, withdraw = 1000; if (balance < withdraw) {
 * UnsupportedOperationException e = new
 * UnsupportedOperationException("No money, Sorry"); throw e; // throw new
 * UnsupportedOperationException("No money, Sorry"); } else
 * System.out.println("Draw Money & enjoy, Best wishes of the day");
 * System.out.println("Hava a Good Day"); }
 * 
 * }
 */
public class BalanceThrow{

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       try {
          System.out.println("Enter Integer Value: ");
          Integer inputInt = scanner.nextInt(); // input : "1.1"  
          System.out.println(inputInt);

       } 
       catch (InputMismatchException ex) {
          System.out.println("We have given input as float expecting integer "+ ex);
       }
 }
}