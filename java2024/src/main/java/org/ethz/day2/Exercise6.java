package org.ethz.day2;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String password = input.next();
		
		
		if (isPasswordValid(password))
			System.out.println("Password is valid!");
		else
			System.out.println("Password is not valid!");

		input.close();
		
	}
	
	public static boolean isPasswordValid(String password) {
		
		boolean passwordLengthCorrect = false;
		
		if (password.length() >= 8) 
			passwordLengthCorrect = true;
		
		boolean hasDigit = false;
		boolean hasDot = false;
		for( int i = 0; i < password.length(); i++) {
			
			if ('0' <= password.charAt(i) && password.charAt(i) <= '9') 
				hasDigit = true;				
			
			if (password.charAt(i) == '.') 				
				hasDot = true;		
			
		}				
		return passwordLengthCorrect & hasDigit & !hasDot;
	}

}
