/**
 * 계산기 프로그램을 작성하시오 임의의 두수를 입력받아 + - * / %를 수행하시오
 * 출력값은 a+b = (ab)
 * 리턴값이 없다.
 * @author smart9
 *
 */
public class Method6 {
	
	private static void reminger(int a, int b) {
		// TODO Auto-generated method stub
		
		System.out.println(a + " % " + b + " = " + (a % b));

	}

	private static void divide(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a + " / " + b + " = " + (a / b));
	}

	private static void by(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a + " x " + b + " = " + (a * b));
	}

	private static void minus(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a + " - " + b + " = " + (a - b));
	}

	private static void add(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));

	}

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		add(a, b);
		minus(a, b);
		by(a, b);
		divide(a, b);
		reminger(a, b);

	}

}
