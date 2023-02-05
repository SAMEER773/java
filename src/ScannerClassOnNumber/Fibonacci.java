package ScannerClassOnNumber;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first number from fib series or enter Zero ");
		int a=sc.nextInt();
		
		System.out.println("enter the second num from fib serier or enter one ");
		
		int b=sc.nextInt();
		
	
		
		System.out.println("enter the rang of fib number");
		if(a==0) {
			System.out.println(a);
			}
			if(b==1) {
			System.out.println(b);
			}
		
		int c= sc.nextInt();
		
		for(int i=a; i<=c; i++) {
			
			int d=a+b;
			System.out.println(d);
			a=b;
			b=d;
			
		}
	}

}
