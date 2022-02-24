package abstractclass;

public class Smartphone extends Phone {
	// 생성자
	public Smartphone(String owner) {
		super(owner);
	}

	// 메소드
	public void internetSearch() {
		System.out.println("인터넷을 검색합니다.");
	}

	@Override
	public void call() {
		System.out.println("전화 왔다");
	}

}
