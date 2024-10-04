package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a b c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		double discriminant = b*b - (4*a*c);
		if(discriminant<0)
		{
			System.out.printf("Roots: imaginary%n");
		}
		else if (discriminant ==0)
		{
			double zdroot = -b/(2*a);
			System.out.printf("Root: %.2f%n",zdroot);
		}
		else
		{
		double negativesignroot = (-b- Math.sqrt(discriminant))/(2*a);
		double positivesignroot = (-b+ Math.sqrt(discriminant))/(2*a);
		
		if (negativesignroot < positivesignroot)
		{System.out.printf("Roots: %.2f, %.2f%n",negativesignroot,positivesignroot);}
		else
		{
			System.out.printf("Roots: %.2f, %.2f%n",positivesignroot,negativesignroot);
		}
		
		}
	}

}
