package DoWhileLoop;

public class SumOfEvenNumber {
public static void main(String[] args) {
		
		int a=1;
		int b=10;
		int sum=0;
		do {
			if(a%2==0) {
			sum=sum+a;
			}
			a++;
			
		} while (a<=10);
		System.out.println(sum);
	}

}
