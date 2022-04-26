package in.synxt.ifsandloops;

import java.util.Scanner;

public class BiggerAmongThreeWithLogicalOper {
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
		sc.close();
		
		if (numberOne > numberTwo && numberOne > numberThree ) {
			System.out.println("Number One is bigger");	
		}else if (numberTwo > numberOne && numberTwo > numberThree ) {
			System.out.println("Number Two is bigger");	
		}else if (numberThree > numberOne && numberThree > numberTwo ) {
			System.out.println("Number Three is bigger");	
		}else if (numberOne == numberTwo && numberOne > numberThree ) {
			System.out.println("Number One and Two are same but bigger than Number Three");	
		}else if (numberTwo == numberThree && numberTwo > numberOne ) {
			System.out.println("Number Three and Two are same but bigger than Number One");	
		}else if (numberOne == numberThree && numberOne > numberTwo ) {
			System.out.println("Number Three and One are same but bigger than Number Two");	
		}else if(numberOne == numberThree && numberOne == numberTwo ){
			System.out.println("All are same");
		}
		
	}
}
