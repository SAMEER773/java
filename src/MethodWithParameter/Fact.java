package MethodWithParameter;

public class Fact {
	
	static void fact(int a) {
		int fact=1;
		
		for(int i=1; i<=a; i++) {
			
			fact=fact*i;
			
			
			
		}
		System.out.println(fact);
		
	}
	
	public static void main(String[] args) {
		
		fact(6);

	

}

}
