/*
 * 2024-01-25-1649
 * 
 * CskimMain1.java 소스에서
 * 
 * public static void printMessage(String message) 함수에서 static 을 사용하는 이유는
 * 이 메서드를 클래스의 인스턴스를 생성하지 않고도 직접 호출할 수 있게 하기 위함입니다. 
 * 만약 'static' 키워드를 사용하지 않으면, 메서드를 호출하려면 먼저 클래스의 인스턴스를 생성해야 합니다. 
 * 
 * 아래는 'static' 키워드를 사용하지 않은 예시입니다.  
 * 
 * 개념으로 이해하면 객체 > 인스턴스 > 클래스 로 이해하면 됩니다. 
 */
package chap02;

public class CskimMain2_Using_Instance {
	// Define another method that takes a string as an argument and prints it 
	public void printMessage(String message) {
		System.out.println("입력된 문자열: " + message);
	}

	public static void main(String[] args) {

	
		// Assign the value "김철수" to the strA variable
		String varA = "김철수";
		
		// Create an instance of Example and call printMessage with strA as an argument
		CskimMain2_Using_Instance example = new CskimMain2_Using_Instance();
		example.printMessage(varA);
	}
	
}
