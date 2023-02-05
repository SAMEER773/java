package ScannerOnArray;

import java.util.Scanner;

public class PrintString {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the array size");
		
		int size=sc.nextInt();
		System.out.println("enter value");
		
		String[] a=new String [size];
		for (int i = 0; i < a.length; i++) {
			
			a[i]=sc.nextLine();
			
		}
		
		for (int i = 0; i < a.length; i++) {
			
			String j = a[i];
			System.out.println(a[i]);
			
		}
		
	}

}
