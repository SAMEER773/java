package DoWhileLoop;

public class SumOfNumDivisibleBy_4 {
	
	public static void main(String[] args) {
		
		int a=1;
		int b=100;
		int sum=0;
		do {
			if(a%4==0) {
			sum=sum+a;
			}
			a++;
			
		} while (a<=b);
		System.out.println(sum);
	}

}
