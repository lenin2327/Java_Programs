package edu.exampleprograms;

import java.util.Scanner;

public class SwapWithoutVariables {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first value: ");
		int value1 = scanner.nextInt();

		System.out.println("Enter your second value: ");
		int value2 = scanner.nextInt();

		System.out.println("Before swapping :" + "firstvalue=" + value1 + " secondvalue=" + value2);
		value1 = value1 + value2;
		value2 = value1 - value2;
		value1 = value1 - value2;
		System.out.println("After Swapping :" + "firstvalue=" + value1 + " secondvalue=" + value2);

		scanner.close();

	}

}
