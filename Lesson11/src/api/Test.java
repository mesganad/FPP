package api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		List<Emp> list = new ArrayList<>();
		list.add(new Emp("Misgan", "xyz", "3453", 5000));
		list.add(new Emp("Merhawit", "abc", "34531", 6000));
		list.add(new Emp("Makesense", "onlineGuys", "3455", 8000));

		System.out.println(list);

		HashMap<String, Emp> hmap = convert(list);

		System.out.println(hmap);

		namesMoreThan1000(hmap);

	}

	public static HashMap<String, Emp> convert(List<Emp> l) {

		HashMap<String, Emp> map = new HashMap<>();

		Iterator<Emp> it = l.iterator();
		while (it.hasNext()) {
			Emp emp1 = it.next();
			String ssn = emp1.getSsn();
			map.put(ssn, emp1);

		}
		return map;

	}

	public static void namesMoreThan1000(HashMap<String, Emp> map) {
		List<String> nameList = new ArrayList<>();
		map.forEach((key, value) -> {
			if (value.getSalary() > 5000) {
				nameList.add(value.getFirstName());
			}
		});
		System.out.println(nameList);
	}
}
