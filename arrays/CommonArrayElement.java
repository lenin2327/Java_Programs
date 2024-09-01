package edu.exampleprograms.arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonArrayElement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your array size: ");
		int size = scanner.nextInt();

		int[] array1 = new int[size];
		int[] array2 = new int[size];

		System.out.println("Enter your first array values: ");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = scanner.nextInt();
		}
		System.out.println("Enter your second array values: ");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = scanner.nextInt();
		}
		System.out.println("First array values are: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("Second array values are: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array2[i]);
		}

		Set<Integer> set1 = new HashSet<>();
		for (int number : array1) {
			set1.add(number);
		}

		Set<Integer> commonElement = new HashSet<>();
		for (int result : array2) {
			if (set1.contains(result)) {
				commonElement.add(result);
			}
		}

		System.out.println("Common elements are:" + commonElement);

		scanner.close();

	}

}
