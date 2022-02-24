
public class Variable6_Test {

	public static void main(String[] args) {
		int A = 10;
		int B = 20;
		// start

		int C = A;
		A = B;
		B = C;

		// end
		/**
		 * A값은 20, B값은 10
		 */

		System.out.println("A값은" + A);
		System.out.println("B값은" + B);
	}

}