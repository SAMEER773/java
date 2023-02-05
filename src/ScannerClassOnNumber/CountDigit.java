package ScannerClassOnNumber;

import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int x=sc1.nextInt();
		
	
		
		String sc=Integer.toString(x);
		
		int a=sc.length();
		System.out.println("the number of digit in given num is "+a);
	}

}
