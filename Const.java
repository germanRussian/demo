
public class Const {
	// 필드
	static int a;
	//static = 공통된 변수  
	//int a; => a = 10으로 나옴
	String b;

	// 디폴트생성자 void
	public Const() {
		this(10, "abc");
		//↓이것을 this 바로 아래에 적어야 한다. this가 밑으로 가면 에러 뜸 
		System.out.println("아래 다른 생성자호출에 에러가 난다.");
		//생성자에서 다른 생성자를 호출할 때 this를 쓴다. 
		//값만 맞으면 쓸 수 있다. 
	}

	public Const(int a, String b) {
		this.a = a;
		this.b = b;
		// this. => 필드 초기화
	}

	public Const(String b, int a) {
		this.a = a;
		this.b = b;
	}
	// 순서 달라도 상관x

	public Const(int a) {
		this.a = a;
	}

	public Const(String b) {
		this.b = b;
	}

	static void print(int i) {
		System.out.println("출력값 INT: " + i);
		//static 제거하면 10,20 값이 출력 된다. 
	}

	void print(double i) {
		System.out.println("출력값 DOUBLE: " + i);
	}

	void print(String i) {
		System.out.println("출력값 String: " + i);
	}

	public void print(int i, double d, String s) {
		/*
		 * ==, equals, instanceof(현재 클래스에서 만들어진 객체냐) 
		 * 오버로딩 : 같은 함수명을 사용한다. 
		 * 매개변수의 수가 다르거나,타입이 다르면 사용할 수 있다. 
		 * 매개변수의 수가 같으면 타입의 순서가 다르면 사용할 수 있다.
		 * ex)
		 * public void print(int i, double d, String s) 
		 * public void print(String s, double d, int i) 
		 * 이렇게는 쓸 수 있다. 순서가 같으면 오류뜸 
		 */
		if (Integer.valueOf(i) instanceof Integer)
			;
		{
			print(i);
		}
		if (Double.valueOf(d) instanceof Double)
			;
		{
			print(d);
		}
		if (s instanceof String)
			;
		{
			print(s);
		}

		// if문 다 주석처리 하고 print(); 만 남겨놔도 오버로딩이 된 상태라 다 출력된다.
	}

//	public Const() {}
//	
//	public Const(int a, String b) {
//		this.a = a;
//		this.b = b;
//	}

//오른쪽 클릭 -> source -> superclass or fields 누르면 자동으로 디폴트 생성

}
