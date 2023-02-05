package ScannerClassOnNumber;

public class NeonNumber {
	
	public static void main(String[] args) {
		
		int a=9;
		int mul=a*a;
		
		String st=Integer.toString(mul);
		
		int sum=0;
		
		for(int i=1; i<=st.length(); i++ ) {
			
			int rem=mul%10;
		
			sum=sum+rem;
			System.out.println(sum);
			a=a/10;
			
		}
		System.out.println(sum);
	}

}
