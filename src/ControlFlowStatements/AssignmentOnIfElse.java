package ControlFlowStatements;

import java.util.Scanner;

public class AssignmentOnIfElse {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		//Even or Odd
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if (a %2 == 0)
		{
			System.out.println(a+ " is a Even Number");
		}
		else 
		{
			System.out.println(a+ " is a Odd number");
		}
		
		System.out.println("**********************************");
		
		//number equal to 10,50 or100
		System.out.println("Enter a number");
		int b = sc.nextInt();
		if ( b == 10)
		{
			System.out.println("Entered number is equal to 10");
		}
		else if (b == 50)
		{
			System.out.println("Entered number is equal to 50");

		}
		else if (b == 100)
		{
			System.out.println("Entered number is equal to 100");

		}
		else
		{
			System.out.println("Entered number is not equal to 10, 50 or 100");
		}
		
		
		//Number is positive or negative
		System.out.println("Enter a number");
		int c = sc.nextInt();
		if (c > 0)
		{
			System.out.println(c+ " is a Positive number");
		}
		else
		{
			System.out.println(c+ " is a Negative number");
		}
		
		
		
		
		
		
		sc.close();  
	
	}

}
