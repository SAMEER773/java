package ScannerOnString;

import java.util.Scanner;

public class CopyString {
	
	   public static void main(String args[])
	   {
	      String strOrig;
	      Scanner scan = new Scanner(System.in);
	 
	      System.out.print("Enter a String : ");
	      strOrig = scan.nextLine();
	      
	      System.out.print("Copying String...\n");
	      
	      String strCopy = new String(strOrig);
	      
	      System.out.println("String Copied Successfully.");      
	      System.out.print("The Copied String is " + strCopy);
	   }

}
