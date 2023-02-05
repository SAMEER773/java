package MethodWithParameter;

public class ArmStrong {
	
	static void arm(int a) {
		
		int sum=0;
		int b=a;

		String sc=Integer.toString(a);

		for(int i=1; i<=sc.length(); i++) {

			int rem=a%10;
			sum=sum+(rem*rem*rem);
			a=a/10;

		}
		
		System.out.println(sum);
		
		if(b==sum) {
			System.out.println(sum +" the given number is armstrong number");
			
		}
		else {
			System.out.println(sum+" the given number is not armstrong number");
			
		}
		
	}
	
	public static void main(String[] args) {
		arm(370);
	
	}

}
