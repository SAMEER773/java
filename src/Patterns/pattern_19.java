package Patterns;

public class pattern_19 {
public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) {
			
			
			for(int j=1; j<=5; j++) {
				if((i<=2&&j==3)||(i>=5&&j==3)) {
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
