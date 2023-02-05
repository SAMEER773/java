package ScannerClassOnNumber;

import java.util.Scanner;

public class StudentPaassedOrFailed {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks of math");
		int math=sc.nextInt();
		System.out.println("enter the marks of sci");
		int sci=sc.nextInt();
		System.out.println("enter the marks of lang");
		int lang=sc.nextInt();
		
		int avg=((math+sci+lang)/3);
		
		if(avg>=33) {
			System.out.println("student is passed");
		}
		else {
			System.out.println("student is failed");
		}
	}


}
