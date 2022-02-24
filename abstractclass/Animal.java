package abstractclass;

//추상 클래스(animal), 속에 추상 메소드(Sound) 삽입


public abstract class Animal {
	
	public String kind;
	public Animal () {
	}
	public Animal(String kind) {
		super();
		this.kind = kind;
	}

	public void brathe() {
		System.out.println("숨을 쉽니다.");

	}

	public abstract void sound();//추상 메소드
}
