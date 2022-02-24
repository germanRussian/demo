/**
 * 성적처리프로그램 만들기.
 * 
 * 
 * @author smart9
 *
 */
public class StructureExam3 {

	// 멤버변수, 필드
	String stdName;
	int coding;

	public static void main(String[] args) {
		StructureExam3 se0 = new StructureExam3();
		se0.stdName = "홍";
		se0.coding = 100;
		System.out.println(se0.stdName + " 의 코딩성적은 " + se0.coding + "점 입니다.");
		
		
		StructureExam3 se1 = new StructureExam3();
		se1.stdName = "이";
		se1.coding = 90;
		System.out.println(se1.stdName + " 의 코딩성적은 " + se1.coding + "점 입니다.");
		
		
		StructureExam3 se2 = new StructureExam3();
		se2.stdName = "박";
		se2.coding = 80;
		System.out.println(se2.stdName + " 의 코딩성적은 " + se2.coding + "점 입니다.");
		
		
		//구조체를 사용할때는 도트를 사용한다.
		
		
	}

}
