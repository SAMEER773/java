package Patterns;

public class pattern_18 {
	
public static void main(String[] args) {
		
		for(int i=1; i<=8; i++) {
			
			
			for(int j=1; j<=8; j++) {
				if((i==1&&j==1)||(i==8&&j==1)||(i==3&&j>=3)||(i==4&&j==3)||(i==5&&j==3)||(i==6&&j==3)||(i==6&&j==4)||(i==6&&j==5)||(i==6&&j==6)) {
					System.out.print("  ");
					
					}
				
				
				else {
					System.out.print(" *");
				}
				
			}
			System.out.println();
			
		}
	}

}
