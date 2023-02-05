package ScannerOnString;

import java.util.Scanner;

public class Trim {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter 1st  String");

		String a=sc.nextLine();
		
		System.out.println(a.length());

		String b=a.trim();

		System.out.println(b.length());

		System.out.println(a);
		System.out.println(b);



	}

}
