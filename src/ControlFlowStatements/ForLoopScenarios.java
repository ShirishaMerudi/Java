package ControlFlowStatements;

import java.util.Scanner;

public class ForLoopScenarios {

	public static void main(String[] args) {
		//print a table of a number
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		System.out.println("The Table of "+num+ " is");
		//int num = 2;
		for (int i=1;i<=10;i++)
		{
			System.out.println(num+ "*" +i+ "=" +(num * i));
		}
		
		
		
	}

}
