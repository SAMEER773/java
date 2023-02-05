package MethodWithParameter;

public class Revers_the_num {
	
	static void Rev(int a) {
		
		
		
for(int i=0; i<8; i++) {
	
	int rem=a%10;
	System.out.print(rem);
	
	a=a/10;
	
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Rev(12548758);
	}

}
