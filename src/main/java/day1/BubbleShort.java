package day1;

import java.util.Arrays;
import java.util.List;

public class BubbleShort {

	public static void main(String[] args) {
		int a[] = { 8, 7, 4, 9, 3, 2 };
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		printArr(a);
		

	}

	public static void printArr(int a[]) {
		System.out.print("After shorting:");
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
