package abstractclass;

public class Ham extends Animal {

	public Ham(String kind) {
		super(kind);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sound() {
		System.out.println("쥐소리");
	}

}
