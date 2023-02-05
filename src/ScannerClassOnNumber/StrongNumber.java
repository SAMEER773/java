package ScannerClassOnNumber;

public class StrongNumber {
	public static void main(String[] args) {

		int a=15;
		int fact=1;
		int sum=0;
		while(a!=0) {

			int rem=a%10;
			System.out.println(rem);

			for(int i=rem; i>=1; i--) {
				fact=fact*i;	
			}
			sum=sum+fact;
			a=a/10;




		}


		System.out.println(sum);
	}


}
