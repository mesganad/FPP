package problems;

public class Prob {
public static void main(String[] args) {
	
	/*Program that gives length of each command line input strings and the number of string
	 which starts with 'A' or 'a'.*/
	
	int counter=0;
	if(args==null ||args.length==0)
	{
		System.out.println("Sorry, no input is provided: ");
	}
	
			  for(int i=0;i<args.length;i++) {
				 System.out.println("Length of "+args[i]+" is "+args[i].length());
				 //Assuming the program for the inputs case insensitive.
				 if(args[i].charAt(0)=='A' || args[i].charAt(0)=='a') counter++;
			}
			System.out.println("String which starts with 'A' or 'a': "+counter);
	}
}

