package ScannerClassOnNumber;

import java.util.Scanner;

public class IncomeTaxSlab {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the income");
		int Income= sc.nextInt();



		if(Income>=250000 && Income<500000 ) {
			System.out.println("tax slab is 5%");


		}
		else if(Income>=500000 && Income<1000000 ) {

			System.out.println("tax slab is 20%");
		}
		else {
			System.out.println("tax slab is 30%");
		}
	}

}
