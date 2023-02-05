package WhileLoop;

public class Palindrome {
	
	public static void main(String[] args) {
		
	int a=121;
	int rem=1;
	int b=a;
	
	while(a!=0) {
		
	rem=a%10;
		System.out.print(rem);
		
		a=a/10;
	}
	
	if(b==rem) {
		System.out.println(" given number is palindrome");
	}
	else {
		System.out.println(" the given number is not Palindrome");
	}
	}

}
