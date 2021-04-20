package problem2;

public class Professor extends DeptEmployee {
	private int numberOfPublications;

	public Professor(String name, double salary,int numberOfPublications,int year, int month, int day ) {
		super(name, salary, year,month,day);
		this.numberOfPublications=numberOfPublications;
	}
	
	public int getNumberOfPublications() {
		return this.numberOfPublications;
	}

	public void setNumberOfPublications(int num) {
		this.numberOfPublications = num;
	}
}
