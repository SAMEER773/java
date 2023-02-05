package WhileLoop;

public class CountDivisibleBy_4 {
	
	public static void main(String[] args) {
		
		int a=1;
		int b=100;
		int count=0;
		
		 while (a<=b){
			if(a%4==0) {
			count++;
			}
			a++;
			
		}
		 System.out.println(count);
	}


}
