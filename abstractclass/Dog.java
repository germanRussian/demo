package abstractclass;

public class Dog extends Animal {

	public Dog () {
	}
	public Dog (String kind) {
		super(kind);
	}

	@Override
	public void sound() {
		System.out.println("개소리");
		
	}


}
