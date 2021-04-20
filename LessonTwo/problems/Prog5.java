package problems;
import java.util.Arrays;
import java.util.Scanner;
public class Prog5 {
	
	public  int[] combine(int[] a,int[] b) {
		int j;
		j=a.length + b.length;
		int[] combArray = new int[j];
		System.arraycopy(a, 0, combArray, 0, a.length);
		System.arraycopy(b, 0, combArray, a.length, b.length);
		return combArray;
	}
	
	public static void main(String[] args) {
		int i;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of the first array: ");
		int len1=in.nextInt();
		int[] array1=new int[len1];
		System.out.println("Enter elements of the first array: ");
		
		for(i=0;i<array1.length;i++) {
			 array1[i]=in.nextInt();
		 }
		 
		System.out.println("Enter length of the second array: ");
		 int len2=in.nextInt();
		 int[] array2=new int[len2];	 
		 System.out.println("Enter elements of the first array: ");
		 
          for(i=0;i<array2.length;i++) {
			 array2[i]=in.nextInt();
		 }
		Prog5 p=new Prog5();
		int[] newArray=new int[array1.length+array2.length];
		newArray=p.combine(array1,array2);
		System.out.println("Combination of array1 and array2: "+Arrays.toString(newArray));
	}
}
