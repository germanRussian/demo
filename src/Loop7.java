import java.util.Iterator;

//반복문
//for(초기값; 조건문; 증감식) {수행문}
//while(조건문){수행문, 증감식}
//do{수행문; 증감문;} while(조건문);
/**
 * 현재 시간을 출력하세요
 */
public class Loop7 {
//1초에 한번씩 발생하도록 만들것임 cpu의 처리를 늦게 하는 것.
	public static void main(String[] args) {

		int h = 14;
		int m = 32;
		int sec = (60 * 60 * h) + (60 * m);
		// System.out.println(sec);//전체 초

		for (int a = 0; a < 10; a++) {

			sec++;

			System.out.print((sec) / (60 * 60) + "시");// 시
			System.out.print(((sec) % (60 * 60)) / 60 + "분");// 분
			System.out.println(((sec) % (60 * 60)) % 60 + "초");// 초
			try {
				Thread.sleep(1000); // 1000이 1초를 의미.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

//중첩 for문
//누적합 마지막 값만 구해짐 마지막 System이 중괄호 안이냐에 따라 결과가 다름.
//syso = System.out.println();