
public class SmartPhoneExam3 {

	public static void main(String[] args) {
		//객체선언 및 생성
		//new 객체생성하면 sp(객체)를 인스턴스화한다.
		SmartPhone sp = new SmartPhone(null,null,null,null,"010-4940-5474");
		//객체 생성 동시에 객체값은 줌. smartphone을 ctrl+클릭하면 값이 대입된 곳으로 이동 
		SmartPhone sp2 = new SmartPhone();

		//객체초기값
		//속성 : 객체명.속성
		sp.caseColor = "white";
		sp2.caseColor = "black";
		
		//객체값출력
		System.out.println("SP휴대폰 색상:" + sp.caseColor);
		System.out.println("SP전화번호:" + sp.phoneNumber);
		System.out.println("SP2휴대폰 색상:" + sp2.caseColor);
		System.out.println("SP2전화번호:" + sp2.phoneNumber);
		
		
		//가비지컬랙션호출
		//참조 연결이 끊긴다. 연결이 끊기면 메모리에서 삭제된다. 
		//이걸 하면 메모리 누수를 막을 수 있다. 
		sp = sp2 = null;
		System.gc();
	}

}
