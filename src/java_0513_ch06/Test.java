package java_0513_ch06;

public class Test {

	public int sum1(int[] values) { // 들어가는 값이 int array 
		return 10;
		
	}
	public int sum2(Car car) {
		return 10;
	}
	
	public int sum3(int a) {
		if(a > 10) {
			return 10;
		}else {
			return 100;
		}
	}
	
	int a = sum3(10);  // 클래스 내부에서도 메소드 호출 가능

	public void sum4(int a) {
		if(a > 10) {

		}else {
			return;
		}
	}
}


	// return 이 없는 경우 void
	// 각각 return으로 해줘야함
	// 매개변수 type 바꾸면 이름을 갖게 해도 메소드를 정의를 할 수 있음
	// 객체지향의 특성