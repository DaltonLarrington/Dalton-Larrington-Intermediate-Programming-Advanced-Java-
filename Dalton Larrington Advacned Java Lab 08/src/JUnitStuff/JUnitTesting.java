/*
 * Programmer: Dalton Larrington
 * Date: 4-15-2018
 * Description: JUnit Testing using multiple methods
 */

package JUnitStuff;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
	public void divXbyYTest() {
		JUnitTestingMain jt = new JUnitTestingMain();
		int x = 2;
		int y = 1;
		int expected = 2;
		int div = jt.divXbyY(x, y);
		assertEquals(expected, div);		
		
	}
	
	@Test
	public void reverseIntArrayTest() {
		JUnitTestingMain jt = new JUnitTestingMain();
		int[] x = {1, 3, 5, 6, 6, 5, 3, 1};
		int expected = 2;
		int[] array = jt.reverseIntArray(x);
		assertEquals(expected, array);			
		
	}
	
	@Test
	public void range0Test() {
		JUnitTestingMain jt = new JUnitTestingMain();
		int[] x = {7};
		int[] expected = {7};
		int[] range = jt.range0(x);
		assertEquals(expected, range);				
		
	}
	
	@Test
	public void range1Test() {
		JUnitTestingMain jt = new JUnitTestingMain();
		int[] x = {7, 8};
		int[] expected = {7, 8};
		int[] range = jt.range1(x);
		assertEquals(expected, range);		
		
	}
	
	@Test
	public void range2Test() {
		JUnitTestingMain jt = new JUnitTestingMain();
		int[] x = {7, 8};		
		int z = 1;
		int[] expected = {7, 8};		
		int[] range = jt.range2(x, range);
		int addOne = jt.range2(z);
		assertEquals(expected, range);
		
		
	}
	
	
	
	

}
