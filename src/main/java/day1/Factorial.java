package day1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter any required number:_");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printFactorial(n);
		System.out.println("The factorial of given num by using recursion is:" + printFactorialRecursion(n));
	}

	private static void printFactorial(int num) {
		long factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("The factorial of given num is:" + factorial);
	}

	private static int printFactorialRecursion(int num) {
		if (num == 1)

			return 1;
		else

			return num * printFactorialRecursion(num - 1);

	}

	private static void printFactorialRecursion_Memoization(int num) {

	}
}
