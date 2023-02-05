package DoWhileLoop;

public class Fact {

	public static void main(String[] args) {


		int a=6;
		int fact=1;
		do {

			fact=fact*a;

			a--;

		}while(a>=1);
		System.out.println(fact);
	}

}
