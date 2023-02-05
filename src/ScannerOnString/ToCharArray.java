package ScannerOnString;

import java.util.Scanner;

public class ToCharArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter 1st  String");

		String st=sc.nextLine();



		char [] a=st.toCharArray();

		for (char c:a) {

			System.out.println(c);


		}

	}

}
