package ScannerOnString;

import java.util.Scanner;

public class Cocatenate {
	
	   public static void main(String args[])
	   {
	      String str1, str2;
	      Scanner scan = new Scanner(System.in);
	 
	      System.out.println("Enter First String : ");
	      str1 = scan.nextLine();
	      System.out.println("Enter Second String : ");
	      str2 = scan.nextLine();
	      
	      System.out.println("Concatenating String 2 into String 1");
	      str1 = str1.concat(str2);
	          
	      System.out.println("String 1 after Concatenation is " +str1);
	   }

}
