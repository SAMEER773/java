package Recursion;

public class SeriesOfNum {
	
	static void series(int n) {
		
		if(n<=10) {
			System.out.println(n);
			
			series(n+1);
		}
		
	}
	
	public static void main(String[] args) {
		series(1);
	}

}
