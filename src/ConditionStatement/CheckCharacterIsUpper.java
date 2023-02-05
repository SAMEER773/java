package ConditionStatement;

public class CheckCharacterIsUpper {
	public static void main(String[] args) {
		
		char c='A';
		
		if(Character.isUpperCase(c)) {
			System.out.println("the given character is upper case");
		}
		else
		{
			System.out.println("the given character is lower case");
		}
	}

}
