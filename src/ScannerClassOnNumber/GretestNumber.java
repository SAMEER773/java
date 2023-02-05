package ScannerClassOnNumber;

import java.util.Scanner;

public class GretestNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		System.out.println("enter the thired number");
		int num3=sc.nextInt();
		
		
		if(num1>num2&&num1>num3) {
			
				System.out.println("the NUM=1 is gretest");
			
		}
		else if(num2>num1&&num2>num3) {
			
				System.out.println("the NUM=2 is gretest");
			
		}
		else if(num3>num1&&num3>num2) {
			
			System.out.println("the NUM=3 is gretest");
		
	}
	
		
	}

}
