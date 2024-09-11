package org.ethz.day2;

import java.util.Scanner;

public class Exercise7 {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please input the score. Input a negative number to end the read-in.");
		double[] scores = new double[100];
		
		double number = input.nextDouble();
		int counter = 0;		
		while (number >= 0) {
			
			scores[counter] = number;
			number = input.nextDouble();
			counter++;
		}
		//at this point counter has the value of the number of 
		//score stored in the array and it might
		//be lower than 100!
		double sum = 0;
		for (int i = 0; i < counter; i++) {
			
			sum += scores[i];
		}
		double avg = sum / counter;
		
		int numberBelowAvg = 0;
		
		for (int i = 0; i < counter; i++) 
			if (scores[i] < avg)
				numberBelowAvg++;
		System.out.println("Number of scores below average is: " + numberBelowAvg);
		System.out.println("Number of scores above or equal to average is: " 
				+ (counter - numberBelowAvg));

		input.close();
	}

}
