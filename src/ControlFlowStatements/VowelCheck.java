package ControlFlowStatements;

import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = sc.nextLine().charAt(0); //method chaining 
		//Operators
		if (ch == 'a'||ch == 'e'|| ch =='i'||ch == 'o'||ch == 'u')
		{
			System.out.println(ch + " is a vowel");

		}
		else
		{
			System.out.println(ch + " is not a vowel");

		}
		
		
		
		/*
		//Nested If
		if (ch == 'a')
		{
			System.out.println(ch + " is a vowel");
		}
		else if (ch == 'e')
		{
			System.out.println(ch + " is a vowel");

		}
		else if (ch == 'i')
		{
			System.out.println(ch + " is a vowel");

		}
		else if (ch == 'o')
		{
			System.out.println(ch + " is a vowel");

		}
		else if (ch == 'u')
		{
			System.out.println(ch + " is a vowel");

		}
		else
		{
			System.out.println(ch + " is not a vowel");

		}*/
		
		
		
		sc.close();  

	}

}
