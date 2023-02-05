package DoWhileLoop;

public class ArmStrong {
	public static void main(String[] args) {
		
		int a=370;
		int sum=0;
		int b=a;
		do{
			
			int rem=a%10;
			
			sum=sum+(rem*rem*rem);
			a=a/10;
		}while(a!=0);
		System.out.println(sum);
		if(b==sum) {
			System.out.println("the given number is ArmStrong");
		}
		else {
			System.out.println("the given number is not ArmStrong");
		}
	}

}
