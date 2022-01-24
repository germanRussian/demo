import java.util.Iterator;

//반복문
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for(초기값; 조건문; 증감식) {수행문}
//while(조건문){수행문, 증감식}
//do{수행문; 증감문;} while(조건문);
		/**
		 * for문 1부터 10까지 출력하세요.
		 */
		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}

		System.out.println("------------------------");

		for (int a = 0; a < 10; a++) {
			System.out.println(a + 1);
		}

		System.out.println("------------------------");

		for (int i = 10; i >=1; i--) {
			System.out.println(i);
			
		}
		}

}
