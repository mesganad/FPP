package problem3;

public class Driver {

	public static void main(String[] args) {

		Figure[] fig = { new UpwardHat(), new UpwardHat(), new DownwardHat(), new FaceMaker(), new Vertical() };
		for (Figure figure : fig) {
			figure.getFigure();
		}

		for (Figure f : fig) {
			System.out.print("\n" + f.getClass().getSimpleName() + ":");
			f.getFigure();

		}

	}
}
