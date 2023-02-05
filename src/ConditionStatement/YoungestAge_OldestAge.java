package ConditionStatement;

public class YoungestAge_OldestAge {
	
	public static void main(String[] args) {
		
		int age1=80;
		int age2=40;
		int age3=60;
		
		if(age1>age2&&age1>age3) {
			System.out.println("its a oldest age");
		}
		else if(age1<age2&&age1<age3) {
			System.out.println("its a youngest age");
			
		}
	}

}
