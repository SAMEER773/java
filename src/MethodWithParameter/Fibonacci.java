package MethodWithParameter;

public class Fibonacci {
	
	static void fib(int d) {
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		
		
		for(int i=1; i<=d; i++) {
			
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		fib(10);
		
		
		
		
	}

}
