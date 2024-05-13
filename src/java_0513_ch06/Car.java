package java_0513_ch06;

public class Car {
	
	// 모든 클래스는 생성자가 있는 것임 but 생략된 것
	// 자바의 생성자는 클래스 이름과 method를 만들어 놓으면 생성자가 됨 
	
	// 반환 타입이 없음에도 불구하고 에러가 나지 않음
	public Car(int tire) { // ** 생성자(클래스의 이름과 같은 메소드) --> 반환타입이 없음 **

		System.out.println("----------------------");
		System.out.println("생성자호출");
		System.out.println("타이어수 : "+ tire);
		System.out.println("----------------------");
		// self.tire = tire == python
		// self == this
		this.tire = tire; // 생성자를 통해서 인수를 입력받아서 필드값을 초기화
	}
	
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int speed;
	int maxspeed = 350;
	int tire;
	
	int[] price = {1000, 2000}; // 정수형 배열이 두개 값이 있음	
}
