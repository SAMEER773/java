package ScannerClassOnNumber;

import java.util.Scanner;

public class PrintRangeOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first number");

		int a=sc.nextInt();
		System.out.println("Enter the second number greater than privious number");

		int b=sc.nextInt();


		for(int i=a; i<=b; i++) {

			System.out.println(i);
		}
	}

}
