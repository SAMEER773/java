package ScannerOnString;

import java.util.Scanner;

public class ReverseSentance {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter 1st  String");

		String a=sc.nextLine();


		String[]b=a.split(" ");
		for (int i =b.length-1; i>=0; i--) {
			System.out.print(b[i]+" ");

		}


	}


}
