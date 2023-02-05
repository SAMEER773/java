package ConditionStatement;

public class WebSiteCheck {
	
	public static void main(String[] args) {
		
		String WebSite="www.abc.com";
		
		if(WebSite.endsWith(".com")) {
			System.out.println("this is commercial website");
			
		}
		else if(WebSite.endsWith(".org")) {
			System.out.println("this is organizational website");
			
		}
		else {
			System.out.println("this is indian website");
		}
	}

}
