package edu.exampleprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int inputnumber) {
		if (inputnumber == 0 && inputnumber == 1) {
			return false;
		}
		if (inputnumber == 2) {
			return true;
		}
		if(inputnumber%2==0) {
			return false;
		}
//		for (int i = 2; i <= inputnumber; i++) {
//			System.out.println(i);
//			if (inputnumber % i == 0) {
//				return false;
//			}
//		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any number: ");
		int inputnumber = scanner.nextInt();

		if (isPrime(inputnumber)) {
			System.out.println("It's a prime number: ");
		} else {
			System.out.println("Its not a prime :");
		}
		scanner.close();
	}

}
