/*
 * Programmer: Dalton Larrington
 * Date: 4-15-2018
 * Description: JUnit Testing using multiple methods
 */

package JUnitStuff;

import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitTesting {
	
	@Test
	public void addIntsTest() {		
		JUnitTestingMain jt = new JUnitTestingMain();
		int x = 1;
		int y = 5;
		expected = 6;
		add = jt.addInts(int x, int y)
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
	
	

}
