package ForLoop_WithoutBreak;
//harshad number for 2 digit
public class Hrashad_16 {
	public static void main(String[] args) {
		
		int a=21;
		
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

}
