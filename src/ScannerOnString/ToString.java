package ScannerOnString;

import java.util.Scanner;

public class ToString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter 1st  String");

		String c=sc.nextLine();
		System.out.println("enter 2nd  String");

		String a=sc.nextLine();
		System.out.println("enter 3rd  String");
		String d=sc.nextLine();

		
		String ch=c.toString();
		String in=a.toString();
		String dou=d.toString();

		System.out.println(ch);
		System.out.println(in);
		System.out.println(dou);

		System.out.println(String.valueOf(in));

	}


}
