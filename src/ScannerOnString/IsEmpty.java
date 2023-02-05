package ScannerOnString;

import java.util.Scanner;

public class IsEmpty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter 1st  String");

		String st=sc.nextLine();
		System.out.println("enter 2nd  String");
		String str=sc.nextLine();



		System.out.println(st.isEmpty());
		System.out.println(str.isEmpty());
	}


}
