/**
 * 계산기 프로그램을 작성하시오 임의의 두수를 입력받아 + - * / %를 수행하시오 출력값은 a+b = (ab)
 *리턴값이 주어진다.
 * @author smart9
 *
 */
public class Method7 {

	private static int add(int a, int b) {
		return a + b;

	}

	private static int reminger(int a, int b) {
		// TODO Auto-generated method stub
		return a % b;
	}

	private static int divide(int a, int b) {
		// TODO Auto-generated method stub
		return a / b;
	}

	private static int by(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	private static int minus(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	public static void main(String[] args) {
		int a = 9;
		int b = 2;

		int res = add(a, b);       // 더하기
		int res1 = minus(a, b);    // 빼기
		int res2 = by(a, b);       // 곱하기
		int res3 = divide(a, b);   // 나누기
		int res4 = reminger(a, b); // 나머지
		double res6 = divides(a,b);
		
		
		
		System.out.println(a + " + " + b + " = " + res);
		System.out.println(a + " - " + b + " = " + res1);
		System.out.println(a + " x " + b + " = " + res2);
		System.out.println(a + " / " + b + " = " + res3);
		System.out.println(a + " % " + b + " = " + res4);
		
		System.out.println(a + " / " + b + " = " + res6);
	}

	private static double divides(int a, int b) { 
		// TODO Auto-generated method stub
		return (double)a/b;
	}

}
