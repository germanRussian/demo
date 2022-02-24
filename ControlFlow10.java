
public class ControlFlow10 {
//제어문 가위 바위 보 게임

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	// int a = 1; // User1(본인)
		int a = (int) (Math.random() * 3) + 1;
		// int b = 2; // User2(상대방),
		int b = (int) (Math.random() * 3) + 1;
		//1(가위), 2(바위), 3(보)

		if (a == 1) {
			System.out.println("User 1 가위");
		}
		else if (a == 2) {
			System.out.println("User 1 바위");
		}
		else if (a == 3) {
			System.out.println("User 1 보");
		}

		if (b == 1) {
			System.out.println("User 2 가위");
		}
		else if (b == 2) {
			System.out.println("User 2 바위");
		}
		else if (b == 3) {
			System.out.println("User 2 보");
		}

		if (a == 1 && b == 1) {
			System.out.println("비김");
		} else if (a == 1 && b == 2) {
			System.out.println("짐");
		} else if (a == 1 && b == 3) {
			System.out.println("이김");
		} else if (a == 2 && b == 1) {
			System.out.println("이김");
		} else if (a == 2 && b == 2) {
			System.out.println("비김");
		} else if (a == 2 && b == 3) {
			System.out.println("짐");
		} else if (a == 3 && b == 1) {
			System.out.println("이김");
		} else if (a == 3 && b == 2) {
			System.out.println("짐");
		} else if (a == 3 && b == 3) {
			System.out.println("비김");

		}
	}
}

//&& 함수 주의
//위는 9가지 경우의 수를 만들어 표현하는 방식
//1-3-9 경우의 수를 만듦수도 있음.(반복문)
//두가지 방법의 차이는 코딩이 보기가 좋은가 아닌가 차이.
//switch 가능