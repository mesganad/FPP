package Problem3;

public final class Circle {
private static final double PI = 3.14;
private double radius;

public Circle(double radius) {
	this.radius = radius;
}

public double getRadius() {
	return radius;
}
public double computeArea() {
	double areaC=PI*this.radius*this.radius;
	return areaC;
}

}
