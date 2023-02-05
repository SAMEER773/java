package ForLoopWithBreak;

public class pgm_7 {
	public static void main(String[] args) {

		int sum=0;

		for(int i=0; i<=100; i++) {
			sum=sum+i;
			if(i==80) {
				break;
			}

		}
		System.out.println(sum);
	}

}
