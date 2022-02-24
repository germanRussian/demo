import java.util.Iterator;

//반복문
//for(초기값; 조건문; 증감식) {수행문}
//while(조건문){수행문, 증감식}
//do{수행문; 증감문;} while(조건문);
/**
 * .1부터 10까지의 합의 계산과정을 출력하세요.
 */
public class Loop_3 {

	public static void main(String[] args) {

		int b = 0;
		int a = 1;
		while (a <= 100) {
			b = b + a;

			a++;

		}
		System.out.println(b);
	}
}
//누적합 마지막 값만 구해짐 마지막 System이 중괄호 안이냐에 따라 결과가 다름.