package ScannerOnString;

import java.util.Scanner;

public class ReplaceWithS {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter 1st  String");
	
	String a=sc.nextLine();
		
		
		
		String b=a.replace('t', 'a');
		System.out.println(b);
	}

}
