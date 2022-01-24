/**
 * 알파벳 A to Z를 출력하시오
 */
public class Loop_13 {
	public static void main(String[] args) {

		int a = 0;
		int b = 65;
		while ( b < 91 ) {
			char c = (char) b;
			System.out.print(" " + c);
			b++;
		}
		
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------");

	
		char i = 'A';
		char j = 'A';
		while ( j <= 'Z') {
			i = j;
			System.out.print(" " + i);
			 j++;
		}

		
	}
}

// syso = System.out.println();
