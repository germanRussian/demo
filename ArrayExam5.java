/**
 * 국영수 성적처리프로그램을 작성하세요. 국영수 총합 국영수 평균 배열을 활용한 성적 처리 방법
 * 1차원 배열
 * @author smart9
 *
 */
public class ArrayExam5 {

	public static void main(String[] args) {

		int[] Score = new int[5];
			System.out.println(Score.length);
			
			
		Score[0] = 50;
		Score[1] = 80;
		Score[2] = 90;
		Score[3] = Score[1] + Score[2] + Score[3];
		Score[4] = Score[3] / 3;

		
		System.out.printf("국어:%d, 영어:%d, 수학:%d", Score[0], Score[1], Score[2]);
		
		
		System.out.printf("총점:%d, 평균:%d", Score[3], Score[4]);

	}

}
