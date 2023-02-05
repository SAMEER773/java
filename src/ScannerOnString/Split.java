package ScannerOnString;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 1st  String");
		
		String st=sc.nextLine();

		String [] str=st.split(" ");

		for (String a:str) {

			System.out.println(a);

		}
	}

}
