/**
 * for 문 369를 출력하세요.
 * 3의 배수일때는 짝이라고 출력하세요.
 * System.out.println("짝")
 */
public class Loop17 {
	public static void main(String[] args) {

		for (int a = 1; a < 51; a++) {

			if (a % 3 == 0) {
				
				System.out.print(" 짝");
				continue;//continue 문을 만나면 반복문을 벗어난다.
			}
			System.out.print(" " + a);

		}
	}
}