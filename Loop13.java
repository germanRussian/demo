/**
 * 알파벳 A to Z를 출력하시오
 */
public class Loop13 {
	public static void main(String[] args) {

		int a = 0;
		for (int b = 65; b < 91; b++) {
			char c = (char) b;
			System.out.print(" " + c);
		}

		System.out.println();
		System.out.println("------------------------------------------------------");

		for (int b = 97; b < 123; b++) {
			char c = (char) b;

			System.out.print(" " + c);
		}

		System.out.println();
		System.out.println("------------------------------------------------------");

		char i = 'A';
		for (char j = 'A'; j <= 'Z'; j++) {
			i = j;
			System.out.print(" " + i);
		}
		System.out.println();
		System.out.println("------------------------------------------------------");

		char h = 'a';
		for (char j = 'a'; j <= 'z'; j++) {
			h = j;
			System.out.print(" " + h);
		}
		System.out.println();
		System.out.println("------------------------------------------------------");

	}
}

// syso = System.out.println();
