package ScannerOnString;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter 1st  String");

		String s=sc.nextLine();


		char [] ab=s.toCharArray();

		for(int i=ab.length-1; i>=0; i--) {

			System.out.print(ab[i]);

		}
	}

}
