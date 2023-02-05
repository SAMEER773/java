package String;

public class Split {
	public static void main(String[] args) {
		
		String st="Java was originally developed by James Gosling at Sun Microsystems. It was released in May 1995 as a core component of Sun Microsystems' Java platform. The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses";
String [] str=st.split(" ");

for (String a:str) {
	
	System.out.println(a);
	
}
	}

}
