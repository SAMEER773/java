package WhileLoop;

public class SumOfDigitDivisibleBy_9 {
	
	public static void main(String[] args) {
		
		int a=1;
		int b=100;
		int sum=0;
		while(a<=b) {
			
			if(a%9==0) {
			sum=sum+a;
			}
			a++;
		}
		System.out.println(sum);
	}

}
