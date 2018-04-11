package JUnitStuff;

import org.junit.Test;

public class KitchenSink {
	
	public String greet(String name) {
		
		return "Hello, " + name + "!";		
		
	}
	
	public String greetLoudly(String name) {		
		
		return greet(name).toUpperCase();		
		
	}
	
	public int intLog(double value) {
		double result = Math.log10(value);
		return (int) result + 1;
		
	}

}
