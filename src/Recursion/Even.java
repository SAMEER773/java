package Recursion;

public class Even {
	static void series(int n) {
		
		if(n<=100) {
			
			if(n%2==0) {
			System.out.println(n);
			}
			
			series(n+1);
		}
		
	}
	
	public static void main(String[] args) {
		series(1);
	}

}
