package problem2;
import java.util.Comparator;
public class SalesComparator implements Comparator<Marketing> {

	@Override
	public int compare(Marketing o1, Marketing o2) {
		return Double.compare(o1.salesAmount, o2.salesAmount);
	}
	
	
}
