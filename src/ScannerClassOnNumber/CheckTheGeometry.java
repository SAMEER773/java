package ScannerClassOnNumber;

import java.util.Scanner;

public class CheckTheGeometry {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter width");
		int b=sc.nextInt();
		System.out.println("enter height");
		int h=sc.nextInt();
		
		
		if(b==h) {
			System.out.println("its a square");
		}
		else {
			System.out.println("its a rectangle");
		}
	}

}
