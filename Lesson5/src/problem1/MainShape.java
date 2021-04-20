package problem1;

public class MainShape {

	public static void main(String[] args) {

		Shape[] obj = new Shape[5];

		Shape[] shapes = { new Rectangle("Green", 7.0, 10.0), new Circle("Yellow", 5.0), new Square("Red", 7.0) };
		obj=shapes; //Assigning identity
		Shape.printTotal(obj);

	}

}
