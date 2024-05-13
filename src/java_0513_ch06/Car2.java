package java_0513_ch06;

public class Car2 {
	
	// 매개변수 X
	public Car2() { // 기본생성자가 실제로는 있지만 생략되어 있던 것
		// 다른 생성자 있을 경우에 생략을 해버리면, 나머지만 되어버림
		// 생성자가 두개임에도 에러가 나지 않음
		// 생성자 Overloading
		
	}

	
// **** 매개변수를 다르게 해서 여러개로 만들 수 있음(Overloading/ 특성 중에 하나) ****
	public Car2(String company, String model, String color){
		System.out.println("----------------------");
		System.out.println("생성자호출");
		System.out.println("----------------------");
		this.company = company; // 생성자를 통해서 인수를 입력받아서 필드값을 초기화
		this.model = model; // 생성자를 통해서 인수를 입력받아서 필드값을 초기화
		this.color = color; // 생성자를 통해서 인수를 입력받아서 필드값을 초기화
	}
// 개수가 달라져야 순서바뀌는 것은 의미가 없음 --> 순서 중요	
	
	
	// 매개변수 O
	public Car2(String company, String model, String color, int maxspeed){
		System.out.println("----------------------");
		System.out.println("생성자호출");
		System.out.println("----------------------");
		this.company = company; // 생성자를 통해서 인수를 입력받아서 필드값을 초기화
		this.model = model; // 생성자를 통해서 인수를 입력받아서 필드값을 초기화
		this.color = color; // 생성자를 통해서 인수를 입력받아서 필드값을 초기화
		this.maxspeed = maxspeed; // 생성자를 통해서 인수를 입력받아서 필드값을 초기화
	}
	
	// 생성자는 여러개 만들 수 있음
	
	
	String company;
	String model;
	String color;
	int maxspeed;
	
	Car car; // 다른클래스로 만든 객체도 필드로 사용가능 --> 필드는 객체로도 쓰임

}
