package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2a {
/**
 * initalize scanner
 * create 5 variables positive sum, non positive sum, total sum ,positive and negative divisor
 * loops 5 times to ask for user ints
 * adds user int to sum of total 
 * checks whether it is a positive number if so adds it to positive sum and increase divisor by 1
 * else it falls into non positive sum and increases divisor by one
 * if else conditionals for both positive and non-positive average
 * both check if the divisor is 0 if it is then it will return 0 so it does not print null
 * else it returns the average
 * following conditionals check if if the divsor is 1 if so it will mention the number as singular rather than plural 
 * @param args
 */
	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter five whole numbers: ");
		int positivesum= 0;
		int nonpositivesum = 0;
		int totalsum = 0;
		int positivedivisor = 0;
		int nonpositiveDivisor = 0;
		for (int i = 0; i<5;i++)
		{ 
			int UserNum = scanner.nextInt();
			totalsum = totalsum + UserNum;
	
			if( UserNum > 0)
			{
				positivesum += UserNum;
				positivedivisor ++;
			}
			else 
			{
				nonpositivesum += UserNum;
				nonpositiveDivisor ++;
			}						
		
		}
		
		double averagePositive = 0;
		if (positivedivisor == 0)
		{
			averagePositive = 0.00;
		}
		else
		{
			averagePositive = (double)positivesum/positivedivisor;
		}
		
		
		double averageNonpositive = 0;
		if (nonpositiveDivisor == 0)
		{
			averageNonpositive = 0.00;
		}
		else
		{
			averageNonpositive = (double)nonpositivesum/nonpositiveDivisor;
		}
		
		double averageTotal = (double)totalsum/5;
		
		if (positivedivisor == 1)
		{System.out.println("The sum of the "+ positivedivisor + " positive number: "+ positivesum);}
		else
		{System.out.println("The sum of the "+ positivedivisor + " positive numbers: "+ positivesum);}
		
		if (nonpositiveDivisor==1)
		{System.out.println("The sum of the "+ nonpositiveDivisor + " non-positive number: " + nonpositivesum);}
		else 
		{System.out.println("The sum of the "+ nonpositiveDivisor + " non-positive numbers: " + nonpositivesum);}
		
		System.out.println("The sum of the 5 numbers: " + totalsum);
		if (positivedivisor == 1)
		{System.out.printf("The average of the %d positive number: %.2f%n",positivedivisor, averagePositive);}
		else
		{System.out.printf("The average of the %d positive numbers: %.2f%n",positivedivisor, averagePositive);}
		
		if(nonpositiveDivisor==1)
		{System.out.printf("The average of the %d non-positive number: %.2f%n",nonpositiveDivisor, averageNonpositive);}
		else
		{System.out.printf("The average of the %d non-positive numbers: %.2f%n",nonpositiveDivisor, averageNonpositive);}
		System.out.printf("The average of the 5 numbers: %.2f%n",averageTotal);
		
		
		
	}
	

}
