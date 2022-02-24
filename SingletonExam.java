
public class SingletonExam {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		if (s1 == s2) {
			System.out.println("같은  singleton 객체 입니다.");
		} else {
			System.out.println("다른 singleton 객체 입니다.");
		}

	}

}


//웹상에서 중복 로그인 확인으로 쓰인다.