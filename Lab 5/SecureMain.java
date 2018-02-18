import java.io.IOException;

public class SecureMain {

	public static void main(String[] args) {
		
		  String linestoCheck = "int x = 0"
				+ "0x21 0x14 0x8A 0x3E"
				+ "50134";
		
		if(linestoCheck.contains("")) {
			
			System.out.println("Unsafe");
			
		}	
		
		if(linestoCheck.contains("")) {
			
			System.out.println("Safe");
			
		}

	}

}
