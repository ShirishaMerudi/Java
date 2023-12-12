package ControlFlowStatements;

import java.util.Scanner;

public class ReverseNumber {

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
		System.out.println("Reverse of "+temp+" is "+sum);

		sc.close();	
	}

}
