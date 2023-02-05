package ScannerOnString;

import java.util.Scanner;

public class CharAt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the String");
		
		String st=sc.nextLine();



		char a=st.charAt(5);

		System.out.println(a);
	}


}
