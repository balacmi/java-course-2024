package org.ethz.day2;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
		if (number < 0)
			number *= -1;
		while (number != 0) {
			System.out.println("Sum of all digits of the number " + 
				number + " is: " + sumDigits(number));
			number = input.nextLong();
		}		
		input.close();
	}
	
	public static int sumDigits(long n) {
		
		int sum = 0;		
		while (n > 0) {			
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
