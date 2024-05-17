package java_0513_ch06;

public class Student {
	
	public Student() { // 기본생성자
		super(); // 부모 클래스의 생성자 호출, but 있으나 마나
	}
		// 다 넣은거랑 모두 들어간 것은 다씀
		// 무조건 만드는 경우가 많음
	
		public Student(String name) {
		super();
		this.name = name;
	}

	public Student(String name, String hakbun) {
		super();
		this.name = name;
		this.hakbun = hakbun;
	}

	public Student(String name, String hakbun, int age) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
	}

	public Student(String name, String hakbun, int age, String grade) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
		this.grade = grade;
	}

	public Student(String name, String hakbun, int age, String grade, String address) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
		this.grade = grade;
		this.address = address;
	}

	String name;
	String hakbun;
	int age;
	String grade;
	String address;
		
	// 꼭 리턴값이 있어도 되는 것이 아님
	public void printName() { // 리턴ㄴ값이 없는 메소드
		System.out.println("학생이름"+ this.name);
	}
}
