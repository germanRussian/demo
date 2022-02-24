package abstractclass;

public class Cat extends Animal {

	public Cat () {
	}
	
	public Cat (String kind) {
		super(kind);
	}

	@Override
	public void sound() {
		System.out.println("고양이 소리");

	}

}
