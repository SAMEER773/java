package ScannerClassOnNumber;

import java.util.Scanner;

public class AttandanceChecked1 {
public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("inter the positive number");
	int a=sc.nextInt();
	
	
		if(a>=75) {
			System.out.println("Eligible for exam");
		}
		else {
			System.out.println("Not Eligible for Exam");
		}
	}

}
