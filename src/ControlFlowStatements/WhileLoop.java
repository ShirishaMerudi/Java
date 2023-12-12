package ControlFlowStatements;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		int i =1;
		while (i <=5)
		{
			System.out.println("While Loop ");
			i++;
		}
		System.out.println();
		
		int j =1;
		while(j<=10)
		{
			System.out.print(j);
			j++;
		}
		System.out.println();

		//Number of iterations are not known
		//Sum of digits in a number 
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		int r, sum=0;
		while (num >0)
		{
			r = num % 10;
			num = num /10;
			sum = sum +r;
			
		}
		System.out.println("Sum of the digits is " +sum);
		
		
		
		
		
	}

}
