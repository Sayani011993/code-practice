package day1;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		primeNumber();

	}

	public static void primeNumber() {
		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("Given number is Prime");
			} else {
				System.out.println("Given number is not Prime");
			}
		} else {
			System.out.println("Given number is not Prime");
		}
	}

}
