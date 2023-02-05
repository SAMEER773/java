package ScannerClassOnNumber;

import java.util.Scanner;

public class CountDuplicateDigit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		
		int a=sc.nextInt();
		
		
		
		String x=Integer.toString(a);
		
		char[] y=x.toCharArray();
		
		
		for (int i = 0; i < y.length; i++) {
			
			for (int j = 1+i; j < y.length; j++) {
				
				if(y[i]==y[j]) {
					System.out.println(y[j]);
				}
				
			}
			
			
			
			
			
					
				}
				
			}
			
		}
		
	


