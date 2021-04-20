package Problem3;

public final class Rectangle {
	private double length;
	private double width;

	public Rectangle(double height, double width) {
		this.length = height;
		this.width = width;
	}

	public double getHeight() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double computeArea() {
		double areaR = this.width * this.length;
		return areaR;
	}
}
