package ScannerClassOnNumber;

import java.util.Scanner;

public class RetirementAge {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the age");

		int age=sc.nextInt();



		if(age>=60) {
			System.out.println("you are ready for retirement");
		}
		else {
			System.out.println("there is some time for retirement");
		}
	}

}
