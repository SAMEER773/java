package ScannerOnString;

import java.util.Scanner;

public class Sleep {
	
	public static void main(String[] args) throws InterruptedException{
Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 1st  String");
		
		String a=sc.nextLine();
	System.out.println("enter 2nd  String");
		
		String b=sc.nextLine();
	System.out.println("enter 3rd  String");
		
		String c=sc.nextLine();
System.out.println("enter 3rd  String");
		
		String d=sc.nextLine();

		System.out.print(a);
		Thread.sleep(2000);
		System.out.print(b);
		Thread.sleep(2000);
		System.out.print(c);
		Thread.sleep(2000);
		System.out.print(d);
		Thread.sleep(2000);
		
	}

}
