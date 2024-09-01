package edu.exampleprograms;

import java.util.*;

public class FibonaciNUmber {
	public static void generateFibonaciSeries(int range) {
		int result;
		int firstValue = 0, secondValue = 1;
		for (int i = 0; i < range; i++) {
			System.out.print(firstValue + " ");
			result = firstValue + secondValue;
			firstValue = secondValue;
			secondValue = result;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fibonaci Series ");
		System.out.println("Enter your range :");
		int range = scanner.nextInt();
		generateFibonaciSeries(range);
		scanner.close();
	}

}
