/**
 * for문 1부터 10까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하세요
 * 
 */
public class Loop18 {
	public static void main(String[] args) {

		int b = 0;
		for (int a = 1; a < 11; a++) {

			if (a % 3 == 0) {
				b = b + a;
				
			}

		}
		System.out.println(" " + b);
	}
}