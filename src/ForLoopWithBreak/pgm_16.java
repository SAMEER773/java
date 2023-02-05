package ForLoopWithBreak;

public class pgm_16 {
public static void main(String[] args) {
		
		String s="Allllll the best";
		char [] a=s.toCharArray();
		int count=0;
		for(int i=0; i<a.length; i++) {
			
			if(a[i]=='l') {
				
				count++;
				
			}
			
			if(i==4) {
				break;
			}
			
		}
		System.out.println("the number of  character l is "+count);
	}


}
