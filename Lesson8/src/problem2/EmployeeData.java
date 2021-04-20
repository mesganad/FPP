package problem2;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeData {
	public static List<Statistics> combine(List<Staff> staff, List<Teacher> teachers) {
		List<Statistics> combinedList = new ArrayList<>();
		combinedList.addAll(0, staff);
		combinedList.addAll(teachers);
		return combinedList;
	}
}
