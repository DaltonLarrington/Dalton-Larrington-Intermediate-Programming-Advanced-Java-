/*
 * Programmer: Dalton Larrington
 * Date: 2-15-2018
 * Description: To check for safe or unsafe patterns
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecureApp {
	
	Scanner scan = new Scanner(System.in);
	
	//Will accept user input and scan each character
	System.out.print("This program checks for safe inputs. Enter some input to check: ");
	character = scan.next().charAt(0);
	
	public boolean Check () {
		
		//There must be a pattern to match the input to
		Pattern p = Pattern.compile(" ");
		Matcher m = p.matcher(" ");
		boolean b = m.matches();		 		
		
	}
	
	
	
	
	
	
}
