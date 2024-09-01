package edu.exampleprograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your factorial value");
		int input = scanner.nextInt();

		int factoril = 1;
		for (int i = 1; i <= input; i++) {
			factoril = factoril * i;
		}
		System.out.println("Your factorial values are :" + factoril);
		scanner.close();
	}

}
