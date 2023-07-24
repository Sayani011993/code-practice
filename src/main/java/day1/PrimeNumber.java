package day1;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		primeNumber(takeUserInput(scanner));
		if(doContinue(scanner)){
			main(args);
		};
	}

	private static int takeUserInput(Scanner scanner){
		System.out.println("Enter a number:");
		while (!scanner.hasNextInt()) {
			System.out.println("Please enter a valid number");
			scanner.next();
		}

		return scanner.nextInt();
	}

	private static boolean doContinue(Scanner sc) {
		System.out.println("Do you want to continue? (y/n): ");
		String input = sc.next();
		return input.equalsIgnoreCase("y");
	}

	public static void primeNumber(int aNum) {


		int count = 0;
		if (aNum > 0) {
			for (int i = 2; i < aNum/2; i++) {
				System.out.println(i);
				if (aNum % i == 0) {
					count++;
					System.out.println("count:" + count);
					break;
				}
			}
			System.out.println("count:" + count);
			if (count == 0) {
				System.out.println("Given number is Prime");
			} else {
				System.out.println("Given number is not Prime");
			}
		} else {
			System.out.println("Given number is not Prime");
		}
	}

}
