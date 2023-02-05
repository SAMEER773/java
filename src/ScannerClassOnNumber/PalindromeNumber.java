package ScannerClassOnNumber;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int a=sc.nextInt();

		
		int b=a;
		int rev=0;
		while(a!=0) {

			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;

		}
		System.out.println(rev);

		if(b==rev) {
			System.out.println("the given number is palindrome");

		}else {
			System.out.println("the given number is not Palindrome");
		}
	}
}


