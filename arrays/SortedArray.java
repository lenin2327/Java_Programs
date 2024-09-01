package edu.exampleprograms.arrays;

import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your array size: ");
		int size = scanner.nextInt();

		System.out.println("Enter your values : ");
		int[] values = new int[size];

		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}

		System.out.println("Your array values are :");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " ");
		}

		System.out.println("After sorting this array: ");
		int temp = 0;
		for (int i = 0; i < values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] > values[j]) {
					temp = values[i];
					values[i] = values[j];
					values[j] = temp;
				}
			}
		}
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i]+" ");
		}

		scanner.close();
	}

}
