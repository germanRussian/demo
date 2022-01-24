
public class Operator2 {

	public static void main(String[] args) {
		// +연산자 문자열을 연결해주는 연산자
		System.out.println('1' + 1);// ''는 char 문자(아스키코드)
		System.out.println("2" + 1);// 문자와 문자를 붙여줌
		// 우선순위
		System.out.println("1" + 1 + 2 + 3);
		System.out.println("1" + (1 + 2 + 3));
		// 변수선언
		int i, j, k;
		// 대입우선순위
		i = j = k = 5;

	}

}
