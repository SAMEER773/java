package MethodWithParameter;

public class Palindrome {
	
	static void pali(int a) {
		
		
		String sc=Integer.toString(a);
		int c=0;
		int d=a;

		for(int i=1; i<=sc.length(); i++) {

			int b=a%10;

			c=(c*10)+b;

			a=a/10;


		}
		System.out.println(c);

		if(d==c) {

			System.out.println("the given number is palidrom");

		}
		else {
			System.out.println("the given number is not palidrom");

		}
		
	}
	
	public static void main(String[] args) {

		pali(250);
	}

}
