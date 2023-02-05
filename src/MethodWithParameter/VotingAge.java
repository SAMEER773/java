package MethodWithParameter;

public class VotingAge {
	
	static void Vote(int a) {
	int age=18;
		
		if(age>=18) {
			System.out.println("Eligible for Voting");
		}
		else {
			System.out.println("Not Eligible");
		}
		
	}
	
	public static void main(String[] args) {
		Vote(25);
	
	}

}
