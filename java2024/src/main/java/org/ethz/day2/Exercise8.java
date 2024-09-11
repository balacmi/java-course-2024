package org.ethz.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			System.out.println("How many integers is in the array?");
			int arraySize = input.nextInt();
			if (arraySize < 1) {
				System.out.println("Size of the array should be at least 1");
				//a way to terminate a program immediately
				//argument of the exit method is an integer
				//this integer is a status that can be later used to evaluate
				//the reason for termination.
				System.exit(1);
			}
			System.out.println("Input the elements of the array:");
			int[] list = new int[arraySize];
			for (int i = 0; i < arraySize; i++)
				list[i] = input.nextInt();
			
			int[] newList = removeDuplicates(list);
			System.out.println("New array is:");
			for (int x : newList)
				System.out.print(x + " ");
			input.close();
		
	}
	
	public static int[] removeDuplicates(int[] list) {
		
		int[] listTemp = new int[list.length];
		int count = 1;
		//first element is for sure not a duplicate
		listTemp[0] = list[0];
		for (int i = 1; i < list.length; i++) {
			boolean found = false;
			for (int j = 0; j < i; j++) {
				
				if (list[i] == list[j]) {
					//it is a duplicate
					found = true;
					break;
				}
			}
			if (!found) {
				//if it was not a duplicate store the element
				listTemp[count] = list[i];
				count++;
			}
		}
		//we create a new array that eliminates all
		//the unused element spaces reserved in the beginning
		int[] listNew = Arrays.copyOf(listTemp, count);
		return listNew;
		
	}

}
