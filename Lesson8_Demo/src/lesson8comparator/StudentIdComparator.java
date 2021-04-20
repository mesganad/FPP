package lesson8comparator;



import java.util.Comparator;

// Sort the collection using id with help of Comparator interface
public class StudentIdComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		
		return Integer.compare(o1.getId(), o2.getId());
	}

}
