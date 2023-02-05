package WhileLoop;

public class Factorial {
	
	public static void main(String[] args) {
		
		int a=6;
		int fact=1;
		while(a>=1) {
			
			fact=fact*a;
			
			a--;
			
		}
		System.out.println(fact);
	}

}
