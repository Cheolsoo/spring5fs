package chap02;

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

// 요기는 로컬에서 수정한 부분
// 이제 commit & push 할 때 어떻게 될까???