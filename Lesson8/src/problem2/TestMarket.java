package problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class TestMarket {
	SComparator sc;
	ECComparator ec;

	TestMarket() {
		sc = new SComparator();
		ec = new ECComparator();
	}

	public static void main(String[] args) {
		Marketing m1 = new Marketing("abel", "laptop", 1000);
		Marketing m2 = new Marketing("abebe", "car", 1000);
		Marketing m3 = new Marketing("misgan", "Tv", 1000);
		Marketing m4 = new Marketing("abel", "laptop", 1000);
		List<Marketing> mList = new ArrayList<>(Arrays.asList(m1, m2, m3, m4));
		mList.add(0, new Marketing("abel", "byce", 5000));
		mList.add(new Marketing("asmamaw", "agro", 6000));
		// mList.remove(0);
		// mList.remove(m3);
		// mList.add(m3);
		System.out.println(mList);
		System.out.println(mList.size());
		boolean res = mList.contains(m1);
		System.out.println(res);
		System.out.println(m1.equals(m4));

		List<String> l = new ArrayList<>();
		l.add("Misgan");
		l.add("Asmamaw");
		l.add("Dargie");
		Collections.sort(l);
		System.out.println(l);

		// compare using outside class
		SalesComparator s = new SalesComparator();
		Collections.sort(mList, s);
		System.out.println("After sorted:" + mList);

		// compare from inside class
		TestMarket tm = new TestMarket();
		Collections.sort(mList, tm.sc);
		// System.out.println("After sorting from inside class: "+mList);

		// using anonymous class
		Collections.sort(mList, new Comparator<Marketing>() {

			@Override
			public int compare(Marketing o1, Marketing o2) {
				return Double.compare(o1.salesAmount, o2.salesAmount);
			}

		});

		// using lambda expression, sorting based on empName
		Collections.sort(mList, (o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName()));
		System.out.println("after sorting with name wise using lambda:" + mList);

		// consistent with equal using inside class
		int res1 = tm.ec.compare(m1, m4);
		System.out.println(res1);

		// List of employees whose salesamount is more than 1000
		System.out.println("Employees with salesamount more than $1000:" + Marketing.listMoreThan1000(mList));

	}

	public class SComparator implements Comparator<Marketing> {

		@Override
		public int compare(Marketing o1, Marketing o2) {
			return Double.compare(o1.salesAmount, o2.salesAmount);
		}

	}

	// consistent with equal
	public class ECComparator implements Comparator<Marketing> {

		@Override
		public int compare(Marketing o1, Marketing o2) {
			if (o1.getEmpName().compareTo(o2.getEmpName()) != 0) {
				return o1.getEmpName().compareTo(o2.getEmpName());
			}
			if (o1.getProdName().compareTo(o2.prodName) != 0) {
				return o1.getProdName().compareTo(o2.prodName);
			} else
				return Double.compare(o1.salesAmount, o2.salesAmount);

		}

	}

}
