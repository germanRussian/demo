/**
 * 성적처리프로그램 만들기.
 * 함수
 * 구조체를 사용할때는 도트를 사용한다.
 * 
 * @author smart9
 *
 */
public class StructureExam6 {

	// 멤버변수(필드), 이러한 것들이 구성되어진다는 것을 적어주는 것.
	String stdName;
	int coding;

	public static void main(String[] args) {
		
		StructureExam6 se0 = new StructureExam6();
		se0.stdName = "홍";
		se0.coding = 100;
		print(se0); //print라는 함수를 만들었다.
		
		
		StructureExam6 se1 = new StructureExam6();
		se1.stdName = "이";
		se1.coding = 90;
		print(se1);
		
		StructureExam6 se2 = new StructureExam6();
		se2.stdName = "박";
		se2.coding = 80;
		print(se2);
		
	}

	private static void print(StructureExam6 se) {
		System.out.println(se.stdName + " 의 코딩성적은 " + se.coding + "점 입니다.");
		
	}

}
