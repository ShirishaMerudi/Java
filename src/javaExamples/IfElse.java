package javaExamples;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Studnet marks: ");
		
		int marks = scanner.nextInt();
		/*if (marks <= 35)
		{
			System.out.println("Student has failed \nAs Marks are below 35");
		}
		else 
		{
			System.out.println("Student has Passed \nAs marks are above 35");

		}*/
		scanner.close();
		
		
		//Conditonal Operator (if else in one statement)
		System.out.println((marks <=35)? "Student has failed" : "Student has Passed");
	}

}
