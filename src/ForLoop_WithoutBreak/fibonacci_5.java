//Fibonacci

// 0 1 1 2 3 5 8 
package ForLoop_WithoutBreak;

public class fibonacci_5 {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		
		
		for(int i=1; i<=10; i++) {
			
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			
			
		}
		
		
		
		
	}

}
