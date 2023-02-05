package String;

public class Trim {

	public static void main(String[] args) {
		String a="   Musk has made controversial statements on politics and technology, particularly on Twitter, and is a polarizing figure. He has also been criticized for making unscientific and misleading statements, such as spreading COVID-19 misinformation";

		System.out.println(a.length());

		String b=a.trim();

		System.out.println(b.length());

		System.out.println(a);
		System.out.println(b);



	}

}
