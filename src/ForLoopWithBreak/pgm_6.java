package ForLoopWithBreak;

public class pgm_6 {
	
	public static void main(String[] args) {
		
		int fact=1;
		
		for(int i=1; i<=6; i++) {
			
			fact=fact*i;
			
			if(i==3) {
				break;
			}
			
			
			
		}
		System.out.println(fact);
		
	}

}
