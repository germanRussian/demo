
public class variable7 {

	public static void main(String[] args) {
		char A = 'A';
		char B = 'B';
		// start

		char C = A;
		A = B;
		B = C;

		// end
		/**
		 * A값은 'B', B값은 'A'
		 */
		//변수란, 하나의 값을 저장할 수 있는 메모리 공간이다.
		//

		System.out.println("A   =   " +  A);
		System.out.println("B   =   " +  B);
		System.out.println("완\t성");
		}

}