package edu.exampleprograms.arrays;

import java.util.Scanner;

public class MaxArrayValue {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your array size: ");
		int size = scanner.nextInt();

		int[] marks = new int[size];
		System.out.println("Enter your values: ");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = scanner.nextInt();
		}
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		System.out.println("");

		int maxValue = marks[0];
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] > maxValue) {
				maxValue = marks[i];
			}
		}
		System.out.println("Your maximum value is: "+maxValue);

		scanner.close();

	}

}
