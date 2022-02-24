/**
 * ★ ★★ ★★★ ★★★★ ★★★★★ 위에 별을 표시해 보시오
 */
public class Loop11 {
	public static void main(String[] args) {

		int a;
		int b;
		int c = 5;
		for (b = 0; b < 5; b++) {
			c--;

			for (a = 5; a > c; a--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}

// syso = System.out.println();
