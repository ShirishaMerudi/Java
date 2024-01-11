package ControlFlowStatements;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Number before swapping : a = " +num1+ "& b = " +num2);

/*		int num3 = num2;
		num2 = num1;
		num1 = num3;
	*/
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1-num2;
		
		System.out.println("Number before swapping : a = " +num1+ "& b = " +num2);

		sc.close();	

	}

}
