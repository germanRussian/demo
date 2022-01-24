
public class Operator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 대입연산자(=, +=, -=, *=, /=, %=, ...)
		int x = 1, y = 2;
		x += y; x = x + y;
		System.out.println(x);
		
		//삼항연산자(조건문)? 참: 거짓;
		//시험 성적이 60점 미만이면 재시험, 이상이면 패스.
		int score = 70;
		String str = (60>score)?"재시험":"패스";
		System.out.println(str);
		
	}

}
