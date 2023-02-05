package ScannerClassOnNumber;

import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		
		String st=Integer.toString(a);
		int sum=0;
		int b=a;
		for(int i=1; i<=st.length(); i++) {
			
			int rem=a%10;
			
			sum=sum+rem;
			
			a=a/10;
			
		}
		
		if(b%sum==0) {
			
			System.out.println("the given number is harshad number");
		}
		else {
			System.out.println("the given number is not harshad number");
		}
	}

}
