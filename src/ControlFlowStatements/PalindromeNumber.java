package ControlFlowStatements;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		int r, sum=0;
		while (num>0)
		{
			r = num % 10;
			num = num/10;
			sum = sum *10 +r;
		}
		if (sum == temp)
		{
			System.out.println(temp + " is a palindrome number");
		}else
		{
			System.out.println(temp + " is not a palindrome number");

		}

		sc.close();	

	}

}
