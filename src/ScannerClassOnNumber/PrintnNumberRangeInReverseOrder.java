package ScannerClassOnNumber;

import java.util.Scanner;

public class PrintnNumberRangeInReverseOrder {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the number");

		int a=sc.nextInt();

		System.out.println("enter the second numbet lower that perivious");

		int b=sc.nextInt();



		for(int i=a; i>=b; i--) {

			System.out.println(i);
		}

	}
}
