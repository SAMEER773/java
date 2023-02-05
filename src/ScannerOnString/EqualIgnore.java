package ScannerOnString;

import java.util.Scanner;

public class EqualIgnore {
	
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 1st  String");
		
		String a=sc.nextLine();
	System.out.println("enter 2nd  String");
		
		String b=sc.nextLine();
	System.out.println("enter 3rd  String");
		
		String c=sc.nextLine();
		
		
		
		System.out.println(a.equalsIgnoreCase(c));

	}

}
