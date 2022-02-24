/**
 * 성적처리프로그램 만들기.
 * 
 * 
 * @author smart9
 *
 */
public class StructureExam4 {
	//구조체란 다양한 데이터 타입을 한곳으로 모아 처리하는 것을 가능하게 한다.
	//구조체를 사용할때는 도트를 사용한다.
	// 멤버변수, 필드
	String stdName;
	int coding;

	public static void main(String[] args) {
		
		//int []coding = new int[3];
		StructureExam4 [] se = new StructureExam4[3];//최우선 되는 구조체를 형성한다.
		
		
		
		StructureExam4 se0 = new StructureExam4();
		se0.stdName = "홍";
		se0.coding = 100;
		se[0] = se0;
		//System.out.println(se0.stdName + " 의 코딩성적은 " + se0.coding + "점 입니다.");
		
		
		StructureExam4 se1 = new StructureExam4();
		se1.stdName = "이";
		se1.coding = 90;
		se[1] = se1;
		//System.out.println(se1.stdName + " 의 코딩성적은 " + se1.coding + "점 입니다.");
		
		
		StructureExam4 se2 = new StructureExam4();
		se2.stdName = "박";
		se2.coding = 80;
		se[2] = se2;
		//System.out.println(se2.stdName + " 의 코딩성적은 " + se2.coding + "점 입니다.");
		
		
		
		System.out.println(se[0].stdName + " 의 코딩성적은 " + se[0].coding + "점 입니다.");
		System.out.println(se[1].stdName + " 의 코딩성적은 " + se[1].coding + "점 입니다.");
		System.out.println(se[2].stdName + " 의 코딩성적은 " + se[2].coding + "점 입니다.");
		
		
		
		
		
	}

}
