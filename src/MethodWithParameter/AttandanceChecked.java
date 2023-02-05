package MethodWithParameter;

public class AttandanceChecked {
	
	static void att(int a) {
		
	
		
		if(a>=75) {
			System.out.println("Eligible for exam");
		}
		else {
			System.out.println("Not Eligible for Exam");
		}
		
	}

	
public static void main(String[] args) {
		
		att(78);
	
	}
}
