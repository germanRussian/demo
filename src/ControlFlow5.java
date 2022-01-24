/**
 * 성적처리프로그램을 작성하시오. 취득점수가 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 70점 미만이면 F,를 출력하시오
 * if, switch를 이용하여 각각 프로그램 하시오.
 * 
 * @author smart9
 *
 */
public class ControlFlow5 {

	public static void main(String[] args) {
		int i = 90;
		if (i >= 90) {
			System.out.println("A");
		}
		else if (i >= 80) {
			System.out.println("B");
		}
		else if (i >= 70) {
			System.out.println("C");
		} else if (i >= 60) {
			System.out.println("D");
		} else if (i < 60) {
			System.out.println("F");
		}
	}
}
