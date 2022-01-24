import java.util.Iterator;

//반복문
//for(초기값; 조건문; 증감식) {수행문}
//while(조건문){수행문, 증감식}
//do{수행문; 증감문;} while(조건문);
/**
 * .1부터 10까지의 합의 계산과정을 출력하세요.
 */
public class Loop_2 {

	public static void main(String[] args) {

		int b = 0;
		int a = 1;
		while ( a <= 100) {
			b = b + a;
			System.out.println(b);
			a++;

		}
	}

}
//누적합 구하기 계산과저