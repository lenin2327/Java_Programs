package edu.exampleprograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static boolean isArmstrong(int input) {
		int originalvalue = input;
		int remainder = 0;
		int sum = 0;
		while (input > 0) {
			remainder = input % 10;
			sum = sum + (remainder * remainder * remainder);
			input = input / 10;
		}

		return originalvalue == sum;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your number :");
		int input = scanner.nextInt();

		if (isArmstrong(input)) {
			System.out.println("This is armstrong number :");
		} else {
			System.out.println("This is not armstrong number :");
		}

		scanner.close();
	}

}
