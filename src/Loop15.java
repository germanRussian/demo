/**
 * for 문 + break 문 추가
 */
public class Loop15 {
	public static void main(String[] args) {

		for (int a = 0; a < 10; a++) {

			// a값이 5이면 멈춰라
			if (a == 5) {
				break;
			}
			System.out.println(a);
		}
	}
}
