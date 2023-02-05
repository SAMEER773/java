package Recursion;

public class NumberDivisibleBy_5 {
	
	static void series(int n) {
		
		if(n<=100) {
			
			if(n%5==0) {
			System.out.println(n);
			}
			
			series(n+1);
		}
		
	}
	
	public static void main(String[] args) {
		series(1);
	}
	

}
