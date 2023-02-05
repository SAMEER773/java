package DoWhileLoop;

public class PrintTheNumberDivisibleBy_4 {
	
	public static void main(String[] args) {
		
		int a=1;
		int b=100;
		
		do {
			if(a%4==0) {
			System.out.println(a);
			}
			a++;
			
		} while (a<=b);
	}

	

}
