package basics;

public class SalaryCalculator {
	public static void main (String[] args) {
		// lets create a variable to define our career
		
		// Declare a variable
		String career;
		System.out.println("Program is starting");
		
		//Define a variable
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		// Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate =  42.50;
		career = "Web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a: " + career + " at the rate of: " + rate + " per hour is $" + salary + " per year. ");
		
		// Computer our annual salary
		// rate * hoursPerWeek * weeksPerYear
	}
}
