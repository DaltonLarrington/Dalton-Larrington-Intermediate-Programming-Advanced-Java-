/*
 * Programmer: Dalton Larrington
 * Date: 1-19-18
 * Description: To accept input to test Fibonacci sequence
 */

public class Fibonaccisequence {

	public static void main(String[] args) {		

		int Number1 = 0;		
		int Number2 = 1;
		int Number3;		
		int count = 100;
		int i;

		System.out.print(Number1 + Number2);

		for (i = 2; i < count; i++) {

			Number3 = Number1 + Number2;

			System.out.println(Number3);

			Number1 = Number2;
			Number2 = Number3;

		}

	}

}
