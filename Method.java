/**
 * 
 * @author smart9
 *
 */
public class Method {
	public static void aaa() {//aaa라는 함수를 수행한다. 결과값은 아래의 값을 출력
		
		System.out.println("aaa()함수가 호출되었습니다.");
		bbb();
	}    

	public static void bbb() {//bbb라는 함수를 수행한다. 결과값은 아래의 값을 출력, (Void)리턴값은 없기때문에 그냥 결과값만 출력
		System.out.println("bbb()함수가 호출되었습니다.");
	}
	public static void main(String[] args) {
		// 메인 메소드 메인 함수다, 가장 최초 시작의 함수.
		aaa();//aaa라는 함수를 수행하라
		
	}

}
