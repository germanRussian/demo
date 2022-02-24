import java.util.Scanner;

/**
 * 2차원 배열 데이터타입[][] 변수
 * 
 * @author smart9
 *
 */
public class ArrayExam8 {

	public static void main(String[] args) {
		int[][] A = new int[2][3];//세로 가로
		A[0][0] = 10;
		A[0][1] = 20;
		A[0][2] = 30;

		A[1][0] = 40;
		A[1][1] = 50;
		A[1][2] = 60;
		// System.out.println(A.length);
		// System.out.println(A[3].length);
		for (int i = 0; i < A.length; i++) {						//세로
			for (int j = 0; j < A[0].length; j++) {					//가로
				System.out.println(A[i][j]);
			}

		}

	}
}
//중첩 for문 작성(별 만들기와 같은 원리)
