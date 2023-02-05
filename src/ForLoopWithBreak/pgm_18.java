package ForLoopWithBreak;

public class pgm_18 {
	
	public static void main(String[] args) {
		
		String s="Hello Java";
		char [] ab=s.toCharArray();
		
		for(int i=ab.length-1; i>=0; i--) {
			
			System.out.print(ab[i]);
			if(i==7) {
				break;
			}
		}
		
	}

}
