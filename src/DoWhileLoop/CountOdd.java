package DoWhileLoop;

public class CountOdd {
public static void main(String[] args) {
		
		int a=1;
		int b=10;
		int count=0;
		
		do {
			if(a%2!=0) {
			count++;
			}
			a++;
			
		} while (a<=10);
		System.out.println(count);
	}

}
