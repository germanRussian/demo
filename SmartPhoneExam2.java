
public class SmartPhoneExam2 {

	public static void main(String[] args) {
		// 객체선언
		SmartPhone sp = null;

		// 객체생성
		sp = new SmartPhone(); // SmartPhone()디폴트생성자
		// 객체초기값
		// 속성 : 객체명. 속성
		sp.caseColor = "spacegrey";
		sp.PhoneNumber = "123456789";

		// 객체값출력
		System.out.println("휴대폰색상 : " + sp.caseColor);
		System.out.println("휴대폰 번호 : " + sp.PhoneNumber);

		// 객체메소드호출
		sp.TakingPictures();
		sp.makeACall("123456789");

		// 가비지콜렉션호출
		sp = null;
		System.gc();

	}

}
