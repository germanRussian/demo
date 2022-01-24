//반복문
//for(초기값; 조건문; 증감식) {수행문}
//while(조건문){수행문, 증감식}
//do{수행문; 증감문;} while(조건문);
/**
 * for 문 복습 2022-01-14 금 오전 수업
 */
public class Loop_9 {
	public static void main(String[] args) {

		int b = 0; // 짝수 합
		int c = 0; // 홀수 합
		int a = 1;
		while ( a <= 10) {
			 a++;
			if (a % 2 == 0) {
				b += a;
			}
			if (a % 2 != 0) {
				c += a;
			}

		}
		System.out.println("짝수 총합 :" + b);
		System.out.println("홀수 총합 :" + c);
		System.out.println("--------------");
		System.out.println("전체 총합 :" +(b+c));
	}
}
//syso = System.out.println();