package problem5;

public class MainComputer {

	public static void main(String[] args) {
		Computer c1 = new Computer("Dell", "Intel", 4, 2.4);
		Computer c2 = new Computer("Dell", "Intel", 4, 2.4);

		System.out.println("Object c1: \n=========\n" + c1 + "\nObject C2: \n=========\n" + c2);
		System.out.println("\nHashcode for c1: " + c1.hashCode());
		System.out.println("Hashcode for c2: " + c2.hashCode() + "\n=============================");

		if (c1.equals(c2)) {
			System.out.println("\nObjects c1 and c2 are equal");
		} else {
			System.out.println("\nObjects c1 and c2 are not equal");
		}

	}

}
