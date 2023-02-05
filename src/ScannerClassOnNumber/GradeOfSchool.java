package ScannerClassOnNumber;

import java.util.Scanner;

public class GradeOfSchool {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the mark to check grade");
	int a=sc.nextInt();
	
		
		
		if(a<25) {
			System.out.println("the grade of student is F");
		}
		else if(a>=25&& a<=45) {
			System.out.println("the grade of student is E");
		}
		
		else if(a>=45&& a<50) {
			System.out.println("the grade of student is D");
		}
		else if(a>=50&& a<60) {
			System.out.println("the grade of student is C");
		}
		else if(a>=60&& a<80) {
			System.out.println("the grade of student is B");
		}
		else {
			System.out.println("the grade of student is A");
		}
	}

}
