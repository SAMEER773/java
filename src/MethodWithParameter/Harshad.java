package MethodWithParameter;

public class Harshad {
	
	static void har(int a) {
	
		
		String st=Integer.toString(a);
		
		int b=a;
		int sum=0;
		
		for(int i=1; i<=st.length(); i++) {
			
			int rem=a%10;
			
			sum=sum+rem;
			
			a=a/10;
			
			
			
		}
		
		if(b%sum==0) {
			
			System.out.println("the given number is harshad number");
		}
		else {
			System.out.println("the given number is not harshad number");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		har(21);
	}
	
	

}
