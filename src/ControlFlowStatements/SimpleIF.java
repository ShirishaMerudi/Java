package ControlFlowStatements;

import java.util.Scanner;

public class SimpleIF {

	public static void main(String[] args) 
	{

		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter you age ");
		int age = sc.nextInt();
		
		//Validate using if
		if(age >= 18)
		{
			System.out.println("Valid age for voting");
		}
		
		sc.close(); 
		
	}

}
