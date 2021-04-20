package Problem3;

import java.util.Scanner;

public class MainArea {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter C for circle, R for rectangle, T for triangle: ");
		String input = scanner.next();
		//The input is case insensitive
		switch (input) {
		case "R":
		case "r":
			System.out.println("Enter the width of the rectangle: ");
			double w = scanner.nextDouble();
			System.out.println("Enter the length of the rectangle: ");
			double l = scanner.nextDouble();
			Rectangle r = new Rectangle(l, w);
			System.out.println("The area of the rectangle is: " + r.computeArea());
			break;

		case "T":
		case "t":
			System.out.println("Enter the height of the triangle: ");
			double h = scanner.nextDouble();
			System.out.println("Enter the base of the triangle: ");
			double b = scanner.nextDouble();
			Triangle t = new Triangle(b, h);
			System.out.println("The area of the rectangle is: " + t.computeArea());
			break;
		case "C":
		case "c":
			System.out.println("Enter the radius the circle: ");
			double r1 = scanner.nextDouble();
			Circle c = new Circle(r1);
			System.out.println("The area of the circle is: " + c.computeArea());
			break;
		default:
			System.out.println("You entered incorrect input.Please try again!");
			break;

		}

	}

}
