package ForLoop_WithoutBreak;
//neon number 

public class neon_15 {
	public static void main(String[] args) {
		
		int a=89;
		int b=a*a;
		String st=Integer.toString(b);
		
	int sum=0;
		for(int i=1; i<=st.length(); i++) {
			
			int rem=b%10;
			
			sum=sum+rem;
					b=b/10;
		}
		
		if(a==sum) {
			System.out.println(sum+ " the given number is nivan number");
			
		}
		else {
			System.out.println(sum +" the given number is not nivan number");
			
		}
		
	}

}
