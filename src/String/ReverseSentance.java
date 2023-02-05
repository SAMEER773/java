package String;

public class ReverseSentance {
	
public static void main(String[] args) {
		
		String a="all the best";
		String[]b=a.split(" ");
		for (int i =b.length-1; i>=0; i--) {
			System.out.print(b[i]+" ");
			
		}
		
		
	}

}
