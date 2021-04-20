package problem1;

public class Square extends Rectangle {

	public Square(String color, double side) {
		super(color, side, side);
		super.width=side;
		super.height=side;
	}
}
