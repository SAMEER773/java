package ConditionStatement;

public class CheckStudentIsPassedOrFailed {
	
	public static void main(String[] args) {
		
		int math=40;
		int sci=50;
		int lang=60;
		int avg=((math+sci+lang)/3);
		
		if(avg>=33) {
			System.out.println("student is passed");
		}
		else {
			System.out.println("student is failed");
		}
	}

}
