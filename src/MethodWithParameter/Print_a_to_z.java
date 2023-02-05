package MethodWithParameter;

public class Print_a_to_z {

	public static void main(String[] args) {

		alpha('a','z');
	}

	static void alpha(char a,char b) {
		for(char i=a; i<=b; i++) {
			System.out.println(i);

		}
	}


}
