package WhileLoop;

public class CountEven {
	public static void main(String[] args) {
		
		int a=1;
		int b=10;
		int count=0;
		
		 while (a<=10) {
			if(a%2==0) {
			count++;
			}
			a++;
			
		}
		System.out.println(count);
	}

}
