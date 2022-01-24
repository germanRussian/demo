import java.util.Iterator;

//반복문
//for(초기값; 조건문; 증감식) {수행문}
//while(조건문){수행문, 증감식}
//do{수행문; 증감문;} while(조건문);
/**
 * 2022년부터 본인의 생년까지 반복해서 출력해보세요
 */
public class Loop_4 {

	public static void main(String[] args) {

		int myAge = 1992;
		int a = 2022;
		while ( a >= 1992) {

			// System.out.println(a);
			System.out.printf("%d년도, %d나이 %n", a, a - (1992 - 1));// 나이 표시
			a--;
		}
	}

}
//누적합 마지막 값만 구해짐 마지막 System이 중괄호 안이냐에 따라 결과가 다름.
//syso = System.out.println();