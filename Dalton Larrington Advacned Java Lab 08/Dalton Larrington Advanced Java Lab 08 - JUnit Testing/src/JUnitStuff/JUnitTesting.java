/*
 * Programmer: Dalton Larrington
 * Date: 4-15-2018
 * Description: JUnit Testing using multiple methods
 */

package junitstuff;

import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitTesting {
	
	@Test
	public void addIntsTest() {		
		JUnitTestingMain jt = new JUnitTestingMain();
		int x = 1;
		int y = 5;
		int expected = 6;
		int add = jt.addInts(x, y);
		assertEquals(expected, add);		
		
	}
	
	@Test
	public void addStringsLengthTest() {
		JUnitTestingMain jt = new JUnitTestingMain();
		String x = "Hello, ";
		String y = "Dalton";
		Long expected = (long) 17;
		Long greeting = (long) jt.addStrings(x, y).length();
		assertEquals(expected, greeting);		
		
	}
	
	@Test
	public void findLenTest() {
		JUnitTestingMain jt = new JUnitTestingMain();
		String x = "Hello";
		Long expected = (long) 8;
		Long greeting = (long) jt.findLen(x).length();
		assertEquals(expected, greeting);
		
	}
	
	@Test
	public void divXbyY() { 
		JUnitTestingMain jt = new JUnitTestingMain();
		int x = 1;
		int y = 5;
		int expected = 0;
		int divide = jt.divXbyY(x, y);
		assertEquals(expected, divide);
		
		
	}
	
	

}
