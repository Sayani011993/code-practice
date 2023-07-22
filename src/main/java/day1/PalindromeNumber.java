package day1;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		palindrommNum();
	}

	public static void palindrommNum() {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int orgnum = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (orgnum == rev) {
			System.out.println("Given number is Palindrome");
		} else {
			System.out.println("Given number is not Palindrome");
		}
	}
}
