
public class ConstExam {

	public static void main(String[] args) {

		// 생성자
		Const c = new Const();// 디폴트 생성자.
		Const c1 = new Const(10, "abc");
		
		c.a = 10;
		c1.a = 20;
		System.out.println(c.a);
		System.out.println(c1.a);

//		c.print(10);
//		c.print(10.8);
//		c.print("한글");
//		c.print(10, 11.2, "한글123");
	}

}
