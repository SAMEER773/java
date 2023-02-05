package ForLoop_WithoutBreak;
//sum of array

public class SumOfArray_12 {
	public static void main(String[] args) {
		
		int [] a= {10,20,50,48,58,47,25};
		int sum=0;
		
		
		for(int i=0; i<=a.length-1; i++) {
			
			sum=sum+a[i];
			
			
			
		}
		System.out.println(sum);
	}

}
