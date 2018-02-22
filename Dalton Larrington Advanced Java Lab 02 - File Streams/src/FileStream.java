import java.io.*;
import java.util.Scanner;

/*
 * Stream Output
 * Programmer: Dalton Larrington
 * Date: 1-28-18
 * Description: To accept simple user string
 * and output strings to a .txt file
 */

public class FileStream {

	public static void main(String[] args) {
		
		// Converts byte streams to character streams
		InputStreamReader isr = new InputStreamReader(System.in);
		
		// Buffers the information for each time a I/O is called
		BufferedReader br = new BufferedReader(isr);
		
		// Prints a string. Null is printed if nothing is entered.
		String str = null;
			
		try {
			
			// Reads the input from System.out to print to .txt file
			System.out.println("Enter an ingredient (Enter a blank line when done): ");
			str = br.readLine();
			
			// Creates the .txt file and closes the program
			PrintWriter writer = new PrintWriter("recipe.txt");
			writer.print(str);							
			writer.close();
				
		
			
			
			} catch (IOException e) {	
				
								
			}		
	}
	
}


