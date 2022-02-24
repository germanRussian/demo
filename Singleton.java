
public class Singleton {
	private static Singleton a = new Singleton();

	private Singleton() {

	}
	
	static Singleton getInstance() {
		return a;
	}
	//getinstance 호출만 가능
	//이것이 바로 캡슐화이다.
}
