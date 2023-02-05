package String;

public class ReversString_2 {
	
	public static void main(String[] args) {
		
		String s="Hello Java";
		char [] ab=s.toCharArray();
		
		for(int i=ab.length-1; i>=0; i--) {
			
			System.out.print(ab[i]);
			
		}
	}

}
