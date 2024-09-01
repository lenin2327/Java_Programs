package edu.exampleprograms.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {

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
		
//		int resultArraySize = array1.length+array2.length;
//		int[] resultArray = new int[resultArraySize];
		
		int[] resultArray=new int[array1.length+array2.length];
		
		int position=0;
		for(int i=0;i<array1.length;i++) {
			resultArray[position]=array1[i];
			position++;
		}	
		
		for(int i=0;i<array2.length;i++) {
			resultArray[position]=array2[i];
			position++;
		}
		System.out.println(Arrays.toString(resultArray));

		scanner.close();

	}

}
