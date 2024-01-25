package chap02;

public class CskimMain3_Using_Another_Class_File {

	public static void main(String[] args) {
		// Assign the value "김철수" to the strA variable
		String varA = "김철수";
		
		// Create an instance of PrintMessage class 
		CskimMain3_PrintMessage printer = new CskimMain3_PrintMessage();
		
		// Call the printMessage method from the CskimMain3_PrintMessage class and 
		// pass strA as an argument
		printer.printMessage(varA);
		
	}	
}
