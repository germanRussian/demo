import java.util.Scanner;

/**
 * 국영수 성적처리프로그램을 작성하세요. 국영수 총합 국영수 평균 배열을 활용한 성적 처리 방법
 * 
 * @author smart9
 *1차원 배열
 */
public class ArrayExam6 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		int[] Score = new int[5];
		//System.out.println(Score.length);
		
		System.out.println("국어성적을 입력하세요.");
		Score[0] = Scan.nextInt();
		System.out.println("영어성적을 입력하세요.");
		Score[1] = Scan.nextInt();
		System.out.println("수학성적을 입력하세요.");
		Score[2] = Scan.nextInt();
		
		Score[3] = Score[1] + Score[2] + Score[3];
		Score[4] = Score[3] / 3;

		System.out.printf("국어:%d, 영어:%d, 수학:%d", Score[0], Score[1], Score[2]);
		System.out.println();
		System.out.printf("총점:%d, 평균:%d", Score[3], Score[4]);

	}

}
