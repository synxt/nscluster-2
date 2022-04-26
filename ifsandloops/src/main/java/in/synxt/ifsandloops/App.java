package in.synxt.ifsandloops;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOne = 0;
		int numberTwo = 0;
		System.out.println("Enter number one");
		numberOne = Integer.parseInt(sc.nextLine());
		System.out.println("Enter number two");
		numberTwo = Integer.parseInt(sc.nextLine());
		
		if(numberOne==numberTwo) {
			System.out.println("Both are equal");			
		}else if(numberOne>numberTwo){
			System.out.println("Number One Is Bigger");
		}else {
			System.out.println("Number Two Is Bigger");
		}
		
		
	}
}
