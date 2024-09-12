package org.ethz.day4.exercise4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner input = new Scanner(file);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(input.hasNext())
			list.add(input.nextInt());		
		
		input.close();
		
		sort(list);
		
		for (Integer i : list) 
			System.out.print(Integer.toString(i) + " ");		
	}

	/**
	 * A very simple sorting algorithm.
	 * 
	 * @param list
	 */
	private static void sort(ArrayList<Integer> list) {

		for (int i = 0; i < list.size() - 1; i++)
			for (int j = i + 1; j < list.size(); j++) {
				
				if (list.get(i) > list.get(j)) {
					
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}		
	}
}
