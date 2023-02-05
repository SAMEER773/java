package DoWhileLoop;

public class CountTheNumDivisibleBy_4 {
	
	public static void main(String[] args) {
		
		int a=1;
		int b=100;
		int count=0;
		do {
			if(a%4==0) {
			count++;
			}
			a++;
			
		} while (a<=b);
		System.out.println(count);
	}


}
