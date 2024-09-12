package org.ethz.day4.exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise2 {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Please provide the input file name: ");
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();
		scanner.close();
		File file = new File(fileName);
		
		scanner = new Scanner(file);
		
		final Character[] SET_VALUES = new Character[] { 'a', 'e', 'i', 'o', 'u' };
		final Set<Character> MY_SET = new HashSet<Character>(Arrays.asList(SET_VALUES));	
		int vowels = 0;
		int consonants = 0;
		
		while(scanner.hasNextLine()) {
			
			String line = scanner.nextLine();
			
			for (char c : line.toCharArray()) {
				char lowercaseCharacter = Character.toLowerCase(c);
				if (MY_SET.contains(lowercaseCharacter)) {
					
					vowels++;
				}
				else if (lowercaseCharacter >= 'a' && lowercaseCharacter <= 'z')
					consonants++;
				
			}
		}
		
		scanner.close();
		
		System.out.println("Number of vowels is: " + vowels + " and number of consonants is: " + consonants);
	}

}
