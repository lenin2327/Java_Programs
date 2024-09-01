package edu.exampleprograms;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your fav values: ");
		int value = scanner.nextInt();
		for (int i = 1; i <= value; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		scanner.close();
	}
}
