import java.util.Iterator;

//반복문
//for(초기값; 조건문; 증감식) {수행문}
//while(조건문){수행문, 증감식}
//do{수행문; 증감문;} while(조건문);
/**
 * 2022년 1월달 일자를 출력하시오. (1월 / 1~31일)
 */
public class Loop_5 {

	public static void main(String[] args) {

		int a = 1;
		while ( a <= 31) {

			System.out.println(("1월" + a) + ("일"));
			 a++;
		}
	}

}
//누적합 마지막 값만 구해짐 마지막 System이 중괄호 안이냐에 따라 결과가 다름.
//syso = System.out.println();