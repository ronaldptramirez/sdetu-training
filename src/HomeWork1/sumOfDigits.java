package HomeWork1;

public class sumOfDigits {

	public static void main(String[] args) {
		 int n = 20; 
	        System.out.println("Sum of digits in numbers"
	                          +" from 1 to " + n + " is "
	                          + sumOfDigitsFrom1ToN(n)); 

	}
	
	  // Returns sum of all digits in numbers from 1 to n 
    public static int sumOfDigitsFrom1ToN(int n) 
    { 
        int result = 0; // initialize result 
       
        // One by one computation of number which will result to a sum from 1 to n 
        for (int x = 1; x <= n; x++) 
            result += sumOfDigits(x); 
       
        return result; 
    } 
    
    // method to compute the sum of digits of a given number x 
    public static int sumOfDigits(int x) 
    { 
        int sum = 0; 
        while (x != 0) 
        { 
            sum += x % 10; 
            x   = x / 10; 
        } 
        return sum; 
    } 
    
    
       

}
