package ControlFlowStatements;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int r, sum=0,temp = num;
		while (num>0)
		{
			r = num % 10;
			sum = sum +(r*r*r);
			num = num/10;
			
		}
		if (sum == temp)
		{
		System.out.println(temp + " is a Armstrong Number");
		}else
		{
			System.out.println(temp + " is not a Armstrong Number");
		}
		sc.close();
	}

}
