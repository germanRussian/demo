/**
 * 
 * @author smart9
 *
 */
public class ArrayExam13 {

	public static void main(String[] args) {

		// A메모리 주소를 B 주소로 사용할 수 있다~~~
		int[] A = new int[3];

		A[0] = 1;
		A[1] = 2;
		A[2] = 3;

		int[] B = null;// 참조형 기본값 아예 없다.(null), 다 소진 했다.(zero)
		B = A;
		A = null;// 연결이 끊어져 쓰레기값을 가진다.

		System.gc();// 알아서 쓰레기값을 프로그램이 제거해준다.
		// System.out.println(A[1]);
		System.out.println(B[2]);

	}

}
