package Recursion;

public class SumOfEven {
	
	static int sum;
	
	static void series(int n) {
		
		if(n<=100) {
			
			if(n%2==0) {
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
