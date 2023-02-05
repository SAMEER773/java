package ForLoopWithBreak;

public class pgm_11 {
	public static void main(String[] args) {
		
		String a="abcdefghik";
		String b="d";
		
		for(int i=b.length(); i<=a.length(); i++) {
			
			System.out.println(i);
			if(i==5) {
				break;
			}
			
		}
	}

}
