package ScannerOnString;

import java.util.Scanner;

public class RemoveAllSpace {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter 1st  String");
	
	String a=sc.nextLine();
		
		
		String[]b=a.split(" ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
			
		}
		
		
	}


}
