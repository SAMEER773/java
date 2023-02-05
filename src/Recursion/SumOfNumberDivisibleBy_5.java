package Recursion;

public class SumOfNumberDivisibleBy_5 {
	
	
	static int sum;
	
	static void series(int n) {
		
		if(n<=100) {
			
			if(n%5==0) {
				sum=sum+n;
			}
			
			series(n+1);
		}
		
	}
	
	public static void main(String[] args) {
		series(1);
		System.out.println(sum);
	}

}
