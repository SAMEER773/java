package ScannerOnString;

import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the String");
		
		String s=sc.nextLine();
		
		
		char [] a=s.toCharArray();
		int count=0;
		for(int i=0; i<a.length; i++) {
			
			if(a[i]=='l') {
				
				count++;
				
			}
			
		}
		System.out.println("the number of  character l is "+count);
	}


}
