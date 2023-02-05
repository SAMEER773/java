package Recursion;

public class StackOverFlow {
	
	static void num(int b) {
		
		if(b>=1) {
			System.out.println(b);
			
		}
		
		num(10);
		b--;
		}
		
	
	
public static void main(String[] args) {
		
	num(10);
		
	}

}
