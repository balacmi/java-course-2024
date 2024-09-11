package org.ethz.day2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		char ch = input.next().charAt(0);		
		int n = ch;
		//we want to convert n to hex representation
		System.out.println("\\" + Integer.toHexString(n));	
		input.close();
	}

}
