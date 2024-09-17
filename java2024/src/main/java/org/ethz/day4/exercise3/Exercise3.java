package org.ethz.day4.exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) throws FileNotFoundException {

		Map<String, Integer> boys = new HashMap<String, Integer>();	
		Map<String, Integer> girls = new HashMap<String, Integer>();	

		File file = new File(args[0]);
		
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNextLine()) {
			
			String line = scanner.nextLine();
			//this way we can split the string that has any number of whitespaces between the columns
			String[] arrayLine = line.split("\\s+"); 
			
			boys.put(arrayLine[1], Integer.parseInt(arrayLine[0]));
			girls.put(arrayLine[3], Integer.parseInt(arrayLine[0]));

		}
		
		scanner.close();
		
		scanner = new Scanner(System.in);
		System.out.println("Please input a name and gender (m or f) or \"exit\" to exit.");

		while(true) {
			String nextLine = scanner.nextLine();
		
			if (nextLine.equals("exit"))
				break;
			else {
				String[] nextLineArray = nextLine.split("\\s");
				if (nextLineArray[1].equals("m")) {
					if (boys.containsKey(nextLineArray[0]))
						System.out.println(boys.get(nextLineArray[0]));
					else
						System.out.println("Name is not in the registry!");
				}
				else if (nextLineArray[1] .equals("f")) {
					if (girls.containsKey(nextLineArray[0]))
						System.out.println(girls.get(nextLineArray[0]));
					else
						System.out.println("Name is not in the registry!");
				}
				else
					System.out.println("Please input the correct gender.");

			}
		}		
		scanner.close();		
	}
}
