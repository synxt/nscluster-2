package in.synxt.ifsandloops;

import java.util.Scanner;

public class GrossCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int basicSalary = 0;
		double grossSalary = 0.0;
		System.out.println("Enter Basic Salary");
		basicSalary = Integer.parseInt(sc.nextLine());		

		String name = "";
		name= sc.nextLine();
		
		char surname = ' ';
		surname = sc.nextLine().charAt(0);
		
		System.out.println(name);
		System.out.println(surname);
		
		if (basicSalary <= 10000) {
			System.out.println("Lesser than 10000");
			grossSalary = basicSalary + (basicSalary * 0.2) + (basicSalary * 0.08);
		} else if (basicSalary <= 20000) {
			System.out.println("Lesser than 20000");
			grossSalary = basicSalary + (basicSalary * 0.25) + (basicSalary * 0.09);			
		} else {
			System.out.println("Greater than 20000");
			grossSalary = basicSalary + (basicSalary * 0.3) + (basicSalary * 0.095);
		}
		System.out.println("Gross Salary Is"+grossSalary);
		
		
	}
}
