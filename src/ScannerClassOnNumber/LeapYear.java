package ScannerClassOnNumber;

import java.util.Scanner;

public class LeapYear {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter year YYYY format");
	
	int year=sc.nextInt();
		
		
		
		if(year%4==0) {
			System.out.println("year is leap");
		}
		else {
			System.out.println("year is not leap");
		}
	}

}
