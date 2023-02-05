package String;

public class Count_Consonants_13 {
	public static void main(String[] args) {

		String s="365 days of self discipline";

		String b=s.toLowerCase();
		int count=0;

		for(int i=0; i<b.length(); i++) {

			if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u'||b.charAt(i)==' ') {
				

			}
			else {
				count++;
			}

		}
		System.out.println(count);



	}

}
