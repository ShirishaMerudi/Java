package ParameterPassing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadInputFromUser {

	public static void main(String[] args) throws IOException 
	{
		
		//Scanner Class - recommended
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name = sc.nextLine();
		
		System.out.println("Enter your Gender (M/F)");
		//String -->charAt(index)-->char
		
		String data = sc.nextLine();
		char gen = data.charAt(0);
		
		System.out.println("Enter your age");
		
		int age = sc.nextInt();
		
		System.out.println("Hello " +name);
		System.out.println("Your age is: " +age);
		System.out.println("Your Gender is: " +gen);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		// techinique 1: not recommended
		//BufferedReader Class
		
		System.out.println("Enter your age");

		InputStreamReader ir = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(ir);
		
		String data = br.readLine(); //string to int
		int age = Integer.parseInt(data);
		System.out.println("Age is : " + age);

	
	
		//techinique 2: not recommended
		System.out.println("Enter your age");
		
		// input stream
		int age = System.in.read(); //char to int
		System.out.println("Age is : " + age);
		*/
		

	}

}
