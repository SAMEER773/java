package DoWhileLoop;

public class ReverseTheDigit {
	
public static void main(String[] args) {
		
		int a=125;
		
		do{
			int rem=a%10;
			System.out.println(rem);
			a=a/10;
		}while(a!=0) ;
	}

}
