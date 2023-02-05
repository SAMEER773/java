package String;

public class ReplaceFirst {
	 public static void main(String[] args) {
	      String str1 = "aabbaaac";
	      String str2 = "Learn223Java55@";

	     
	      String a = "\\d+";

	     
	      System.out.println(str1.replaceFirst("aa", "zz"));

	      
	      System.out.println(str2.replaceFirst(a, " "));  
	  }

}
