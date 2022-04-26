package in.synxt.ifsandloops;

import java.util.Scanner;

public class BiggerAmongThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOne = 0;
		int numberTwo = 0;
		int numberThree = 0;
		System.out.println("Enter number one");
		numberOne = Integer.parseInt(sc.nextLine());
		System.out.println("Enter number two");
		numberTwo = Integer.parseInt(sc.nextLine());
		System.out.println("Enter number three");
		numberThree = Integer.parseInt(sc.nextLine());
		
		if(numberOne<numberTwo) {
			if(numberTwo<numberThree) {
				System.out.println("Number Three");
			}else if(numberTwo>numberThree) {
				System.out.println("Number Two");
			}else {
				System.out.println("Number Two & Number Three are same but bigger than number one");
			}
		}else if(numberOne>numberTwo){
			if(numberOne<numberThree) {
				System.out.println("Number Three");
			}else if(numberOne>numberThree) {
				System.out.println("Number One");
			}else {
				System.out.println("Number One & Number Three are same but bigger than number Two");
			}
		}else {
			if(numberOne<numberThree) {
				System.out.println("Number Three");
			}else if(numberOne>numberThree){
				System.out.println("Number One & Number Two are same but bigger than number Three");
			}else {
				System.out.println("All are same");
			}
		}
		
	}
}
