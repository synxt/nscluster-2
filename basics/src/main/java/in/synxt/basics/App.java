package in.synxt.basics;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the gender");
		String gender = sc.nextLine();
		
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		if(gender.equals("M")) {
			if(age >= 21) {
				System.out.println("Eligible");
			}else {
				System.out.println("Not Eligible");
			}
		}else if(gender.equals("F")){
			if(age >= 18) {
				System.out.println("Eligible");
			}else {
				System.out.println("Not Eligible");
			}
		}
	}
}
