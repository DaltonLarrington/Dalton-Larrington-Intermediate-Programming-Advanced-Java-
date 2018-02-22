import java.util.Scanner;

/*
 * Programmer: Dalton Larrington
 * Date: 2-17-18
 * Description: To check for safe or unsafe data
 */
public class SecureMain {

	public static void main(String[] args) {
		
		Scanner oScan = new Scanner(System.in);
		
		String string = " ";
		
		System.out.print("Enter a string to santize: ");
		
		if(oScan.hasNext("0")) {				
			string = oScan.next();
			System.out.println("Unsafe data");
			
		}
		
		if(oScan.hasNext("#0")) {
			string = oScan.next("Unsafe data");
			
		}
		
		if(oScan.hasNext(";")) {
			string = oScan.next("Unsafe data");
			
		}
		
		if(oScan.hasNext("'")) {
			string = oScan.next("Unsafe data");
		}
		
		else {
			
			System.out.println("Safe data");
			
		}
		
	}

}
