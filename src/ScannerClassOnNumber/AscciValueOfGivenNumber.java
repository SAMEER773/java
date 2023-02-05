package ScannerClassOnNumber;

import java.util.Scanner;

public class AscciValueOfGivenNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		
		String x=sc.nextLine();
		
		
		
		
		for(int i=0; i<x.length(); i++) {
			char y=x.charAt(i);
			System.out.println("the ascii value of given number is "+(int)y);
		}
		
		
		
		
		
		
	}

}
