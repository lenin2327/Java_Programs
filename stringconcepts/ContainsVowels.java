package edu.exampleprograms.stringconcepts;

import java.util.Scanner;

public class ContainsVowels {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("type any sentence or words: ");
		String sentence = scanner.nextLine();
		
		if(sentence.toLowerCase().matches(".*[aeiou].*")) {
			System.out.println("Vowels are presented in the sentence");
		}else {
			System.out.println("Vowels are not presented in the sentence");
		}
		scanner.close();
	}

}
