package problem1;

public class Shape {
	String color;

	public Shape(String color) {
		this.color = color;
	}

	public double calculateArea() {
		return 0.0;
	}

	public double calculatePerimeter() {
		return 0.0;
	}

	public static void printTotal(Shape[] sh) {
		double totalP = 0.0;
		double totalA = 0.0;
		for (Shape s : sh) {

			totalA += s.calculateArea();
			totalP += s.calculatePerimeter();
		}
		System.out.println("Total area of the shapes is: " + totalA + "\nTotal perimeter of the shapes is: " + totalP);
	}

}
