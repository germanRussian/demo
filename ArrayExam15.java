import java.util.Iterator;

/**
 * 주어진 배열의 항목에서 최솟값을 구해보세요.( for문을 이용하세요) {-1,5,3,8,2} 결과값은 -1
 * 
 * @author smart9
 *
 */
public class ArrayExam15 {

	public static void main(String[] args) {
		int min = 0;

		int[] a = { -1, 5, 3, 8, 2 };
		for (int b = 0; b < 5; b++) {
			if (a[b] <= min) {
				min = a[b];           //치환하기
			}
			
			// System.out.println(A[i]);
		}
		System.out.println("min:" + min);

	}

}


//if문의 작동 방식을 생각해볼 것