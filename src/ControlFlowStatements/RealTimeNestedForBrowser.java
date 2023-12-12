package ControlFlowStatements;

import java.util.Scanner;

public class RealTimeNestedForBrowser {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter your browser name");
		String bname = sc.nextLine();
		
		 /*String is class in Java
		 *Validate String using methods
		 *
		 *equality: (text)
		 *1. equals() - case sensitive
		 *2.equalsIgnoreCase() - not case sensitive
		 
		String s1 = "Hello";
		String s2 = "HellO";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		*/
		
		
		if (bname.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test case is executing on chrome");
		}
		else if (bname.equalsIgnoreCase("Fireforx"))
		{
			System.out.println("Test case is executing on Firefox");

		}
		else if(bname.equalsIgnoreCase("Edge"))
		{
			System.out.println("Test case is executing on Edge");

		}
		else 
		{
			System.out.println("Provide valid broswer name");
		}
	}

}
