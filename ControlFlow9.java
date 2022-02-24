
public class ControlFlow9 {
// 제어문 홀짝 확인 프로그램을 작성하시오
	// system.out.println("[DEG]"+a)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		System.out.println("[DEG]" + a);
		System.out.println("[DEG]" + (a % 2 == 0));
		if (a % 2 == 0) {
			System.out.println("짝수입니다.");
		} else if (a % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		// else if(a%2 != 0) {System.out.println("홀수입니다.");
		// else {System.out.println("홀수입니다.");
	}
}
