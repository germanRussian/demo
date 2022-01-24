
public class Operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감연산자 ++, --
		int i = 0;
		i++;
		System.out.println(++i);

		// 부정연산자 !
		boolean b = false;
		System.out.println(!b);

		// 비교연산자 >, >=, <, <=, ==(같음?), !=(같지않음?), 결과는 boolean타입
		int m = 10, n = 5;
		System.out.println(m > n);
		System.out.println(m < n);
		System.out.println(m == n);
		System.out.println(m != n);

		// 논리연산자(and[&&], or[||], not[!], xor[?])
		// 0(false), 1(true)
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(false || true);
		System.out.println(true || true);
		System.out.println("------------------");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println("------------------");
		// 비트 연산자 &(and), |(or), ~(not), ^(xor), <<, >>, >>>,
		byte bitNum1 = 15;
		byte bitNum2 = 20;
		System.out.println(bitNum1 + bitNum2);
		System.out.println(bitNum1 & bitNum2);
		System.out.println(bitNum1 | bitNum2);
		System.out.println(bitNum1 ^ bitNum2);
		System.out.println(~bitNum2);
		System.out.println("------------------");
		System.out.println(bitNum2 << 1);
		System.out.println(bitNum2 >> 1);
		System.out.println(bitNum2 >>> 1);
		//

	}

}
