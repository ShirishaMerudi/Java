package ControlFlowStatements;

import java.util.Scanner;

public class EmployeeSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Employee name & Performance Rating");
		String ename = sc.nextLine();
		int erate = sc.nextInt();
		
		switch (erate) {
		case 1:
			System.out.println("Poor Peformance by "+ ename);
			break;
		case 2:
			System.out.println( ename+" Peformance needs Improvement ");
			break;
		case 3:
			System.out.println("Good Peformance by "+ ename);
			break;	
		case 4:
			System.out.println("Excellent Peformance by "+ ename);
			break;
		case 5:
			System.out.println(ename + " is Employee of the year ");
			break;

		default:
			System.out.println("Enter valid Employee Performance rating between 1-5");
			break;
		}
		sc.close();
		
	}

}
