package ScannerClassOnNumber;

import java.util.Scanner;

public class ArmStrongNum {


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the num");

		int x=sc.nextInt();
		int sum=0;
		int b=x;
		while(x!=0) {

			int rem = x%10;
			sum=sum+(rem*rem*rem);
			x=x/10;


		}
		System.out.println(sum);

		if(b==sum) {
			System.out.println("the given number is armstrong num");
		}
		else {
			System.out.println("the given number is not armstrong num");
		}

	}
}
