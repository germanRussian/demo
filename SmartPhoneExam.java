
public class SmartPhoneExam {

	public static void main(String[] args) {
		//객체선언
		SmartPhone sp = null;
		//객체생성
		//SmartPhone() 디폴트생성자
		sp = new SmartPhone();
		//객체초기값
		//속성 : 객체명.속성
		sp.caseColor = "white";
		
		//객체값출력
		System.out.println("휴대폰 색상:" + sp.caseColor);
		//객체메소드호출
		sp.takingPictures();
		//가비지컬랙션호출
		//참조 연결이 끊긴다. 연결이 끊기면 메모리에서 삭제된다. 
		//이걸 하면 메모리 누수를 막을 수 있다. 
		sp = null;
		System.gc();
	}

}
