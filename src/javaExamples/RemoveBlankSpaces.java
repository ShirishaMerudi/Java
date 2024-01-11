package javaExamples;

import java.util.Scanner;

public class RemoveBlankSpaces {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String sname = sc.nextLine();
		
		String str1 = sname.replaceAll("\\s", "");
		System.out.println("String without blank spaces is " +str1);
		
	}

}
