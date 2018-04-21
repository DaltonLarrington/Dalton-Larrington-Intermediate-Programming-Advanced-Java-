/*
 * Programmer: Dalton Larrington
 * Date: 4-15-2018
 * Description: JUnit Testing using multiple methods
 */

package JUnitStuff;

import org.junit.Test;

public class JUnitTestingMain {	

	public int addInts(int x, int y) {
		
		return  x + y;	
		
	}
	
	public String addStrings(String x, String y) {
		
		return "String x " + "String y";
		
	}
	
	public String findLen(String x) {
		
		return "String x";
		
	}
	
	public int divXbyY(int x, int y) {
		
		return x / y;		
		
	}
	
	public int[] reverseIntArray(int[] x) {
		
		return x;		
		
	}
	
	public int[] range0(int[] x) {		
		
		int[] range = {7};
		return range;
		
	}		
	
	public int[] range1(int[] x) {
		
		int [] range = {7, 8};
		return range;
		
		
	}
	
	public int[] range2(int[] x, int[] y) {		
		
		int[] range = {7, 8};		
		return range;			
		
	}

}
