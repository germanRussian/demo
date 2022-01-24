import java.util.Scanner;

/**
 * 2차원 배열 데이터타입[][] 변수
 * 
 * @author smart9
 *
 */
public class ArrayExam9 {

	public static void main(String[] args) {
		int[][] a = { 
					{1,2,3},
					{4,5,6}
				}; // 중괄호 두개 사용
		
		
		for (int b = 0; b < a.length; b++) {						//세로
			for (int c = 0; c < a[0].length; c++) {					//가로
				System.out.println(a[b][c]);
			}
			
		}
	}
}

//중첩 for문 작성(별 만들기와 같은 원리)
