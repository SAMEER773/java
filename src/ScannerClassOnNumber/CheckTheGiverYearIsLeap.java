package ScannerClassOnNumber;

import java.util.Scanner;

public class CheckTheGiverYearIsLeap {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year in YYYY format ");
		
		int x=sc.nextInt();
	
		if(x%4==0) {
			System.out.println("the given year is leap year");
		}
		else {
			System.out.println("the given year is not leap year");
		}
		
	}

}
