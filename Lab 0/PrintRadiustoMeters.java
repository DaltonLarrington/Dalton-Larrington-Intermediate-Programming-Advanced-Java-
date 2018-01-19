/* 
 * Programmer: Dalton Larrington
 * Date: 1-14-18
 * Description: To convert the radius of a circle and convert to meters
 */

import java.util.Scanner;

public class PrintRadiustoMeters {

	public static void main(String[] args) {
		
		Scanner oScan = new Scanner(System.in);
				
		System.out.print("Enter a radius (Meters) of a circle: ");
		double Convert = oScan.nextDouble();
		
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(Convert, 3);
		
		System.out.println("The volume of the sphere is: " + volume);
		
	}

}
