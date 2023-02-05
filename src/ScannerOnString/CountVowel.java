package ScannerOnString;

import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the String");

		String s=sc.nextLine();

		

		String b=s.toLowerCase();
		int count=0;

		for(int i=0; i<b.length(); i++) {

			if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u') {
				count++;

			}

		}
		System.out.println(count);



	}

}
