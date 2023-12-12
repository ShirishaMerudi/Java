package ControlFlowStatements;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b)
		{
			System.out.println(a+ " is greater than " +b);
			
		}
		else
		{
			System.out.println(b+ " is greater than " +a);
		}
		
		
		
	/*	System.out.println("Enter you age ");
		int age = sc.nextInt();
		
		//Validate using if
		if(age >= 18)
		{
			System.out.println("Valid age for voting");
		}
		else 
		{
			System.out.println("Not valid age for voting");
		}
		
		*/
		sc.close();  
		
		
	}

}
