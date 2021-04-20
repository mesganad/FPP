package hashtables;

public class MyHashtableTest {
	public static void main(String args[]){
		MyHashtable table = new MyHashtable();
		table.put("CS390", "FPP");
		table.put("CS401", "MPP");
		table.put("CS473", "Android");
		table.put("CS473", "Andriod Java");
	//	table.put("CS423", null);
//	table.put(null, "Algorithms"); //Does not allow null keys
		System.out.println(table);
	//	System.out.println("Table Size : " + table.size());
	//	System.out.println("isEmpty() :" + table.isEmpty());
		Object val = table.get("CS473");
		System.out.println("Value for the Key CS473 is : " + val);
		
		System.out.println();
		String x = "ABC";
		System.out.println(x.hashCode());
	}
}
