package ScannerOnString;

import java.util.Scanner;

public class CompareTwoString {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the first String");

		String st=sc.nextLine();
		System.out.println("enter the second String");

		String st1=sc.nextLine();
		System.out.println(st.equals(st1));
	}

}
