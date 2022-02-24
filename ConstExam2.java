import java.awt.Color;

public class ConstExam2 {

	public static void main(String[] args) {
		Const.a = 10;
		Const.a = 20;
		Const.print(0);
		System.out.println(Color.red);
		//자주쓰는 것을 static으로 선언 후 red로 색을 줬다.
		System.out.println(Math.abs(-10));
	}

}