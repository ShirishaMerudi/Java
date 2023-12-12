package ControlFlowStatements;

import java.util.Scanner;

public class SwitchCase_BrowserScenario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a browser name Chrome/Firefox/Edge");
		String bname = sc.nextLine();
		
		/*
		 * String class case conversion methods
		 * 1.toUpperCase()
		 * 2.toLowerCase()
		 */

		switch (bname.toLowerCase()) {
		case "chrome":
			System.out.println("Execution on Chrome");
			break;
		case "firefox":
			System.out.println("Execution on Firefox");
			break;
		case "edge":
			System.out.println("Execution on Edge");
			break;

		default:
			System.out.println("Provide valid name");
			break;
		}
		sc.close();
		
	}

}
