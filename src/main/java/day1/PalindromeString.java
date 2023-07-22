package day1;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		palindromeStr();

	}

	public static void palindromeStr() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.next();
		String orgstr = str;
		String revstr = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);
		}
		if (orgstr.equals(revstr)) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is not Palindrome");
		}
	}

}
