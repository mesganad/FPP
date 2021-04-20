package lesson6;

public class MyTable {
	private char c1;
	private String s1;
	private Entry[] entries = new Entry[26];

	public void add(char c, String s) {
		int a = 'a';
		int t = c;
		int i = t - a;
		if (entries[i] != null) {
			entries[i].str = s;
		}

		else {
			entries[i] = new Entry(c, s);
		}
		this.c1 = c;
		this.s1 = s;
		// System.out.println("[" + entries[i].ch + "," + entries[i].str + "]");
	}
	public String get(char c){
		int a = 'a';
		int t = c;
		int i = t - a;
		if(entries[i]!=null) {
			return entries[i].str;
		}
		return "";
		}

	public String toString() {
		
		return "["+this.c1+","+this.s1+"]";
		
	}

	private class Entry {
		char ch;
		String str;
		
		public Entry() {};
		
		public Entry(char c, String s) {
			this.ch = c;
			this.str = s;
		}

		public String toString() {
			return this.ch+"->"+this.str;
		}
	}

	public static void main(String[] args) {

		MyTable t = new MyTable();
		t.add('a', "abebe");
		t.add('a', "Andrew");
		t.add('b', "Billy");
		t.add('c', "charless");
		t.add('d', "dejen");
		t.add('e', "ethiopia");
		t.add('e', "eden");
		t.add('e', "eleni");
		System.out.println("The last entry:\n================\n" + t + "\n");

		System.out.println(
				"All value pairs of the character index array:\n=============================================");
		for (Entry m : t.entries) {
			if (m != null) {
				System.out.println(m);
			}

		}
		System.out.println("The name that starts with 'a' is :"+t.get('a'));
	}

}