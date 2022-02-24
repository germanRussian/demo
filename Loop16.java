/**
 * for 문 + continue 문 추가
 */
public class Loop16 {
	public static void main(String[] args) {

		for (int a = 0; a < 10; a++) {

			// a값이 5이면 넘어가라
			//if (a == 5)
			//짝수만 출력하세요
			//나머지가 1이면 홀수이니 그냥 지나가버려라
			if(a%2 ==1){
				continue;
				
			}
			System.out.println(a);
		}
	}
}
