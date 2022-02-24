import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

//반복문
//for(초기값; 조건문; 증감식) {수행문}
//while(조건문){수행문, 증감식}
//do{수행문; 증감문;} while(조건문);
/**
 * 현재 시간을 출력하세요
 */
//컴퓨터의 시간을 가져오는 것.
public class Loop_8 {
	public static void main(String[] args) {

		while (true) {

			LocalDateTime ldt = LocalDateTime.now();
			System.out.print(ldt.getHour() + ":");
			System.out.print(ldt.getMinute() + ":");
			System.out.println(ldt.getSecond());

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

//중첩 for문
//누적합 마지막 값만 구해짐 마지막 System이 중괄호 안이냐에 따라 결과가 다름.
//syso = System.out.println();