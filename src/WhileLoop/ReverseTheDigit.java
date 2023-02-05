package WhileLoop;

public class ReverseTheDigit {
	
	public static void main(String[] args) {
		
		int a=125;
		
		while(a!=0) {
			int rem=a%10;
			System.out.println(rem);
			a=a/10;
		}
	}

}
