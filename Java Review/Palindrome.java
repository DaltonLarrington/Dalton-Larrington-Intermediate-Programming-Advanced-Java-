/*
 * Programmer: Dalton Larrington
 * Date: 1-19-18
 * Description: To check a word to see if it is a palindrome
 */

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {		
				
		Scanner oScan = new Scanner(System.in);
		
		String firstWord, reverse = "";
		
		/*
		 * I found this interesting way to find the reverse
		 * of a word. 
		 */
		
		System.out.println("Enter a word to check for palindrome: ");
		firstWord = oScan.nextLine();
		
		int stringLength = firstWord.length();
		
		for (int i = stringLength - 1; i >= 0; i--)
			
			reverse = reverse + firstWord.charAt(i);
		
		if (firstWord.equals(reverse))
			
			System.out.println(firstWord + " is a palindrome.");
		
		else 
			
			System.out.println(firstWord + " is not a palindrome.");
		
	}

}
