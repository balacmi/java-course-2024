package org.ethz.day2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		System.out.println("Input the names of three cities.");
		Scanner input = new Scanner(System.in);
		
		String city1 = input.next();
		String city2 = input.next();
		String city3 = input.next();
		
		if (city1.compareTo(city2) < 0 && city2.compareTo(city3) < 0) {
			System.out.println("Alphabetic order is: " + city1 + " " +
					city2 + " " + city3);			
		}
		else if (city1.compareTo(city3) < 0 && city3.compareTo(city2) < 0) {
			System.out.println("Alphabetic order is: " + city1 + " " +
					city3 + " " + city2);			
		}
		else if (city2.compareTo(city1) < 0 && city1.compareTo(city3) < 0) {
			System.out.println("Alphabetic order is: " + city2 + " " +
					city1 + " " + city3);			
		}
		else if (city2.compareTo(city3) < 0 && city3.compareTo(city1) < 0) {
			System.out.println("Alphabetic order is: " + city2 + " " +
					city3 + " " + city1);			
		}
		else if (city3.compareTo(city2) < 0 && city2.compareTo(city1) < 0) {
			System.out.println("Alphabetic order is: " + city3 + " " +
					city2 + " " + city1);			
		}
		else if (city3.compareTo(city1) < 0 && city1.compareTo(city2) < 0) {
			System.out.println("Alphabetic order is: " + city3 + " " +
					city1 + " " + city2);			
		}
		
		input.close();
	}
}
