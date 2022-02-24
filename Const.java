
public class Const {

	// 필드 생성
	static int a;
	String b;

	// 디폴트 생성자
	public Const() {
		//this(10, "abc");
		this("abc",10);
		System.out.println("아래 다른 생성자 호출에 에러가 납니다.");
	}

	public Const(int a, String b) {
		this.a = a;
		this.b = b;
	}

	public Const( String b,int a) {
			this.a = a;
			this.b = b;
		// 객체 내부에서 인스턴스 멤버에 접근하기 위해서 this 사용.
		// 클릭 만으로도 생성자를 만들 수 있다.
		// 마우스 우클릭 소스 (슈퍼클래스 && 필드 사용)
		// 웹에서는 사용 안한다.
		// 웹에서는 getter, setter에서 사용.

	}

	
	// 오버로딩
	public Const(int a) {
		this.a = a;
	}

	public Const(String b) {
		this.b = b;
	}

	static static void print(int i) {
		System.out.println("출력값 INT : " + i);
	}

	void print(double i) {
		System.out.println("출력값 double : " + i);
	}

	void print(String i) {
		System.out.println("출력값 String : " + i);
	}

	public void print(int i, double d, String s) {
		/*
		 * ==, equals, instanceof(객체 내에서 생성된 것을 찾는다.)
		 * 오버로딩 : 같은 함수명을 사용한다.
		 * 매개변수의 수가 다르거나, 타입이 다르면 사용할 수 있다.
		 * 매개변수의 수가 같고, 타입의 순서가 같지 않을 때 사용할 수 있다.
		 * (int i, double d, String s)
		 * (int s double d, String i) - 0
		 * (int i, double d, String s) - x
		 */
		print(i); print(d); print(s);
		
//		if(Integer.valueOf(i) instanceof Integer);{
//			print(i);
//		}
//		if(Double.valueOf(d) instanceof Double);{
//			print(d);
//		}
//		if(s instanceof String);{
//			print(s);
//		}
		
//		System.out.println("출력값 INT : " + i);
//		System.out.println("출력값 double : " + d);
//		System.out.println("출력값 String : " + s);
	}

}
