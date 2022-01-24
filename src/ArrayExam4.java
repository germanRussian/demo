/**
 * 국영수 성적처리프로그램을 작성하세요. 국영수 총합 국영수 평균
 * 변수 선언을 활용한 성적 처리 방법
 * @author smart9
 *1차원 배열
 */
public class ArrayExam4 {

	public static void main(String[] args) {

		int K = 0; //국어
		int E = 0; //영어
		int M = 0; //수학
		int T = 0; //총합
		int A = 0; //평균

		K =50;
		E = 80;
		M =90;     //각과목 점수
		T = K+E+M; //총합
		A = T/3;   //평균

		System.out.printf("국어:%d, 영어:%d, 수학:%d", K,E,M);
		System.out.printf("총점:%d, 평균:%d", T,A);

	}

}
