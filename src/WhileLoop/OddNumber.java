package WhileLoop;

public class OddNumber {
	
	public static void main(String[] args) {
		
		int i=1;
		int j=100;
		
		while(i<=j) {
			
			if(i%2!=0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
