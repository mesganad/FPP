package Problem3;

public final class Triangle {
	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double computeArea() {
		double areaT = (this.base * this.height) / 2;
		return areaT;
	}

}
