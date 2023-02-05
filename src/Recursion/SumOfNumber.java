package Recursion;

public class SumOfNumber {
	

	public static int sum=0;
		
		static void series(int n) {
			
			if(n<=10) {
				sum=sum+n;
				
				series(n+1);
			}	
			
		}
		
		
		public static void main(String[] args) {
			
			series(1);
			System.out.println(sum);
		}
		


}
