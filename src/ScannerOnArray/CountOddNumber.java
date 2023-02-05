package ScannerOnArray;

import java.util.Scanner;

public class CountOddNumber {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);

		System.out.println("enter the array size");

		int size=sc.nextInt();
		System.out.println("enter value");

		int[] a=new int [size];
		int count=0;
		for (int i = 0; i < a.length; i++) {

			a[i]=sc.nextInt();

		}

		for (int i = 0; i < a.length; i++) {

			
			if(a[i]%2!=0) {
				count++;
			}

		}
		System.out.println(count);
	}

}
