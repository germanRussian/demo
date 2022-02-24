
public class SmartPhoneExam2 {

	public static void main(String[] args) {
		//객체선언 및 생성
		//new 객체생성하면 sp(객체)를 인스턴스화한다.
		SmartPhone sp = new SmartPhone();

		//객체초기값
		//속성 : 객체명.속성
		sp.caseColor = "white";
		
		//객체값출력
		System.out.println("휴대폰 색상:" + sp.caseColor);
		System.out.println("전화번호:" + sp.phoneNumber);
		//객체메소드호출
		sp.takingPictures();
		sp.makeACall("010-4940-5474");
		sp.playApp("카카오톡");
		//가비지컬랙션호출
		//참조 연결이 끊긴다. 연결이 끊기면 메모리에서 삭제된다. 
		//이걸 하면 메모리 누수를 막을 수 있다. 
		sp = null;
		System.gc();
	}

}
