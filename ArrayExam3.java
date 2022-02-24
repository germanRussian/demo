/**
 * 배열은 반복문과 같이 사용해줘야한다.
 * 1차원 배열
 * @author smart9
 *
 */
public class ArrayExam3 {

	public static void main(String[] args) {
		// ArrayExam a = new ArrayExam();
		// System.out.println(a);

		int[] a = { 10, 20, 30 }; //배열 선언과 동시에 초기값 입력
		// int[] a = new int[] {10,20,30};
		for (int b = 0; b < 3; b++) {
			System.out.println(a[b]);
		}

	}

}
