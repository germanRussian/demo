/**
 * ★ ★★ ★★★ ★★★★ ★★★★★ 위에 별을 표시해 보시오
 */
public class Loop_11 {
	public static void main(String[] args) {

		int a;
		int b;
		int c = 5;
		b = 0;
		while ( b < 5) {
			c--;
			 b++;
			 a = 5;
			while ( a > c) {
				System.out.print("*");
				a--;
			}
			System.out.println();

		}
	}
}

// syso = System.out.println();
