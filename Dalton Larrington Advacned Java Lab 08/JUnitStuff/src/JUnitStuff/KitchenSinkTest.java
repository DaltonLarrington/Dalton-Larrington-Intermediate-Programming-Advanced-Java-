package JUnitStuff;

import static org.junit.Assert.*;
import org.junit.Test;

public class KitchenSinkTest {
	
	@Test	
	public void greetTest(){
		KitchenSink ks = new KitchenSink();
		String name = "Dalton";		 
		String greeting = ks.greet(name);
		String expected = "Hello, Dalton!";		
		assertEquals(expected, greeting);		
		
	}
	
	@Test	
	public void greetLengthTest(){
		KitchenSink ks = new KitchenSink();
		String name = "Dalton";	
		Long expected = (long) 14;
		Long greeting = (long) ks.greet(name).length();
		//Long expected = (long) "Hello, Dalton".length();		
		assertEquals(expected, greeting);		
		
	}
	
	
	@Test	
	public void greetLoudlyTest(){
		KitchenSink ks = new KitchenSink();
		String name = "Dalton";		 
		String greeting = ks.greetLoudly(name);
		String expected = "HELLO, DALTON!";		
		assertEquals(expected, greeting);		
		
	}

	@Test
	public void intLogTest() {
		KitchenSink ks = new KitchenSink();
		Long expected = (long) 4;
		int input = 4505;
		Long actual = (long) ks.intLog(input);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void intLogTest2() {
		KitchenSink ks = new KitchenSink();
		Long expected = (long) 5;
		int input = 45051;
		Long actual = (long) ks.intLog(input);
		assertEquals(expected, actual);
		
	}

}
