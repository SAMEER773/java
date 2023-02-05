package ScannerOnString;

import java.util.Scanner;

public class SwapString {
	
    public static void main(String[] args)
    {
       
        Scanner scan = new Scanner(System.in);
        String str1, str2, temp; 
         
        System.out.println("First String : ");
        str1 = scan.nextLine();
        System.out.println("Second String : ");
        str2 = scan.nextLine();
        
        System.out.println("Before Swapping :");
        System.out.println("Str1 = " +str1);
        System.out.println("Str2 = " +str2);
        
        temp = str1;
        str1 = str2;
        str2 = temp;
        
        System.out.println("After Swapping :");
        System.out.println("Str1 = " +str1);
        System.out.println("Str2 = " +str2);
    }

}
