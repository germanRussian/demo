/**
 * for문 1부터 10까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하세요 출력결과 : 3+6+9+=18를 3+6+9=18로
 * 변경하시오
 */
public class Loop20 {
	public static void main(String[] args) {

		int b = 0;
		int c = 10;
		for (int a = 1; a <= c; a++) {

			if (a % 3 == 0) {
				b= b+a;
				System.out.print(a);
				if (a != (c - (c % 3))) {
				System.out.print(" + ");
			}
		}
		

	}System.out.println(" = " + b);

}
}
//if(a>=(c-2) && a%3==0) {syso a+"+"}
//else if(a%# ==0){syso a+"=" b+=a;}