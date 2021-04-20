package problem1;

import java.util.*;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> map1 = new HashMap<>();
		Key key = null;
		if (students == null)
		   return null;
			Iterator<Student> it = students.iterator();
			while (it.hasNext()) {
				Student st = it.next();
				String fn = st.getFirstName();
				String ln = st.getLastName();
				key = new Key(fn, ln);
				map1.put(key, st);
			}
			return map1;
		}
		

	

	public static double computeAverageGPA(HashMap<Key, Student> maps) {

		double cum = 0.0;
		int count = 0;
		for (Map.Entry<Key, Student> m : maps.entrySet()) {
			cum += m.getValue().getGpa();
			count++;
		}

		return cum / count;

	}

}
