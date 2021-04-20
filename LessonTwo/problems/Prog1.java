package problems;

public class Prog1 {
	public static void main(String[] args){
		/*RandomNumbers class is considered in this program. PI is constant variable, and getRandomInt 
		  method is constant method that we can't use these members directly by instantiating objects.*/
		
		int x,y;
		
		//This program computes random number between 1 and 9, and calculates power(PI,x)
		x=RandomNumbers.getRandomInt(1, 9);
		System.out.println("Random number between 1 and 9 is: "+x);						
		System.out.println("Power of "+RandomNumbers.PI+" and "+x+" is: "+Math.pow(RandomNumbers.PI, x));
		
		//This program computes random number between 3 and 14, and calculates power(y,PI)
		y=RandomNumbers.getRandomInt(3,14);
		System.out.println("Random number between 3 and 14 is: "+y);
		System.out.println("Power of "+y+" and "+RandomNumbers.PI+" is: "+Math.pow(y, RandomNumbers.PI));
	
	}
        

}
