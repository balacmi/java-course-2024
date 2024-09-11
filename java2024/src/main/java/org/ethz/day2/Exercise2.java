package org.ethz.day2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		System.out.println("Please input the year and first three letters of the month.");
		System.out.println("First letter of the month must be a capital letter.");
		
		Scanner input = new Scanner(System.in);
		
		int year = input.nextInt();
		String month = input.next();
		
		//test if year is a leap year
		boolean isLeapYear = isLeapYear(year);
		
		switch (month) {
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":	 System.out.println("Number of days is 31"); 
					 break;
		case "Apr" :		
		case "Jun" :		
		case "Sep" :		
		case "Nov" : System.out.println("Number of days is 30"); 
		 			 break;
		case "Feb" : if (isLeapYear)
						System.out.println("Number of days is 29"); 
					 else
						System.out.println("Number of days is 28");
		 		     break;		
		
		default : System.out.println("You did not input the correct month name."); 
		}
		input.close();		
	}

	public static boolean isLeapYear(int year) {
		
		boolean isLeapYear = false;
		
		if (year % 4 == 0) {			
			if (year % 100 != 0 || year % 400 == 0)
				isLeapYear = true;			
		}		
		return isLeapYear;
	}	
}
