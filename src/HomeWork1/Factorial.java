
package HomeWork1;
import java.util.Scanner;


public class Factorial {
	//driver method 
	public static void main(String args[])
	  {
	    int n, i, f = 1;
	    String answer = "";

	    // executes the statement if user wants to continue
	     do {
	      	System.out.println("\nEnter an integer for calculation of its factorial: ");
	    	Scanner in = new Scanner(System.in);
	    	Scanner scan = new Scanner(System.in);

	    	n = in.nextInt();

	    	if (n < 0)
	    		System.out.println("Wrong Input! Number should be non-negative.");
	    	else
	    	{
	    		//loop for factorial 
	    		for (i = 1; i <= n; i++)
	    		{
	    			f = f*i;
	    		}
	    		System.out.println("\nFactorial of: " + n + " is = " + f);
	    		
	    		System.out.print("\nDo you to continue Y/N: "); // asks user if they want to continue with the program
	    		
	    		answer = scan.next();
	    	}
	    	
	     } while(answer.equals("y") || answer.equalsIgnoreCase("Y"));
	    
	 }
}
