package ForLoopWithBreak;

public class pgm_13 {

	public static void main(String[] args) {
		
		int a=100;
		double sum=0;
for(int i=0; i<=a; i++) {
	
	sum=sum+i;
					
		if(i==80) {
			break;
		}
	
	}
double avg=sum/a;
System.out.println(avg);

}
}
