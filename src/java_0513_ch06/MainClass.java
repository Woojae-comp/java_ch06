package java_0513_ch06;

public class MainClass {

	public static void main(String[] args) {

		Calculator cal1 = new Calculator();
		// ** Calculator 클래스로 new 연산자를 사용하여 cal1 객체를 생성 **
		// ram에 cal1이라는 메모리가 생성된 것임
		// 생성자 호출

		// Calculator cal2 = new Calculator();
		
		double a;
		a = cal1.div(300, 200);
		System.out.println(a);
		// 자동으로 만들어진 object 클래스의 상속을 받음
		
		int b;
		b = cal1.pow(2);
		System.out.println(b);

		// 메모리를 만들어진 것은 instance라고 함, 그러나 instance = 객체라고 함
		Car car = new Car(4); 
		
		String c = car.color;
		System.out.println(c);

		System.out.println(car.company);
		System.out.println(car.speed);
		
		car.speed = 150;
		System.out.println(car.speed+"km");
		
		int firstprice = car.price[0];
		int secondprice = car.price[1];
		
		System.out.println(); // [I@3af49f1c --> 주소값이 찍힘 
		System.out.println(firstprice + secondprice);
		System.out.println(car.tire);
		
        Car2 myCar = new Car2("기아", "K5", "회색", 200);
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxspeed);
		
	
		Car2 myCar2 = new Car2("기아", "K5", "회색");
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);

		Car2 myCar5 = new Car2(); 
		// 생략 처리 했을 경우 에러가 남 --> 현재 생략하지 않음
				
		int w = (int) cal1.div(10, 3); // casting
		double x = cal1.div(10, 3);

		// java 배우기는 좋으나 고급으로 가려면 조금 거시기 함
		// method는 소문자로 해야함
		
		
		Test test = new Test();
		int[] arrTest = {1,2,3,4,5};
		test.sum1(arrTest);
		test.sum2(car);
		
		System.out.println(); // printlnmethod에 오버로딩 되어 있는 것임
		// object X는 아무거나 넣어도 됨
		
		
		// 예제 p291
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		Woker woker1 = new Woker("홍길동", 27, "01063440086", "서울 용산구");
		
	}
}
