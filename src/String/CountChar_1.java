package String;

public class CountChar_1 {
	public static void main(String[] args) {
		
		String s="All the best";
		char [] a=s.toCharArray();
		int count=0;
		for(int i=0; i<a.length; i++) {
			
			if(a[i]=='l') {
				
				count++;
				
			}
			
		}
		System.out.println("the number of  character l is "+count);
	}

}
