package ConditionStatement;

public class IncomeTaxSlab {

	public static void main(String[] args) {


		int Income=250000;

		if(Income>=250000 && Income<500000 ) {
			System.out.println("tax slab is 5%");


		}
		else if(Income>=500000 && Income<1000000 ) {

			System.out.println("tax slab is 20%");
		}
		else {
			System.out.println("tax slab is 30%");
		}
	}

}
