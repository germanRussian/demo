import java.util.Iterator;

//반복문
//for(초기값; 조건문; 증감식) {수행문}
//while(조건문){수행문, 증감식}
//do{수행문; 증감문;} while(조건문);
/**
 * 2022년 달력을 출력하시오.
 */
public class Loop_6 {

	public static void main(String[] args) {
		int b = 1;
		while (b <= 12) {
			System.out.println(b + "월");
			b++;

			int lastDayOfMonth = 0;
			switch (b) {

			case 1:

			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDayOfMonth = 31;
				break;
			case 2:
				lastDayOfMonth = 28;
				break;

			default:
				lastDayOfMonth = 30;
				break;
			}

			int a = 1;
			while (a <= lastDayOfMonth) {
				System.out.print(a + " ");
				a++;

			}
			System.out.println();
		}
	}
}

//중첩 for문
//누적합 마지막 값만 구해짐 마지막 System이 중괄호 안이냐에 따라 결과가 다름.
//syso = System.out.println();