package MethodWithParameter;

public class Natural {
	
	static void nat(int a) {
int sum=0;
		
		for(int i=0; i<=a; i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
		nat(100);
		
	}

}
