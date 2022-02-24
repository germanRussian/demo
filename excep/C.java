package excep;

public class C {
	public static void main(String[] args) {
		B b = new B();
		try {
			b.throwsMathod();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
