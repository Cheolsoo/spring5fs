package chap02;

// 서버에서는 CskimMain1 으로 한번 더 수정 후 커밋
public class CskimMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Assign the value "김철수" to the strA variable
		String varA = "김철수";
		
		// Call the printMessage method and pass the strA variable as an argument 
		printMessage(varA);
	}
	
	// Define another method that takes a string as an argument and prints it 
	public static void printMessage(String message) {
		System.out.println("입력된 문자열: " + message);
	}
}
