package day1;

public class DupString {

	public static void main(String[] args) {
		String str = "Sayani";
		String newstr = " ";
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (newstr.indexOf(ch) == -1) {
				newstr += ch;
			}
		}
		System.out.println(newstr);
	}
}
