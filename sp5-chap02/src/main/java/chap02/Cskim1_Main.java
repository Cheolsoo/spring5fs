package chap02;

// 서버 수정 - 집에가자
public class Cskim1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Assign the value "김철수" to the strA variable
		String varA = "김철수";
		
		// Call the printMessage method and pass the strA variable as an argument 
		printMessage(varA);
	}
	
	// Define another method that takes a string as an argument and prints it ---- 집에 가자 
	public static void printMessage(String message) {
		System.out.println("입력된 문자열: " + message);
	}
}
