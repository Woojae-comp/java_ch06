package java_0513_ch06;

public class Calculator {
// 계산기 클래스를 생성함
// 필드와 메써드를 생성할 수 있음
	
	
	//속성 or 필드
	int firstNum;
	int secondNum;
	
	// 메소드 // python 경우 
	// def add(firstNum, scondNum):
	// 		firstNum + secondNum
	// 		return
	// add(10, 20) -> 30 
	
	
	// java의 경우
	// **매개변수 생성할 때, 타입 설정 필요**
	// public 다음에 retrun 값의 형태를 써줘야함 int, double, string
	// 배열 반환할 때는 int[]
	
	// public 반환하는 값의 type methodname
	public int add(int first, int second) {
		int sum = first + second;
		return sum;
	}
	
	public int sub(int first, int second) {
		int sub = first - second;
		return sub;
	}
	
	public int mul(int first, int second) {
		int mul = first * second;
		return mul;
	}
	
	public double div(double first, int second) {
		return first / second;
	}

	// 매개변수 숫자만 다르게 하면 가능
	public int pow(int first) {
		int pow = first * first;
		return pow;
	}
	
	public int pow(int first, int second) { // Overloading
		int pow = first * first + second * second;
		return pow;
	}
	// main 함수가 없기 때문에 수행을 못함 - 설계도만 만든 것임
	// 집을 만드는 클래스는 module
}
