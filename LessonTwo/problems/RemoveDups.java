package problems;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class RemoveDups {
	
	public static void main(String[] args) {
		int i,j;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter lengthe of the original array: ");
		int len = in.nextInt();
		if(len<1) {
			System.out.println("Invalid input! Please enter at least one value!");
			len = in.nextInt();
			}
		String [] string1 = new String[len];
		
		
		if(string1.length!=0||string1!=null)
		{
		System.out.println("Enter elements of the original array: ");
		 
		
			for(i=0;i<len;i++) {
				string1[i]=in.next();
				
			}	in.close();
	
	
			for(i=0;i<len;i++) {
				for(j=i+1;j<len;j++)
				   if(string1[i].equals(string1[j])) {
					   string1[j]=string1[len-1];
					   len--;
					   j--;
				   }
		}
		}
		
		String[] string2=Arrays.copyOf(string1, len);
		System.out.println("Unique elements from the above array are: ");
		
		   for(i=0;i<string2.length;i++) {
			  System.out.print(string2[i]+"\t");
		  }
		  
	}
}



