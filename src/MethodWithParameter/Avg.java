package MethodWithParameter;

public class Avg {

	static void avg(int a) {

		
		double sum=0;
		for(int i=0; i<=a; i++) {

			sum=sum+i;



		}
		double avg=sum/a;
		System.out.println(avg);

	}	
	public static void main(String[] args) {

		avg(100);
	}



}
