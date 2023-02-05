package Recursion;

public class AsciiValue {
	
	static void series(int n) {
		
		if(n<=127) {
			System.out.println((char)n);
			
			series(n+1);
		}
		
	}
	
	public static void main(String[] args) {
		series(1);
	}

}
