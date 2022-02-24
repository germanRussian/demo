
public class ControlFlow11 {
//제어문 가위 바위 보 게임, 선언 방식 활용

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int User1 = 1;
		int User2 = 2;
		// 1(가위), 2(바위), 3(보)
		
		if ( User1 + 1 == User2 || User2 + 2 == User1) {
			System.out.println("User 1 이김");
			}
		else if( User2 + 2 == User1 || User1 + 1 == User2) {
			System.out.println("User 2 이김");
			}
		else {
			System.out.println("비김");
		}
}
}

//&& 함수 주의
//위는 9가지 경우의 수를 만들어 표현하는 방식
//1-3-9 경우의 수를 만듦수도 있음.(반복문)
//두가지 방법의 차이는 코딩이 보기가 좋은가 아닌가 차이.
//switch 가능